package com.example.orxanimtahan

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.orxanimtahan.databinding.FragmentInfoBinding
import com.example.orxanimtahan.databinding.UserInfoBinding

class UserInfoAdapter(val list: ArrayList<User>)
    :RecyclerView.Adapter<UserInfoAdapter.UserViewHolder>(){
    inner class UserViewHolder(val userInfoBinding: UserInfoBinding):RecyclerView.ViewHolder(userInfoBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view=UserInfoBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return UserViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
val info=list[position]
        holder.userInfoBinding.textViewInfo.text=info.nameWork
        holder.userInfoBinding.imageViewOnem.setImageResource(info.foto)
        if(info.secim==true){
            holder.userInfoBinding.textViewAlert.text="Son Gun !!!"
        }
        holder.userInfoBinding.constreintLayout.setOnClickListener{
            Navigation.findNavController(it).navigate(HomeFragmentDirections.actionHomeFragmentToInfoFragment(info))
        }
    }
}