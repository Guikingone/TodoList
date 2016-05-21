package todolist;

import todolist.special_task.RDV;
import todolist.special_task.SimpleTask;

import java.util.ArrayList;

/**
 * Definition of a task list
 *
 * Created by Guillaume on 20/05/2016.
 */

public class TaskList {

    private ArrayList<Task> tasks = new ArrayList<>();

    /**
     * Affichage d'une liste de tâches sous forme de chaînes de caractères
     *
     * @return List of the task and her state
     */
    public String toString()
    {
        String result = "";
        int len = tasks.size();

        for(int i = 0; i < len; i++){
            result += i + 1 + "/" + len + ": " + tasks.get(i) + "\n";
        }
        return result;
    }

    /**
     * Add a task
     *
     * @param newTask
     * @return <ul>
     *     <li> true : the task has been added.</li>
     *     <li> false: the task can't be added.</li>
     * </ul>
     */
    public Boolean addTask(Task newTask)
    {
        return tasks.add(newTask);
    }

    /**
     * Add a task
     *
     * @param label The label of the task
     * @return <ul>
     *     <li> true : the task has been added.</li>
     *     <li> false: the task can't be added.</li>
     * </ul>
     */
    public Boolean addTask(String label)
    {
        SimpleTask newTask = new SimpleTask(label);
        return addTask(newTask);
    }

    /**
     *
     * Add a RDV.
     *
     * @param label
     * @param day
     * @param month
     * @param year
     * @param hours
     * @param minutes
     * @return
     */
    public Boolean addTask(String label, int day, int month, int year, int hours, int minutes)
    {
        RDV newTask = new RDV(label, day, month, year, hours, minutes);
        return addTask(newTask);
    }

    /**
     *
     * Take the task into "make" state
     *
     * @param idTask
     * @return <ul>
     *     <li> true : The task has been make.</li>
     *     <li> false: The task hasn't been made.</li>
     * </ul>
     */
    public Boolean taskDone(int idTask) throws IndexOutOfBoundsException
    {
        if((idTask < 0) || (idTask >= tasks.size()))
            throw new IndexOutOfBoundsException("Erreur !");
        else if (tasks.get(idTask).isDone())
            return false;
        else
            tasks.get(idTask).done();
            return true;
    }
}
