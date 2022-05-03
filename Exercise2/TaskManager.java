package Exercise2;

public class TaskManager {
  void performTask(int taskId, String name) {
    System.out.println(name + taskId);

    try {
      Thread.sleep(4);
    } catch (InterruptedException err) {
      err.printStackTrace();
    }

    System.out.println(name + taskId);
  }
}
