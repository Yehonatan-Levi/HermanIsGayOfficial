import java.util.ArrayList;

public class TaskManager {
    public interface TaskFilter {
        boolean check(Task task);
    }
    private final ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<Task>();
    }

    public void add(Task task) {
        tasks.add(task);
    }

    public ArrayList<Task> filter(TaskFilter condition) {
        ArrayList<Task> filteredTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (condition.check(task)) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }
}


