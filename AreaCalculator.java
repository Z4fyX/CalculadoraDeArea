public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Calculadora de área para diferentes figuras.");
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
    // Añadir métodos para calcular el área de un rectángulo y un triángulo
    public static double rectangleArea(double base, double height) {
        return base * height;
    }

    // método triángulo creado por Yael
    public static double trianguloArea(double base, double height){
        return (base*height)/2;
    }
}
