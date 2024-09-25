package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskScheduler {
    private Deque<Task> schedule = new ArrayDeque<>();

    public void addTask(Task task){
        schedule.add(task);
    }
    public int getRemainingTasks(){
        if(schedule.size() > 0){
            return schedule.size();
        }
        return -1;
    }
    public void processNextTask(){
        Task task = schedule.poll();
        task.execute();
    }
}
