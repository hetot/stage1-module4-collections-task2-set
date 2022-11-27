package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>(firstSet);
        result.retainAll(secondSet);
        result.removeAll(thirdSet);
        Set<String> tmp = new HashSet<>(thirdSet);
        tmp.removeAll(firstSet);
        tmp.removeAll(secondSet);
        result.addAll(tmp);
        return result;
    }
}
