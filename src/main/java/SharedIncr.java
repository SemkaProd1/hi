/**
 * Created by hillel on 14.09.17.
 */
public class SharedIncr {
     private long value;
     private final Object lock = new Object();

    public void increment() {
        synchronized (this.lock){this.value++;}
    }

    public long getValue(){return value;}
}
