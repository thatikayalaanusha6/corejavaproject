package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCount {

	public static void main(String[] args) {
int[] arr = {1, 2, 2, 3, 1, 4, 3};
Map<Integer, Integer> m  = new LinkedHashMap<>();

        for (int num : arr) {

            if (m.containsKey(num)) {
                m.put(num, m.get(num) + 1);
            } else {
                m.put(num, 1);
            }
        }

        System.out.println("Frequencies: " + m);
    }

	}


