package todolist;

/**
 * Created by Guillaume on 20/05/2016.
 */

public class TodoList {

    public static void main(String[] args) {
        TaskList list = new TaskList();

        list.addTask("Test");
        list.addTask("Test_2", 1, 10, 2015, 10, 30);

        System.out.println(list);
    }
}
