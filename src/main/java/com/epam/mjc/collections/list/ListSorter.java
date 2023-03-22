package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;
import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        
        sourceList.sort(new ListComparator());
        Collections.reverse(sourceList);
        
        System.out.println(sourceList);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        int calculatedA = calc(intA);
        int calculatedB = calc(intB);
        return Integer.compare(calculatedB, calculatedA);
    }

    private int calc(int x) {
        double form = Math.pow(5*x, 2) + 3;
        return (int) form;
    }
}
