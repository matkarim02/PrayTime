package com.example.project.screens.vremya

import  android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.project.ISalatView
import com.example.project.SalatPresenter
import com.example.project.databinding.FragmentVremyaBinding
import com.example.project.model.Item


class VremyaFragment : Fragment(), ISalatView {
    private var _binding: FragmentVremyaBinding? = null
    private val binding: FragmentVremyaBinding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentVremyaBinding.inflate(inflater, container, false);
         SalatPresenter(this).getDataFromApi("Almaty")
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
    override fun onDataCompleteFromApi(salat: Item) {
         binding.fajr.text = salat.fajr
         binding.zuhr.text = salat.dhuhr
        binding.asr.text = salat.asr
        binding.Isha.text = salat.isha
        binding.magrib.text = salat.maghrib
    }

    override fun onDataErrorFromApi(throwable: Throwable) {
      error("error ------> ${throwable.localizedMessage}")

    }


}