package com.example.mad_practical_10_22172012041

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var personlistview:ListView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        personlistview = findViewById<ListView>(R.id.listview)

        val button:Button = findViewById(R.id.fbutton)


    }

    fun setpersondatatolistview()
    {
        personlistview.adapter = PersonAdapter(this, arrayListOf(
            Person("101","Ashish","ashish10@gnu.ac.in","+918469569988","Kevadia Colony",202.652,201.41),
            Person("102","Shrey","shrey@gnu.ac.in","+912563415288","Kevadia Colony",202.2,201.21),
            Person("103","Brijesh","brijesh@gnu.ac.in","+918462563148","Kevadia Colony",202.652,201.21),
            Person("104","Krunal","krunal@gnu.ac.in","+912563984988","Kevadia Colony",202.52,201.41),
            Person("105","Virang","virang@gnu.ac.in","+918456325588","Kevadia Colony",202.152,201.41)


        ))
    }
}