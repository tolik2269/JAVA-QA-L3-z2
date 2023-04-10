public class BmiService {
    public int calculate(double heightMeter, double weightKilogramm) {
        double result = weightKilogramm / (heightMeter * heightMeter);
        int index = (int) result;
        return index;
    }
}
