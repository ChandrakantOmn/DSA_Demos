package com.csk.hackerankdemo

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.util.*

@RequiresApi(Build.VERSION_CODES.N)
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        question1()
        question2()
        question3()
        question4()
    }

    private fun question4() {
        val s = "abcabcd"
        val n = s.length
        println(CommonPrefixLength.sumSimilarities(s, n))
    }

    private fun question3() {
        val list: MutableList<String> = ArrayList()
        list.add("redShirt")
        list.add("greenPants")
        list.add("redShirt")
        list.add("orangeShoes")
        list.add("blackPants")
        list.add("blackPants")
        print(FindFeaturedProduct.findMax(list))
    }

    private fun question2() {
        val matrix = arrayOf(
            intArrayOf(1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 0, 0),
            intArrayOf(1, 1, 1, 0, 0),
            intArrayOf(1, 1, 1, 0, 0),
            intArrayOf(1, 1, 1, 1, 1)
        )
        MaxiSizeSquare.printMaxiSizeSquare(matrix)
    }

    private fun question1() {
        Fibonacci.printFibonacci(10)
    }

}