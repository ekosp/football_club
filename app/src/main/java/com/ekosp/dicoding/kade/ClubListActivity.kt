package com.ekosp.dicoding.kade

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.ekosp.dicoding.kade.adapter.RecyclerViewAdapter
import com.ekosp.dicoding.kade.helper.Config
import com.ekosp.dicoding.kade.model.ClubItem
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.singleTop

class ClubListActivity : AppCompatActivity() {

    private var items: MutableList<ClubItem> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        club_list.layoutManager = LinearLayoutManager(this)
        club_list.adapter = RecyclerViewAdapter(this, items) {
            startActivity(intentFor<ClubDetailActivity>(Config.PARAM_CLUB_DATA to it).singleTop())
        }

    }

    private fun initData() {
        val name = resources.getStringArray(R.array.club_name)
        val image = resources.obtainTypedArray(R.array.club_image)
        val decription = resources.getStringArray(R.array.club_description)
        items.clear()
        for (i in name.indices) {
            items.add(ClubItem(name[i],
                    image.getResourceId(i, 0),
                    decription[i]))
        }

        //Recycle the typed array
        image.recycle()
    }

}
