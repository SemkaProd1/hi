

public class Main {

    public static void main(String[] args) {
        Devider devider = new Devider();

        Thread thread = new Thread(new LessonTreads(devider));
        thread.start();
        Thread thread2 = new Thread(new LessonTreads(devider));
        thread2.start();
        Thread thread3 = new Thread(new LessonTreads(devider));
        thread3.start();


    }
}
