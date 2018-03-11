import blockingQueue.Consumer;
import blockingQueue.Producer;
import blockingQueue.WorkDesk;
import lotte.Lotte;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo {
    public static void main(String[] args) {
//        Lotte l = new Lotte();
//        Thread t1 = new Thread(l,"box1");
//        Thread t2 = new Thread(l,"box2");
//        t1.start();
//        t2.start();
        WorkDesk workDesk = new WorkDesk();

        ExecutorService service = Executors.newCachedThreadPool();

        Producer p1 = new Producer("p1",workDesk);
        Producer p2 = new Producer("p2",workDesk);
        Producer p3 = new Producer("p3",workDesk);

        Consumer c1 = new Consumer("c1",workDesk);
        Consumer c2 = new Consumer("c2",workDesk);

        service.submit(p1);
        service.submit(p2);
        service.submit(p3);
        service.submit(c1);
        service.submit(c2);

    }
}
