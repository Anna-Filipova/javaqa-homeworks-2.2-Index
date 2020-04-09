public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 65;
        double height = 166;
        double index = service.calculate(mass, height);
        System.out.println(index);
    }
}
