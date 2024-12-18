public class Task {
    private final String name;
    private boolean complete;

    public Task(String name, boolean complete) {
        this.name = name;
        this.complete = complete;
    }

    public Task(Task object){
        this.name = object.name;
        this.complete = object.complete;
    }

    public boolean isComplete() {
        return this.complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", complete=" + complete +
                '}';
    }
}
