public class Tester {
    public static void main(String[] args){
        String name = "HermAN";
        Missions.exStringManipulation(name);
        System.out.println("-------------------------------------------------\n");
        Missions.exCheckString("Ooblie Booblie", "Herman is super mega shega gay");
        System.out.println("-------------------------------------------------\n");
        TaskManager taskManager = new TaskManager();
        Task task = new Task("DOLOLOLOLOLOLD", true);
        Task elseTask = new Task("lololololololololol", false);
        Task elseElseTask = new Task("herman", true);
        taskManager.add(task);
        taskManager.add(elseTask);
        taskManager.add(elseElseTask);
        System.out.println(taskManager.manage(taskManager.getFilteredTasks));
        System.out.println(taskManager.manage(taskManager.setNotComplete));
        System.out.println(taskManager.manage(taskManager.removeHerman));


        System.out.println("\n-------------------------------------------\n");

        Missions.printMaxNumber();
    }
}
