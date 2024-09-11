package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aNum = Math.abs(Integer.parseInt(a));
        int bNum = Math.abs(Integer.parseInt(b));
        if (aNum != bNum){
            return aNum - bNum;
        } else {
            return a.compareTo(b);
        }
    }
}
