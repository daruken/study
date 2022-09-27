package org.example.study.string;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Split {
    public List<Integer> splitString(@NotNull String str) {
        return splitAndConvertInt(str);
    }

    private List<Integer> splitAndConvertInt(@NotNull String str) {
        List<Integer> list = new ArrayList<>();

        String[] strArray = str.split(",");
        for (String s : strArray) {
            list.add(Integer.parseInt(s));
        }

        return list;
    }
}
