import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Stopwatch {
    public static void main(String[] args) throws IOException{
        System.out.println("Press enter to start");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        Date old = new Date();

        System.out.println("Press enter to stop");
        str = reader.readLine();
        Date current = new Date();

        long distance = current.getSeconds() - old.getSeconds();
        System.out.println("Time distance is " + distance + " in sec");
    }
}
