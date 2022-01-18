package app.isolvetech.myrecipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import app.isolvetech.myrecipes.adapter.MainCategoryAdapter
import app.isolvetech.myrecipes.adapter.SubCategoryAdapter
import app.isolvetech.myrecipes.databinding.ActivityHomeBinding
import app.isolvetech.myrecipes.model.Recipes

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    var mainCategory = ArrayList<Recipes>()
    var subCategory = ArrayList<Recipes>()

    var mainAdapter = MainCategoryAdapter()
    var subAdapter = SubCategoryAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        mainCategory.add(Recipes(1, "Beef"))
        mainCategory.add(Recipes(2, "Chicken"))
        mainCategory.add(Recipes(3, "Dessert"))
        mainCategory.add(Recipes(4, "Lamb"))

        mainAdapter.setData(mainCategory)

        subCategory.add(Recipes(1, "Beef and mustard pie"))
        subCategory.add(Recipes(2, "Chicken pepper soup"))
        subCategory.add(Recipes(3, "Banana pancakes"))
        subCategory.add(Recipes(4, "Bush meat"))

        subAdapter.setData(subCategory)

        binding.rvMainCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvMainCategory.adapter = mainAdapter

        binding.rvSubCategory.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvSubCategory.adapter = subAdapter
    }
}