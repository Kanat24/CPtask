public class Main {
    public static void main(String[] args) {
        System.out.println(square(12));
        System.out.println(square2(12.2));
    }
    public static double square(double x){
        double y = x*x;
        return y;
    }

    public static double square2(double x){
        double y = Math.pow(x, 2);
        return y;
    }
}