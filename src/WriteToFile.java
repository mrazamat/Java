import java.io.FileNotFoundException;
import java.util.Formatter;

public class WriteToFile {
    private Formatter file;

    public void openFile(){
        try{
            file = new Formatter("file2.tmp");

        } catch (FileNotFoundException e) {
            System.out.println("File not created!");
            e.printStackTrace();
        }
    }
    public void addRecord(String[] arr){
        file.format("%s\t%s %s\n",arr[0],arr[1],arr[2]);
    }
    public void closeFile(){
        file.close();
    }
}
