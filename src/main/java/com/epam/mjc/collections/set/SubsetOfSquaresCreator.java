package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> set = new TreeSet<Integer>();
        for (Integer item : sourceList) {
            set.add((int)Math.pow(item, 2));
        }

        return set.subSet(lowerBound, true, upperBound, true);
    }
}
