package com.ekosp.dicoding.kade.ui

import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext

/**
 * Created by eko on 16/10/18.
 * Email : eko.purnomo@salt.co.id
 */
class ClubListUI : AnkoComponent<ViewGroup> {

    companion object {
        val tvTitleId = 1
        val tvYearId = 2
    }

    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui){
        verticalLayout {

        }
    }
}