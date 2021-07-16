package com.csk.hackerankdemo

/**
 * Created by Chandra Kant on 7/16/21.
 */
//Question4
object CommonPrefixLength {
    fun sumSimilarities(s: String, n: Int): Int {
        val valueArray = IntArray(n)
        // Compute the Z-array for the given string
        getZarr(s, n, valueArray)
        var total = n
        // Summation of the Z-values
        for (i in 1 until n) total += valueArray[i]
        return total
    }

    private fun getZarr(str: String, n: Int, valueArray: IntArray) {
        var left: Int
        var right: Int
        var k: Int
        // [L, R] make a window which matches with prefix of s
        left = 0.also { right = it }
        for (i in 1 until n) {
            // if i>R nothing matches so we will calculate.
            // Z[i] using naive way.
            if (i > right) {
                right = i
                left = right
                // R-L = 0 in starting, so it will start
                // checking from 0'th index. For example,
                // for "ababab" and i = 1, the value of R
                // remains 0 and Z[i] becomes 0. For string
                // "aaaaaa" and i = 1, Z[i] and R become 5
                while (right < n && str[right - left] == str[right]) right++
                valueArray[i] = right - left
                right--
            } else {
                // k = i-L so k corresponds to number which
                // matches in [L, R] interval.
                k = i - left
                // if Z[k] is less than remaining interval
                // then Z[i] will be equal to Z[k].
                // For example, str = "ababab", i = 3, R = 5
                // and L = 2
                if (valueArray[k] < right - i + 1) valueArray[i] = valueArray[k] else {
                    // else start from R and check manually
                    left = i
                    while (right < n && str[right - left] == str[right]) right++
                    valueArray[i] = right - left
                    right--
                }
            }
        }
    }
}