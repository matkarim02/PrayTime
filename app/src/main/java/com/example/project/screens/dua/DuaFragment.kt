package com.example.project.screens.dua

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project.CustomAdapter
import com.example.project.R
import com.example.project.Zikr


class DuaFragment : Fragment() {
private lateinit var recyclerView: RecyclerView
private lateinit var zikrList: ArrayList<Zikr>
private lateinit var customAdapter: CustomAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dua, container, false)
        recyclerView = view.findViewById<RecyclerView>(R.id.recycler)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this.context)

        zikrList = ArrayList()

        zikrList.add(Zikr("Zikr", "ASDFSAFASFSA"))
        zikrList.add(Zikr("Zikr", "ASDFSAFASFSA"))


        customAdapter = CustomAdapter(zikrList)
        recyclerView.adapter = customAdapter
        // Inflate the layout for this fragment
        return view
    }

}