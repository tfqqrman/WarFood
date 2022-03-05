package com.example.warfoodsubmission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFoodAdapter(private val listFood:ArrayList<Food>):RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>(){
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvFoodName: TextView = itemView.findViewById(R.id.tv_food_name)
        var tvFoodDetail: TextView = itemView.findViewById(R.id.tv_food_detail)
        var tvFoodHarga: TextView = itemView.findViewById(R.id.tv_food_harga)
        var ivFoodPhoto: ImageView = itemView.findViewById(R.id.img_food_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_food,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]
        Glide.with(holder.itemView.context)
                .load(food.pic)
                .apply(RequestOptions().override(100,100))
                .into(holder.ivFoodPhoto)

        holder.tvFoodName.text = food.name
        holder.tvFoodDetail.text = food.detail
        holder.tvFoodHarga.text = food.price
    }

    override fun getItemCount(): Int {
        return listFood.size
    }
}