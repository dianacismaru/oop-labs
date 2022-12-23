package task2;

import java.util.HashSet;
import java.util.List;

public final class TreeImpl<T extends Comparable<T>> implements Tree<T> {
    private Node<T> root;
    private int size;

    public TreeImpl() {
        this.root = null;
        this.size = 0;
    }

    @Override
    public void addValue(T value) {
        root = addValue(root, value);
        size++;
    }

    private Node<T> addValue(Node<T> node, T value) {
        if (node == null) {
            return new Node<>(value);
        }

        int cmp = value.compareTo(node.getValue());
        if (cmp < 0) {
            node.setLeft(addValue(node.getLeft(), value));
        } else if (cmp > 0) {
            node.setRight(addValue(node.getRight(), value));
        }

        return node;
    }

    @Override
    public void addAll(List<T> values) {
        for (T value: values) {
            addValue(value);
        }
    }

    @Override
    public HashSet<T> getValues(T inf, T sup) {
        HashSet<T> hashSet = new HashSet<>();
        getValues(root, inf, sup, hashSet);
        return hashSet;
    }

    private void getValues(Node<T> node, T inf, T sup, HashSet<T> hashSet) {
        if (node == null) {
            return;
        }

        int cmpInf = node.getValue().compareTo(inf);
        int cmpSup = node.getValue().compareTo(sup);

        if (cmpInf >= 0 && cmpSup <= 0) {
            hashSet.add(node.getValue());
        }

        if (cmpInf > 0) {
            getValues(node.getLeft(), inf, sup, hashSet);
        }

        if (cmpSup < 0) {
            getValues(node.getRight(), inf, sup, hashSet);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
