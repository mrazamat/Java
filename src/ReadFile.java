import java.io.File;
import java.util.Scanner;

public class ReadFile {
    private Scanner file;

    public void openFile() {
        try {
            file = new Scanner(new File("file2.tmp"));
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

    public void readFile() {
        while (file.hasNext()) {
            String id = file.next();
            String name = file.next();
            String lastName = file.next();
            System.out.printf("%s %s %s\n",id,name,lastName);
        }
    }
    public void closeFile(){
        file.close();
    }
}
