package com.csk.hackerankdemo;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Chandra Kant on 7/16/21.
 */
@RequiresApi(api = Build.VERSION_CODES.N)
public class FeatureProduct {
    public static String findMax(List<String> productList) {
        List<String> list = new ArrayList<String>();

        Map<String, Long> collect = productList.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        int max = collect.values().stream().mapToInt(Math::toIntExact).filter(stringLongEntry -> stringLongEntry >= 0).max().orElse(0);
        collect.entrySet().forEach(stringLongEntry -> {
            if (stringLongEntry.getValue() == max) {
                list.add(stringLongEntry.getKey());
            }
        });

        return list.stream().sorted().collect(Collectors.toList()).get(list.size() - 1);


    }
}
