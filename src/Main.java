public class Main {
    public static void main(String [] args) {
        BmiService service = new BmiService ();
        float bmi;
        bmi = service.calculate(59.9f, 1.79f);
        System.out.println(bmi);
    }
}