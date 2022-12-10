package tasks;

import java.util.LinkedHashSet;

public final class LinkedEvenSet extends LinkedHashSet<Integer> {
    @Override
    public boolean add(Integer integer) {
        if (integer % 2 == 0) {
            super.add(integer);
        }
        return false;
    }
}
