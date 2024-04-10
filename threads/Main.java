public class Main {
    public static void main(String[] args) {
        Threadum threadum = new Threadum();
        Threaddois threaddois = new Threaddois();
        Thread thread1 = new Thread(threadum);
        Thread thread2 = new Thread(threaddois);
        thread1.start();
        thread2.start();
    }
}
