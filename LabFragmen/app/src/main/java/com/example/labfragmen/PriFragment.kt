package com.example.labfragmen

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
import com.example.labfragmen.databinding.FragmentPriBinding
class PriFragment : Fragment() {
    private var listener: OneFragmentAction?=null
    private lateinit var binding: FragmentPriBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPriBinding.inflate(inflater,container,false)

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener{
            listener?.onClickFragmentButton()
        }
    }
    override fun onAttach(context: Context){
        super.onAttach(context)
        if(context is OneFragmentAction){
            listener=context
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener=null
    }
}