public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().someMethod());
    }

    String someMethod() {
        try {
            System.out.println("Try");
            Object o = null;
            o.hashCode();
            return "try2";

        } catch (NullPointerException e) {
            System.out.println("Catch");
            return "catch2";
//            e.printStackTrace();
        } finally {
            System.out.println("finally");
            return "finally2";
        }

    }

}
