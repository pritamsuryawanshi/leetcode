package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        String[] sortedPeople = new Main().sortPeople(names, heights);
        System.out.println(Arrays.toString(sortedPeople));
    }

    //sort people by their heights
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> myMap = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            myMap.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        System.out.println(Arrays.toString(heights));
        for (int i = 0; i < heights.length; i++) {
            names[i] = myMap.get(heights[heights.length - 1 - i]);
        }
        return names;
    }
}