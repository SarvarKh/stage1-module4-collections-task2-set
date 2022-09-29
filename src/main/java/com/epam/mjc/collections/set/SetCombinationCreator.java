package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCombinationCreator {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Set.of("Apple", "Samsung", "Netflix"));
        Set<String> set2 = new HashSet<>(Set.of("LG", "Toshiba", "HP", "Google", "Lenovo", "Amazon", "Netflix"));
        Set<String> set3 = new HashSet<>(Set.of("Apple", "Toshiba", "Microsoft", "FaceBook", "Samsung", "Lenovo", "HP"));

        SetCombinationCreator setCombinationCreator = new SetCombinationCreator();
        setCombinationCreator.createSetCombination(set1, set2, set3);
    }

    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>();

        Iterator<String> iterator = firstSet.iterator();
        while (iterator.hasNext()) {
            String nextItem = iterator.next();
            if (secondSet.contains(nextItem) &&
                    !thirdSet.contains(nextItem)) {
                resultSet.add(nextItem);
            }
        }

        Iterator<String> i = thirdSet.iterator();
        while (i.hasNext()) {
            String nextI = i.next();
            if (!firstSet.contains(nextI) && !secondSet.contains(nextI)) {
                resultSet.add(nextI);
            }
        }
        return resultSet;
    }
}
