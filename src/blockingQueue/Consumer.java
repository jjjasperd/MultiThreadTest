package blockingQueue;

public class Consumer implements Runnable {
    private String consumerName;
    private WorkDesk workDesk;

    public Consumer(String consumerName,WorkDesk workDesk){
        this.consumerName = consumerName;
        this.workDesk = workDesk;
    }
    @Override
    public void run() {
        try{
            while (true){
                System.out.println(consumerName + " consumed a product");
                workDesk.consumed();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
