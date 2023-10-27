package com.example.myapplication

data class feel(val image:Int, val name_feel:String)

class MyFeel
{
    val list = arrayListOf(feel(R.drawable.calmode,"Cпокойным"),
    feel(R.drawable.relax,"Расслабленным"),
    feel(R.drawable.focus,"Сосредоточенным"),
    feel(R.drawable.anxious,"Взволнованным")
)
}
