package com.example.orxanimtahan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.navigation.navArgument
import com.example.orxanimtahan.databinding.FragmentHomeBinding
import com.example.orxanimtahan.databinding.FragmentInfoBinding


class InfoFragment : Fragment() {
    private  var _binding: FragmentInfoBinding?=null
    private  val binding get() = _binding!!
    private val args:InfoFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentInfoBinding.inflate(inflater,container,false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val info=args.info
        binding.textViewQeyd.text="Taskin adi: ${info.nameWork}"
        if(info.foto==R.drawable.red){
            binding.textViewVacib.text="Taskin onemi: Vacib"
        }else if(info.foto==R.drawable.yellow){
            binding.textViewVacib.text="Taskin onemi: Orta"
        }else if(info.foto==R.drawable.green) {
            binding.textViewVacib.text="Taskin onemi: Rahat"
        }
        if (info.secim==true) {
            binding.textViewGun.text="Son gundurmu: Beli"
        }else{
            binding.textViewGun.text="Son gundurmu: Xeyr"
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}