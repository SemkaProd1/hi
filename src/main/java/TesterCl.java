/**
 * Created by hillel on 11.09.17.
 */
public class TesterCl extends Thread {
    private Thread myTread;

    public TesterCl(Thread myTread) {
        this.myTread = myTread;
    }
    @Override
    public void run(){
        try {
            this.myTread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
