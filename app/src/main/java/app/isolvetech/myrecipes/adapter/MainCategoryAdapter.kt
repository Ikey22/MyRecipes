package app.isolvetech.myrecipes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.isolvetech.myrecipes.R
import app.isolvetech.myrecipes.model.Recipes
import kotlinx.android.synthetic.main.item_main_category.view.*

class MainCategoryAdapter: RecyclerView.Adapter<MainCategoryAdapter.RecyclerViewHolder>() {

    var catList = ArrayList<Recipes>()
    class RecyclerViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }

    fun setData(arrData: List<Recipes>) {
        catList = arrData as ArrayList<Recipes>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main_category, parent, false))
    }


    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.itemView.tv_dish_name.text = catList[position].dishName
    }


    override fun getItemCount(): Int {
        return catList.size
    }
}