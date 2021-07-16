package com.csk.hackerankdemo

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*
import java.util.function.Consumer
import java.util.function.Function
import java.util.stream.Collectors

/**
 * Created by Chandra Kant on 7/16/21.
 */
//Question3
object FindFeaturedProduct {
/*
    @RequiresApi(Build.VERSION_CODES.N)
    fun findMax(productList: List<String>): String? {
        val list: MutableList<String> = ArrayList()
        val collect = productList.stream().collect(Collectors.groupingBy<String, String, Any, Long>(
            Function { s: String -> s }, Collectors.counting()
        )
        )
        val max = collect.values.stream().mapToInt { value: Long? ->
            Math.toIntExact(
                value!!
            )
        }.filter { stringLongEntry: Int -> stringLongEntry >= 0 }.max().orElse(0)
        collect.entries.forEach(Consumer { stringLongEntry: Map.Entry<String, Long> ->
            if (stringLongEntry.value == max.toLong()
            ) {
                list.add(stringLongEntry.key)
            }
        })
        return list.stream().sorted().collect(Collectors.toList())[list.size - 1]
    }
*/

}