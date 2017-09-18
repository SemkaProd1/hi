
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader implements Reader {

    @Override
    public String reads() throws IOException {
        String input = null;

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));


            input = is.readLine();
            if (input.length() == 0) {
                return null;
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return input;
    }
}
