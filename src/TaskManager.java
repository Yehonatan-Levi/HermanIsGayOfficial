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


    ChecksAndUpdates getFilteredTasks = tasks ->
    {
        ArrayList<Task> filtered = new ArrayList<Task>();
        for (Task task : tasks) {
            if (task.getIsComplete() || task.getName().charAt(0) == 'D') {
                filtered.add(task);
            }
        }
        return filtered;
    };

    ChecksAndUpdates setNotComplete = tasks ->
    {
        ArrayList<Task> updated = new ArrayList<Task>();
        for (Task task : tasks) {
            if (task.getIsComplete() && (task.getName().charAt(0) == task.getName().charAt(task.getName().length() - 1) || task.getName().lastIndexOf('c') != -1)) {
                task.setIsComplete(false);
                updated.add(task);
            }
        }
        return updated;
    };

    ChecksAndUpdates removeHerman = tasks ->
    {
        ArrayList<Task> noHomo = new ArrayList<>();
        for (Task task : tasks){
            if (!task.getName().equals("herman")){
                noHomo.add(task);
            }
        }
        return noHomo;
    };

    public ArrayList<Task> manage(ChecksAndUpdates requirement) {
        return requirement.filter(this.tasks);
    }


}
