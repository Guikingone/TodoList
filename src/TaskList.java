/**
 * Definition of a task list
 *
 * Created by Guillaume on 20/05/2016.
 */
public class TaskList {

    public Task[] tasks = new Task[10];
    public int nbTasks = 0;

    /**
     * Affichage d'une liste de tâches sous forme de chaînes de caractères
     *
     * @return List of the task and her state
     */
    public String toString()
    {
        String result = "";

        for(int i = 0; i < nbTasks; i++){
            result += i + 1 + "/" + nbTasks + ": " + tasks[i] + "\n";
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
        if(nbTasks == 10)
            return false;
        else
            tasks[nbTasks++] = newTask;
            return true;
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
        Task newTask = new Task(label);
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
    public Boolean taskDone(int idTask)
    {
        if((idTask < 0) || (idTask >= nbTasks))
            return false;
        else
            tasks[idTask].isDone();
            return true;
    }
}
