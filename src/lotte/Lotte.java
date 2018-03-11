package lotte;

public class Lotte implements Runnable{
    int[] numSet = {10,5,20,50,100,200,500,800,2,80,300};
    int num = numSet.length;
    boolean[] flag = new boolean[numSet.length];


    @Override
    public void run() {
        while (true){
            synchronized (this){
                if (num > 0){
                    int index = (int) (Math.random() * numSet.length);
                    int get = numSet[index];

                    if (flag[index] != true){
                        flag[index] = true;
                        System.out.println(Thread.currentThread().getName()+" produced a "+ get + " bucks price");
                        num--;
                    }
                }
            }
        }
    }
}
