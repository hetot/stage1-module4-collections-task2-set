package com.epam.mjc.collections.set;

import java.security.cert.TrustAnchor;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (int num : sourceList) {
            if (num % 2 == 0) {
                while (num % 2 == 0) {
                    if (result.contains(num))
                        break;
                    result.add(num);
                    num /= 2;
                }
                result.add(num);
            } else {
                result.add(num);
                result.add(num * 2);
            }
        }
        return result;
    }
}
