package Exercise4;

public class Goods {
  int amount;
  boolean transfer = true;

  synchronized void produce(int amount) {
    while (!transfer) {
      try {
        wait();
      } catch (InterruptedException err) {
        err.printStackTrace();
      }
    }

    transfer = false;
    this.amount = amount;

    notify();
  }

  synchronized int consume() {
    while (transfer) {
      try {
        wait();
      } catch (InterruptedException err) {
        err.printStackTrace();
      }
    }

    transfer = true;
    notify();

    int returnAmount = amount;
    return returnAmount;
  }
}
