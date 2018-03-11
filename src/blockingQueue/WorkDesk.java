package blockingQueue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class WorkDesk {
    BlockingDeque<String> desk = new LinkedBlockingDeque<>(10);

    public void produced() throws InterruptedException{
        desk.put("produced a product.");
    }

    public String consumed() throws InterruptedException{
        return desk.take();
    }

}
