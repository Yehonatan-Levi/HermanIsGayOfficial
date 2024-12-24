public class Tester {
    public static void main(String[] args){
        String name = "HermAN";
        Missions.exStringManipulation(name);
        System.out.println("-------------------------------------------------\n");
        Missions.exCheckString("Ooblie Booblie", "Herman is super mega shega gay");
        System.out.println("-------------------------------------------------\n");
        TaskManager taskManager = new TaskManager();
        Task taskDol = new Task("DOLOLOLOLOLOLD", true);
        Task taskLol = new Task("lololololololololol", false);
        Task taskHerm = new Task("herman", true);
        taskManager.add(taskDol);
        taskManager.add(taskLol);
        taskManager.add(taskHerm);

        TaskManager.TaskFilter isStartsWithD = task -> {return task.getName().charAt(0) == 'D';};
        TaskManager.TaskFilter isIdenticalFirstAndLastDigits = task -> {return task.getName().charAt(0) == task.getName().charAt(task.getName().length()
                - 1);};
        TaskManager.TaskFilter isEndWithC = task -> {return task.getName().charAt(task.getName().length() - 1) == 'c';};

        System.out.println(taskManager.filter(isStartsWithD));
        System.out.println(taskManager.filter(isIdenticalFirstAndLastDigits));
        System.out.println(taskManager.filter(isEndWithC));


        System.out.println("\n-------------------------------------------\n");

        Missions.printMaxNumber();
    }
}
