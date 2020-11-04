public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 80;
        int growth = 176;
        float index = service.calculate(weight, growth);
        System.out.println(index);
    }
}
