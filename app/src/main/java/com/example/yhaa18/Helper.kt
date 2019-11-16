package com.example.yhaa18

import android.content.Context
import android.graphics.Typeface


    class Helper(context: Context) {
        val ankaFont = Typeface.createFromAsset(context.assets, "fonts/anka.ttf")
        val danaFont = Typeface.createFromAsset(context.assets, "fonts/dana.otf")
        val shulikFont = Typeface.createFromAsset(context.assets, "fonts/shmulik.ttf")
        val stamFont = Typeface.createFromAsset(context.assets, "fonts/stam.ttf")
        val drugFont = Typeface.createFromAsset(context.assets, "fonts/drug.ttf")
        val shofarFont = Typeface.createFromAsset(context.assets, "fonts/drug.ttf")
        fun getTypeFace(ind: Int)=
            when {
                ind == 0 ->  Typeface.SANS_SERIF
                ind == 1 ->  ankaFont
                ind == 2 ->  danaFont
                ind == 3 ->  shulikFont
                ind == 4 ->  stamFont
                ind == 5 ->  drugFont
                ind == 6 ->  shofarFont
                else ->  Typeface.MONOSPACE
            }
    }