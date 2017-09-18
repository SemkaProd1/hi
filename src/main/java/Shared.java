import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by hillel on 14.09.17.
 */
public class Shared {
    private volatile  long v;
    private ReentrantLock lock = new ReentrantLock();

    public void incr(){
        this.lock.lock();
        try{
            this.v++;
        }finally {
            this.lock.unlock();
        }
    }
    public long getV(){return v;}
    }
