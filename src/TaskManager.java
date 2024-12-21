import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    public interface ChecksAndUpdates {
        ArrayList<Task> filter(List<Task> tasks);
    }

    private final ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<Task>();
    }

    public void add(Task task) {
        this.tasks.add(task);
    }

    interface TaskCondition {
        boolean check(Task task);
    }

    private static ArrayList<Task> filterManage(List<Task> tasks, TaskCondition condition, boolean updateTask) {
        ArrayList<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (condition.check(task)) {
                if (updateTask) {
                    task.setIsComplete(false); // Common update logic
                }
                result.add(task);
            }
        }
        return result;
    }

    static ChecksAndUpdates getFilteredTasks = tasks -> filterManage(tasks, task -> task.getIsComplete() || task.getName().charAt(0) == 'D',false);

    static ChecksAndUpdates setNotComplete = tasks -> filterManage(tasks, task -> task.getIsComplete() && (task.getName().charAt(0) == task.getName().charAt(task.getName().length() - 1) || task.getName().lastIndexOf('c') != -1),true);

    static ChecksAndUpdates removeHerman = tasks -> filterManage(tasks, task -> !task.getName().equals("herman"),false);

    public ArrayList<Task> manage(ChecksAndUpdates requirement) {
        return requirement.filter(this.tasks);
    }
}


