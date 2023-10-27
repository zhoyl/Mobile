package com.example.myapplication

data class state(val title:String, val text_state:String,val image_state:Int)
class MyState
{
    val state_list = arrayListOf(state("Заголовок статьи", "Краткое описание", R.drawable.state222),
    state("Заголовок блока", "Краткое описание",R.drawable.state222),
        state("Заголовок блока", "Краткое описание",R.drawable.state222)
    )
}
