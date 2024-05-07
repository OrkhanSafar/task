package com.example.orxanimtahan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.orxanimtahan.databinding.CustomDialogBinding
import com.example.orxanimtahan.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private  var _binding:FragmentHomeBinding?=null
    private  val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentHomeBinding.inflate(inflater,container,false)
        return  binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


binding.textViewOne.text="Hec bir qeyd yoxdur. Zehmet olmasa qeyd elave edin."
binding.buttonElaveEt1.setOnClickListener(){
creatCustomDialog()
    binding.textViewOne.text=""

}



    }


    var array= arrayListOf<User>()

    private fun creatCustomDialog(){
        val dialogBinding=CustomDialogBinding.inflate(layoutInflater)
        val dialog=AlertDialog.Builder(requireContext())
        dialog.setView(dialogBinding.root)

        dialogBinding.buttonDialog.setOnClickListener{

            var secimVacibImage=0
            val secimOnem=dialogBinding.checkBoxSelect.isChecked
            var info=dialogBinding.editTextName.text.toString().trim()

            val secim=dialogBinding.radioGroupSelect.checkedRadioButtonId
            when(secim){
                R.id.radioButtonAz->{
                    secimVacibImage=R.drawable.red
                }
                R.id.radioButtonOrta->{
                    secimVacibImage=R.drawable.yellow
                }
                R.id.radioButtonCox->{
                    secimVacibImage=R.drawable.green
                }
            }
            array.add(User(info,secimOnem,secimVacibImage))

            val users=UserInfoAdapter(array)
            var say=array.size
            binding.infoTablo.layoutManager=LinearLayoutManager(context)
            binding.infoTablo.adapter=users

            binding.textViewSay.text="Qeydlerin sayi: $say"

        }
        dialog.create().show()

        if(array.isEmpty()){

        }



    }


    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}


