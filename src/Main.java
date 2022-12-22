public class Main {
    public static void main(String[] args) {
        BmiServiced service = new BmiServiced();
        int height = 2;
        int wieght = 100;
        int bmi = service.calculate(height, wieght);
        System.out.println(bmi);

    }
}