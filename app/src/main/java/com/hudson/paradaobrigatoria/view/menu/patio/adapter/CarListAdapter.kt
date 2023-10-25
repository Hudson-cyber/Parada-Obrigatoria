package com.hudson.paradaobrigatoria.view.menu.patio.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hudson.paradaobrigatoria.R
import com.hudson.paradaobrigatoria.domain.models.AppClient

class CarListAdapter(private val carList: List<AppClient>, private val context: Context) :
    RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.car_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val car = carList[position]
        holder?.let {
            it.plate.text = car.plate
        }
    }
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val plate = itemView.findViewById<TextView>(R.id.txtPlate)!!

}