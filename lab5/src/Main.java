import task1.CounterOutTask;
import task1.OutTask;
import task1.RandomOutTask;
import task1.Task;
import task2.Queue;
import task2.Stack;
import task3.Operation;
import task4.BadAlbum;
import task4.DangerousAlbum;
import task4.Song;
import task4.ThrillerAlbum;

import java.util.Scanner;

public class Main {
    private static final int TASK_NO = 6;
    private static Task[] taskList;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskNum = scanner.nextInt();

        // TODO UNCOMMENT BELLOW LINES TO TEST TASK 1 and TASK 2
        taskList = new Task[TASK_NO];
        taskList[0] = new OutTask("First message task");
        taskList[1] = new RandomOutTask();
        taskList[2] = new CounterOutTask();
        taskList[3] = new OutTask("Second message task");
        taskList[4] = new CounterOutTask();
        taskList[5] = new RandomOutTask();


        switch(taskNum) {
            case 1:
                // TODO UNCOMMENT BELLOW LINES TO TEST TASK 1
                for (Task task : taskList) {
                    task.execute();
                }
                break;

            case 2:
                // TODO UNCOMMENT BELLOW LINES TO TEST TASK 2

                System.out.println("----> Queue");
                Queue q = new Queue();
                for(Task task : taskList) {
                    q.push(task);
                }
                q.pop();
                q.pop();
                for (Task task : q.getTasks()) {
                    task.execute();
                }

                System.out.println("----> Stack");
                Stack s = new Stack();
                for(Task task : taskList) {
                    s.push(task);
                }
                s.pop();
                s.pop();
                for (Task task : s.getTasks()) {
                    task.execute();
                }

                System.out.println("----> Testare metoda transferFrom");
                q.transferFrom(s);

                for (Task task : q.getTasks()) {
                    task.execute();
                }

                System.out.println(s.isEmpty());


                break;

            case 3:
                // TODO UNCOMMENT BELLOW LINES TO TEST TASK 3
                Operation op = new Operation(13);
                op.div(0);
                op.div(1);
                System.out.println(op.getNumber());
                op.mult(2);
                System.out.println(op.getNumber());
                op.minus(3);
                System.out.println(op.getNumber());
                op.plus(7);
                System.out.println(op.getNumber());
                break;

            case 4:
                // TODO UNCOMMENT BELLOW LINES TO TEST TASK 4
                Song song1 = new Song("Bad", 101, "Michael Jackson");
                Song song2 = new Song("Dangerous", 19, "Michael Jackson");
                Song song3 = new Song("Heal the world", 53, "Composer");
                Song song4 = new Song("Thriller", 82, "Michael Jackson" );
                Song song5 = new Song("Beat it", 83, "Michel Jakson");
                Song song6 = new Song("Smooth Criminal", 77, "Composer");

                DangerousAlbum dangerous = new DangerousAlbum();
                dangerous.addSong(song2);
                dangerous.addSong(song3);
                dangerous.addSong(song6);
                System.out.println(dangerous);

                ThrillerAlbum thriller = new ThrillerAlbum();
                thriller.addSong(song4);
                thriller.addSong(song6);
                thriller.addSong(song5);
                System.out.println(thriller);

                BadAlbum bad = new BadAlbum();
                bad.addSong(song1);
                bad.addSong(song6);
                System.out.println(bad);
                break;

        }

    }
}
