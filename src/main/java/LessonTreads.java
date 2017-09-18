import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class LessonTreads extends Thread{


    public LessonTreads(Devider devider) {

    }

    public void run() {
        Thread thread = new Thread();
        Devider devider = new Devider();

            Set<String> s = new HashSet<String>();
            HashSet d = Devider.divide(" d ds asd asd ", (HashSet<String>) s);





    }

}
