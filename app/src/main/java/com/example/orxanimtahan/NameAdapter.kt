package com.example.orxanimtahan

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.orxanimtahan.databinding.CustomDialogBinding
import com.example.orxanimtahan.databinding.ItemCardBindingBinding
import org.w3c.dom.Text

class NameAdapter(val listText: ArrayList<String>):RecyclerView.Adapter<NameAdapter.NameViewHolder>() {
inner class NameViewHolder(val itemCardBinding:ItemCardBindingBinding) :RecyclerView.ViewHolder(itemCardBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {

        val view=ItemCardBindingBinding.inflate(LayoutInflater.from(parent.context),parent,false)
return NameViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listText.size
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
val text=listText[position]
        holder.itemCardBinding.textView2.text=text
    }

}