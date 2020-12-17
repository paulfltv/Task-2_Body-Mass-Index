public class BmiService {
    public float calculate(float weight) {
        float growth = 1.79f;
        float BMI = weight / (growth * growth);
        return BMI;
    }
}