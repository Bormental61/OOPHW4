public abstract class Task {

    public int id;
    private final int days;
    private final String taskName;
    private final boolean priorityHigh;
    private final String taskOwner;

    public Task(int id, int days, String taskName, boolean priorityHigh, String taskOwner) {
        this.id = id;
        this.days = days;
        this.taskName = taskName;
        this.priorityHigh = priorityHigh;
        this.taskOwner = taskOwner;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getDays() {
        return days;
    }

    public String getTaskOwner() {
        return taskOwner;
    }

    public String getTask() {
        return "Task ID: " + id + "      Задача: " + taskName + ".      Ответственный: " + taskOwner +
                ".      Срок исполнения: " + days + " дней." + "      Приоритет: "
                + getPriority();
    }

    public String getPriority() {
        if (priorityHigh) {
            return "Высокий";
        } else {
            return "Низкий";
        }
    }
}