package com.ekosp.dicoding.kade.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by eko on 16/10/18.
 * Email : eko.purnomo@salt.co.id
 */

@Parcelize
data class ClubItem (val name: String?, val image: Int?, val description: String?): Parcelable