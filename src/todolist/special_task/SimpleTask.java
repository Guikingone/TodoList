package todolist.special_task;

import todolist.Task;

/**
 * Created by Guillaume on 20/05/2016.
 */
public class SimpleTask extends Task {

    public SimpleTask(String label)
    {
        super(label);
    }

    @Override
    public String toString()
    {
        String done;

        if(isDone())
            done = "(effectuée)";
        else
            done = "(à faire)";
        return "Tâche simple : " + getLabel() + " " + done;
    }
}
