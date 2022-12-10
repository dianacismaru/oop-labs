package tasks;

import java.util.*;

public final class EvenSet extends HashSet<Integer> {
    @Override
    public boolean add(Integer integer) {
        if (integer % 2 == 0) {
            super.add(integer);
        }
        return false;
    }
}
