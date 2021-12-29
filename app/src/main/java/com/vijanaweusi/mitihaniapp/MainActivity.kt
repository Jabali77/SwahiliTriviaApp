package com.vijanaweusi.mitihaniapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vijanaweusi.mitihaniapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Languages>
    lateinit var imageId: Array<Int>
    lateinit var lugha: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imageId = arrayOf(
            R.drawable.annie_spratt_0cgpyigyikm_unsplash,
            R.drawable.annie_spratt_cveoh_jjmee_unsplash,
            R.drawable.annie_spratt_galzdcna5ei_unsplash,
            R.drawable.mpumelelo_macu_l_ynobbdyjk_unsplash,
        )

        lugha = arrayOf(
            "Mtihani wa kwanza",
            "Mtihani wa pili",
            "Mtihani wa tatu",
            "Mtihani wa nne"
        )

        newRecyclerView = binding.rvMain
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Languages>()
        getUserData()
    }

    private fun getUserData() {
        for(i in imageId.indices) {
            val languages = Languages(imageId[i],lugha[i])
            newArrayList.add(languages)
        }

        val adapter = MyAdapter(newArrayList)
        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object: MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                //Toast.makeText(this@MainActivity, "You clicked a category. $position", Toast.LENGTH_SHORT).show()

                val intent = Intent(this@MainActivity, QuizActivity::class.java)
                intent.putExtra("lugha", newArrayList[position].lugha)
                startActivity(intent)
            }

        })
    }
}