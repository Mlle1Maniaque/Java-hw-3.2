public class BmiService {
    public int calculate(double meters, double kilograms) {
        int bmi = (int) (kilograms / (meters * meters));
        return bmi;
    }
}