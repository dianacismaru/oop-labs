package tasks;

import java.util.TreeSet;

public final class TreeEvenSet extends TreeSet<Integer> {
    @Override
    public boolean add(Integer integer) {
        if (integer % 2 == 0) {
            super.add(integer);
        }
        return false;
    }
}
