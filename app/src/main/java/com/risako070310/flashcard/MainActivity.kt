package com.risako070310.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apple = Word(R.drawable.apple, "苹果")
        val orange = Word(R.drawable.orange, "橙子")
        val grape = Word(R.drawable.grape, "葡萄")
        val strawberry = Word(R.drawable.strawberry, "草莓")

        addWord(apple)
        addWord(orange)
        addWord(grape)
        addWord(strawberry)
    }

    private fun addWord(word: Word){
        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)

        val nameTextView = TextView(this)
        nameTextView.text = word.name

        val layout = LinearLayout(this.applicationContext)
        layout.orientation = LinearLayout.HORIZONTAL

        layout.addView(imageView)
        layout.addView(nameTextView)

        container.addView(layout)
    }
}