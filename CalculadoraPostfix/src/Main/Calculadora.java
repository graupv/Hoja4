package Main;

public class Calculadora implements iCalculadora{
    /*
    Singleton de la calculadora, solo es instanciado una vez.

     */
    private static Calculadora ourInstance = new Calculadora();

    public static Calculadora getInstance() {
        return ourInstance;
    }

    private Calculadora() {    }
    // constructor privado

    public double sumar(double a, double b){
        return a + b;
    }

    public double restar(double a, double b){
        return a - b;
    }

    public double multiplicar(double a, double b){
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0){
            return 0;
        } else{
            return a / b;
        }
    }
}
