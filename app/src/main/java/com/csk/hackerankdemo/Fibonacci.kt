package com.csk.hackerankdemo

/**
 * Created by Chandra Kant on 7/16/21.
 */
//Question 1.
object Fibonacci {
    fun printFibonacci(n: Int) {
        for (i in 0 until n) {
            print(fib(i).toString() + " ")
        }
    }

    // Recursive call
    private fun fib(n: Int): Int {
        return if (n <= 1) n else fib(n - 1) + fib(n - 2)
    }
}
