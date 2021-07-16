package com.csk.hackerankdemo

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*
import java.util.stream.Collectors

/**
 * Created by Chandra Kant on 7/16/21.
 */
//Question3
@RequiresApi(Build.VERSION_CODES.N)
object FindFeaturedProduct {
    fun findMax(productList: List<String>): String? {
        val list: MutableList<String> = ArrayList()
        val collect = productList.stream().collect(
            Collectors.groupingBy(
                { s: String? -> s }, Collectors.counting<String>()
            )
        )
        val max1 = collect.values.stream().mapToInt { value: Long ->
            Math.toIntExact(value)
        }.filter { stringLongEntry: Int -> stringLongEntry >= 0 }.max().orElse(0)

        collect.entries.forEach {
            if (it.value == max1.toLong()) {
                it.key?.let { it1 -> list.add(it1) }
            }
        }
        return list.stream().sorted().collect(Collectors.toList())[list.size - 1]

    }

}