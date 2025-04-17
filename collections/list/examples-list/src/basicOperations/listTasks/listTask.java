package basicOperations.listTasks;

import java.util.ArrayList;
import java.util.List;

public class listTask {
    
    private List<Task> tasks;


    private listTask() {
        this.tasks = new ArrayList<>();
    }
    
    private void addTask(String desc) {
        Task newTask = new Task(desc);
        this.tasks.add(newTask);
    }

    private void removeTask(String desc) {
        List<Task> toRemove = new ArrayList<>();
       for(Task task : this.tasks) {          
        if(task.getDescription().equalsIgnoreCase(desc)) {
            toRemove.add(task);
        }
       }
       this.tasks.removeAll(toRemove);
    }

    private int getAllTasks() {
        return this.tasks.size();
    }

    private  void getAllTasksDescription() {
        for(int i=0; i < tasks.size(); i++) {
           System.out.println("Descrição da tarefa : " + this.tasks.get(i).getDescription());
           
        }

}

    public static void main(String[] args) {
        listTask tasks = new listTask();
        tasks.addTask("task one");
        tasks.addTask("task two");
        tasks.addTask("task tree");
        System.out.println(tasks.getAllTasks());
        tasks.getAllTasksDescription();
        tasks.removeTask("task tree");
        tasks.getAllTasksDescription();

    }

}
