package com.ekosp.dicoding.kade

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView
import com.ekosp.dicoding.kade.helper.Config
import com.ekosp.dicoding.kade.model.ClubItem
import com.squareup.picasso.Picasso
import org.jetbrains.anko.*

/**
 * Created by eko on 16/10/18.
 * Email : eko.purnomo@salt.co.id
 */
class ClubDetailActivity : AppCompatActivity() {

    lateinit var clubItem: ClubItem
    lateinit var nameTextView: TextView
    lateinit var logoImageView: ImageView
    lateinit var descriptionTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            verticalLayout {
                padding = dip(16)

                logoImageView = imageView().lparams(width = dip(100), height = dip(100)) {
                    gravity = Gravity.CENTER
                }

                nameTextView = textView().lparams(width = wrapContent) {
                    gravity = Gravity.CENTER
                    topMargin = dip(10)
                }

                descriptionTextView = textView().lparams(width = wrapContent) {
                    topMargin = dip(15)
                    leftMargin = dip(15)
                    rightMargin = dip(15)
                }

            }

            val intent = intent
            clubItem = intent.getParcelableExtra(Config.PARAM_CLUB_DATA)
            nameTextView.text = clubItem.name
            descriptionTextView.text = clubItem.description

            Picasso.get().load(clubItem.image!!).into(logoImageView)


        }

}