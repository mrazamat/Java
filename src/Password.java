import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Password {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("password.txt", "UTF-8");
            for (int i = 0; i < 30; i++) {
                writer.println(getSaltString());
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    protected static String getSaltString() {
        String SALTCHARS = "ABCDEF1234567890";
        StringBuilder salt = new StringBuilder();
        Random random = new Random();
        while(salt.length()<8){
            int index = (int)( random.nextFloat()*SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
}
