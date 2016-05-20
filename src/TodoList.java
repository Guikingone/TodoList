/**
 * Created by Guillaume on 20/05/2016.
 */
public class TodoList {

    public static void main(String[] args) {
        TaskList list = new TaskList();

        list.addTask("Test");
        list.addTask("Test 2");

        System.out.println(list);
    }
}
