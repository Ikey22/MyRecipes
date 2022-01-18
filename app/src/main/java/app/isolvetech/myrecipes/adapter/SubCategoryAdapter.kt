package app.isolvetech.myrecipes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.isolvetech.myrecipes.R
import app.isolvetech.myrecipes.model.Recipes
import kotlinx.android.synthetic.main.item_main_category.view.*
import kotlinx.android.synthetic.main.item_sub_category.view.*

class SubCategoryAdapter: RecyclerView.Adapter<SubCategoryAdapter.RecyclerViewHolder>() {

    var subCatList = ArrayList<Recipes>()
    class RecyclerViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }

    fun setData(arrData: List<Recipes>) {
        subCatList = arrData as ArrayList<Recipes>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_sub_category, parent, false))
    }


    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.itemView.sub_dish_name.text = subCatList[position].dishName
    }


    override fun getItemCount(): Int {
        return subCatList.size
    }
}