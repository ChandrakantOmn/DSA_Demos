package com.csk.hackerankdemo

import kotlin.math.min

/**
 * Created by Chandra Kant on 7/16/21.
 */

// Kotlin Code for Maximum size square
// sub-matrix with all 1s
//Question 2
object MaxiSizeSquare {

    fun printMaxiSizeSquare(matrix: Array<IntArray>) {
        val maxSize = printMaxSubSquare(matrix)
        println(maxSize)
    }


    // method for Maximum size square sub-matrix with all 1s
    private fun printMaxSubSquare(matrix: Array<IntArray>): Int {
        var i = 0
        var j = 0
        val r = matrix.size //no of rows in M[][]
        val c: Int = matrix[0].size //no of columns in M[][]
        val s = Array(r) { IntArray(c) }
        var maxOfS: Int
        var maxI: Int
        var maxJ: Int

        /* Set first column of S[][]*/
        while (i < r) {
            s[i][0] = matrix[i][0]
            i++
        }

        /* Set first row of S[][]*/j = 0
        while (j < c) {
            s[0][j] = matrix[0][j]
            j++
        }

        /* Construct other entries of S[][]*/i = 1
        while (i < r) {
            j = 1
            while (j < c) {
                if (matrix[i][j] == 1) s[i][j] = min(
                    s[i][j - 1],
                    min(s[i - 1][j], s[i - 1][j - 1])
                ) + 1 else s[i][j] = 0
                j++
            }
            i++
        }

        /* Find the maximum entry, and indexes of maximum entry in S[][] */
        maxOfS = s[0][0]
        maxI = 0
        maxJ = 0
        i = 0
        while (i < r) {
            j = 0
            while (j < c) {
                if (maxOfS < s[i][j]) {
                    maxOfS = s[i][j]
                    maxI = i
                    maxJ = j
                }
                j++
            }
            i++
        }
        println("Maximum size sub-matrix is: ")
        i = maxI
        while (i > maxI - maxOfS) {
            j = maxJ
            while (j > maxJ - maxOfS) {
                print(matrix[i][j].toString() + " ")
                j--
            }
            println()
            i--
        }
        return maxOfS
    }

    // Just for testing purpose
    fun testDummyData() {
        val matrix = arrayOf(
            intArrayOf(0, 1, 1, 0, 1),
            intArrayOf(1, 1, 0, 1, 0),
            intArrayOf(0, 1, 1, 1, 0),
            intArrayOf(1, 1, 1, 1, 0),
            intArrayOf(1, 1, 1, 1, 1),
            intArrayOf(0, 0, 0, 0, 0)
        )
        //3

        val matrix2 = arrayOf(
            intArrayOf(0, 1, 1, 0, 1),
            intArrayOf(1, 1, 1, 1, 0),
            intArrayOf(1, 1, 1, 1, 0),
            intArrayOf(1, 1, 1, 1, 0),
            intArrayOf(1, 1, 1, 1, 1),
            intArrayOf(0, 0, 0, 0, 0)
        )
        //4

        val matrix3 = arrayOf(
            intArrayOf(1, 1, 1, 1, 1),
            intArrayOf(1, 1, 1, 0, 0),
            intArrayOf(1, 1, 1, 0, 0),
            intArrayOf(1, 1, 1, 0, 0),
            intArrayOf(1, 1, 1, 1, 1)
        )
        //3
    }

}