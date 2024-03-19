package com.example.grocery

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.grocery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: GroceryAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        initial()

    }

    private fun initial() {
        recyclerView = binding.recyclerView2
        adapter = GroceryAdapter()
        recyclerView.adapter = adapter
        adapter.setList(myGrocery())
    }

    private fun myGrocery(): ArrayList<Grocery> {
        val grocList = ArrayList<Grocery>()

        val grocery1 = Grocery(R.drawable.fruit, "Fruits", "Fresh from the Garden")
        grocList.add(grocery1)

        val grocery2 = Grocery(R.drawable.vegitables, "Vegetables", "Delicious Vegetables")
        grocList.add(grocery2)

        val grocery3 = Grocery(R.drawable.bread, "Bakery", "Bread, Wheat and Beans")
        grocList.add(grocery3)

        val grocery4 = Grocery(R.drawable.beverage, "Beverage", "Juice, Tea, Coffee and \n Soda")
        grocList.add(grocery4)

        val grocery5 = Grocery(R.drawable.milk, "Milk", "Milk, Shakes and Yogurt")
        grocList.add(grocery5)

        val grocery6 = Grocery(R.drawable.popcorn, "Snacks", "Pop Corn, Donut\nand Drinks")
        grocList.add(grocery6)

        return grocList
    }
}