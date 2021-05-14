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

        val apple = CustomWord(R.drawable.apple, "苹果", "りんご")
        val orange = CustomWord(R.drawable.orange, "橙子", "オレンジ")
        val grape = CustomWord(R.drawable.grape, "葡萄", "ぶどう")
        val strawberry = CustomWord(R.drawable.strawberry, "草莓", "いちご")
        val wordArray = arrayOf(
                apple, orange, grape, strawberry
        )

        for (i in wordArray) {
            addWord(i)
        }
    }

    private fun addWord(word: CustomWord) {
        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)

        val nameTextView = TextView(this)
        nameTextView.text = word.name

        val japaneseTextView = TextView(this)
        japaneseTextView.text = word.japanese

        val layout = LinearLayout(this.applicationContext)
        layout.orientation = LinearLayout.HORIZONTAL

        layout.addView(imageView)
        layout.addView(nameTextView)
        layout.addView(japaneseTextView)

        container.addView(layout)
    }
}