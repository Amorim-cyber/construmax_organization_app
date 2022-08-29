package com.fiap.mvp_project.model

import android.util.Pair
import android.widget.Button
import androidx.cardview.widget.CardView

class User constructor(var name: String,
                       var tel: String,
                       var tag: String,
                       var img: String,
                       var circles: Array<Pair<CardView, String>>,
                       var buttonObjs: Array<Button>
){




}