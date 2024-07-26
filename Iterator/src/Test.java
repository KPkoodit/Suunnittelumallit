import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test implements Runnable{

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            list.add(i);
        }
        
        Test runnable = new Test();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();
    }

    public void run() {
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(Thread.currentThread().getName() + ": " + element);
        }
    }
}

