package task2;

import task1.Task;

import java.util.ArrayList;

public final class Queue implements Container {
    private final ArrayList<Task> queue = new ArrayList<>();

    @Override
    public Task pop() {
        return queue.remove(0);
    }

    @Override
    public void push(Task task) {
        queue.add(task);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void transferFrom(Container container) {
        while(!container.isEmpty()) {
            this.push(container.pop());
        }
    }

    @Override
    public ArrayList<Task> getTasks() {
        return queue;
    }
}
