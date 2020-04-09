public class BmiService {
    public double calculate(double mass, double height) {
        double index;
    index = mass * 100 / (height * height) * 100;
        return index;}
}
