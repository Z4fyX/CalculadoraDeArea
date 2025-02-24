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
    // Añadir métodos para calcular el área de un rectángulo y un triángulo
}
