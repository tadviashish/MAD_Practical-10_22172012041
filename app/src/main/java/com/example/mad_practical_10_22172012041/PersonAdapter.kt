package com.example.mad_practical_10_22172012041

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class PersonAdapter(context:Context,val array:ArrayList<Person>):ArrayAdapter<Person>(context,0,array) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.person_item,parent,false)
        val persondata = array.get(position)
        view.findViewById<TextView>(R.id.name).text = persondata.name
        view.findViewById<TextView>(R.id.mobile).text = persondata.phoneno
        view.findViewById<TextView>(R.id.email).text = persondata.emailid
        view.findViewById<TextView>(R.id.addr).text = persondata.address
        return view
    }
}