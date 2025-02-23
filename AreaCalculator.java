public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Calculadora de área para diferentes figuras.");
        
        System.out.println("Área del círculo: " + circleArea(5));
        System.out.println("Área del rectángulo: " + rectangleArea(4, 6));
        System.out.println("Área del triángulo: " + triangleArea(4, 6));
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double rectangleArea(double base, double height) {
        return base * height;
    }

    public static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }
}
