package task2;

import task1.Task;

import java.util.ArrayList;

interface Container {
    Task pop();

    void push(Task task);

    int size();

    boolean isEmpty();

    void transferFrom(Container container);

    ArrayList<Task> getTasks();
}
