public class Task {
    String name;
    boolean complete;

    public Task(String name, boolean complete) {
        this.name = name;
        this.complete = complete;
    }

    public boolean isComplete() {
        return this.complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
