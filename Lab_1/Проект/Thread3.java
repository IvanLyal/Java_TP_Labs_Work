public class Thread3 extends Thread {

    @Override
    public void run() {
        System.out.println("thread3 - " + (int) Math.pow(Thread1.num, 3));
    }
}