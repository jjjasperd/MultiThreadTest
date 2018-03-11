package blockingQueue;

public class Producer implements Runnable{

    private String producerName;
    private WorkDesk workDesk;

    public Producer(String producerName, WorkDesk workDesk){
        this.producerName = producerName;
        this.workDesk = workDesk;
    }
    @Override
    public void run() {
        try{
            while (true){
                System.out.println(producerName + " produced a product.");
                workDesk.produced();
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
