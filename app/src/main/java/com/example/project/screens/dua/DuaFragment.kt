package com.example.project.screens.dua

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project.CustomAdapter
import com.example.project.DetailedPage
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

        zikrList.add(Zikr("İstiğfar", "Astağfirullah", "أَسْتَغْفِرُ اللّٰهَ", "Astağfirullah"))
        zikrList.add(Zikr("Subhanallah", "Subhanallah", "سُبْحَانَ ٱللَّٰهِ" , "Subhanallah"))
        zikrList.add(Zikr("Alhamdulillah", "Alhamdulillah", "ٱلْحَمْدُ لِلَّٰهِ" , "Alhamdulillah"))
        zikrList.add(Zikr("Allahu akbar", "Allahu akbar", "اللّٰهُ أَكْبَر", "Allahu akbar"))
        zikrList.add(Zikr("İstiğfar", "Astagfirullah va atubu iläihi", "أَسْـتَـغْـفِـرُ اللهَ وَ أَ تُـوبُ إِ لَـْيهِ","Astagfirullah va atubu iläihi" ))
        zikrList.add(Zikr("Zikr", "Subhanallahi ua bihamidihi","سُبْحَانَ اللَّهِ وَبِحَمْدِهِ سُبْحَانَ اللَّهِ الْعَظِيمِ","SubhanAllah va bihamdihi subhanAllahi Azym"))
        zikrList.add(Zikr("Zikr", "Lä haulä ua lä kuvvata illä billäh","لا حول ولا قوة إلا باللهِ","Lä haulä ua lä kuvvata illä billäh"))
        zikrList.add(Zikr("Zikr", "Hasbunallahu ua ni'mäl-uakil","حَسْبُنَا اللَّهُ وَ نِعْمَ الْوَ كِيلُ","Hasbunallahu ua ni'mäl-uakil"))
        zikrList.add(Zikr("Kalima", "Lä İläha illä llah, Muhammadur — rasuulüllah","لآ اِلَهَ اِلّا اللّهُ مُحَمَّدٌ رَسُوُل اللّهِ","Lä İläha illä llah, Muhammadur — rasuulüllah"))
        zikrList.add(Zikr("Аta-anaña duğa", "Rabbi-rhamhuma kama rabbaiani sağiran","رَبِّ ارْحَمْهُمَا كَمَا رَبَّيَانِي صَغِيرًا","Rabbi-rhamhuma kama rabbaiani sağiran"))
        zikrList.add(Zikr("Duğa", "Rabbana atina fi-ddunä...","رَبَّنَا آتِنَا فِىْ الدُّنْيَا حَسَنَةً وَفِىْ الآخِرَةِ حَسَنَةً وَّقِنَا عَذَابَ النَّارِ","Robbana atina fi-ddunä hasanatan va fil-ahirati hasanatan va qina 'azaba-nnar\n"))


        customAdapter = CustomAdapter(zikrList)
        recyclerView.adapter = customAdapter

        customAdapter.itemClickListener = {
            val intent = Intent(this.context, DetailedPage::class.java)
            intent.putExtra("item", it)
            startActivity(intent)
        }
        // Inflate the layout for this fragment
        return view
    }

}