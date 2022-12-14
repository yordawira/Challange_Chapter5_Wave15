package com.catty.challange_chapter5_wave15.view.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.catty.challange_chapter5_wave15.R
import com.catty.challange_chapter5_wave15.databinding.FragmentThirdLandingPageBinding
import com.catty.challange_chapter5_wave15.model.user.PlayerWithSerializable
import com.catty.challange_chapter5_wave15.view.activity.MenuActivity

class ThirdLandingPageFragment : Fragment() {
    private lateinit var binding: FragmentThirdLandingPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentThirdLandingPageBinding.inflate(
            layoutInflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getClickListener()
    }

    private fun getClickListener () {
        binding.btnNext.setOnClickListener {
            var isEmptyField = false
            val textToEdit = binding.edtEditName.text.toString().trim()
                .replace("\n","")
                .replace(" ","")
            if (textToEdit.isEmpty()) {
                isEmptyField = true
                binding.edtEditName.error = getString(R.string.empty_field)
            }
            if (!isEmptyField){
                val intent = Intent(context, MenuActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

                val playerSerializable = PlayerWithSerializable(textToEdit)
                intent.putExtra(EXTRA_NAME_SERIALIZABLE, playerSerializable)
                startActivity(intent)
            }
        }
    }

    companion object {
        const val EXTRA_NAME_SERIALIZABLE = "extra_name_serializable"
    }
}