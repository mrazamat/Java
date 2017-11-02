public class ExampleAssertions {
    public static void main(String[] args) {
        boolean b = ExampleAssertions.approveTicket(150);
        System.out.println(b);

    }

    static boolean approveTicket(int age) {
        assert (age > 60 && age < 110) : "Age entered is " + age;
        if (age > 60) {
            return true;
        } else {
            return false;
        }
    }
}
