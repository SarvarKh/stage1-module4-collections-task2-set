package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new TreeSet<Integer>();
        for (Integer item : sourceList) {
            Integer squareOfItem = (int)Math.pow(item, 2);
            if (lowerBound <= squareOfItem && squareOfItem <= upperBound) {
                set.add(squareOfItem);
            }
        }
        return set;
    }
}
