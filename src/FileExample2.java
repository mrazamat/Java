public class FileExample2 {
    public static void main(String[] args) {
        WriteToFile f = new WriteToFile();
        String[] arr1 = {"1", "Остап", "Бендер"};
        String[] arr2 = {"2", "Киса", "Воробьянинов"};
        String[] arr3 = {"3", "Семен", "Горбунов"};
        String[] arr4 = {"4", "Карл", "Мюнхгаузен"};

        f.openFile();
        f.addRecord(arr1);
        f.addRecord(arr2);
        f.addRecord(arr3);
        f.addRecord(arr4);
        f.closeFile();

        ReadFile r = new ReadFile();
        r.openFile();
        r.readFile();
        r.closeFile();
    }
}
