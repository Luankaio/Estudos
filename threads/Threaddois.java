public class Threaddois implements Runnable{
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000); // Aguarda um curto período para dar a sensação de movimento suave
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("um");
        }
        
    }
    
}
