import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskList {
    static List<String> taskList = new ArrayList<>();
    static void addTaskList(Task newTask){
        taskList.add(newTask.getTask());
    }

    public static List<String> getTaskList() {
        return taskList;
    }

    public static void fileWriter(){
        try (FileWriter writer = new FileWriter("TaskList.txt",false)){
            for (int i = 0; i < taskList.size(); i++) {
                writer.write(taskList.get(i)+"\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}