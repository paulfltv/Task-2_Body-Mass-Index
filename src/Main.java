public class Main {
    public static void main(String [] args) {
        float weight = 59.9f;
        float growth = 1.79f;
        float BMI = weight / (growth * growth);
        BmiService service = new BmiService ();
        BMI = service.calculate(59.9f);
        System.out.println(BMI);
    }
}