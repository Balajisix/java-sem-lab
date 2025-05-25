class Threading extends Thread {
    public void run() {
        try {
            System.out.println("Thread is running " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Exception in Thread " + Thread.currentThread().getId());
            e.printStackTrace();
        }
    }
}

class MultiThread implements Runnable {
    public void run() {
        try {
            System.out.println("Thread is running " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Exception in Thread " + Thread.currentThread().getId());
            e.printStackTrace();
        }
    }
}

public class ThreadExample{
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            Threading t = new Threading();
//            t.start();
//        }

        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(new MultiThread());
            t1.start();
        }
    }
}
