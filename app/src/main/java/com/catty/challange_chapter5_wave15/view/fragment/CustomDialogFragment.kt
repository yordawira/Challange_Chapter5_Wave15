package com.catty.challange_chapter5_wave15.view.fragment

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.catty.challange_chapter5_wave15.databinding.FragmentCostumeDialogBinding

class CustomDialogFragment(
    private val closeDialog :()-> Unit,
    private val goToMenu : ()-> Unit,
    name : String,
    result : String
) : DialogFragment() {

    private lateinit var binding: FragmentCostumeDialogBinding
    private var name : String
    private var result : String

    init {
        this.name = name
        this.result = result
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCostumeDialogBinding.inflate(layoutInflater,container,false)
        dialog?.setCancelable(false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        dialog?.window?.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvNameDialog.text = name
        binding.tvTheWinner.text = result
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        binding.btnPlayAgain.setOnClickListener {
            dismiss()
            closeDialog()
        }

        binding.btnBackToMenu.setOnClickListener {
            goToMenu()
        }
    }
}