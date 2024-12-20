public class Task {
    private final String name;
    private boolean isComplete;

    public Task(String name, boolean isComplete) {
        this.name = name;
        this.isComplete = isComplete;
    }

    public boolean getIsComplete() {
        return this.isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", complete=" + isComplete +
                '}';
    }
}
