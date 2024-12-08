import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskManager {
    ArrayList<Task> tasks = new ArrayList<Task>();

    public TaskManager() {

    }

    public void add(Task task){
        this.tasks.add(task);
    }

    public boolean isStartWithD(String name){
        return name.charAt(0) == 'D';
    }

    public interface Checks {
        ArrayList<Task> filter(List<Task> tasks);
    }

    Checks getFilteredTasks = tasks ->
    {
        ArrayList<Task> filtered = new ArrayList<Task>();
        for (Task task : tasks) {
            if (task.isComplete() || isStartWithD(task.getName())){
                filtered.add(task);
            }
        }
        return filtered;
    };

    public ArrayList<Task> filter(Checks filterer){
        return filterer.filter(this.tasks);
    }
}
