public class Main {
    public static void main(String[] args) {
        new Main().someMethod();
    }

    void someMethod(){
        try{
            throw new Exception();
        }catch (Exception e){

        }

    }
}
