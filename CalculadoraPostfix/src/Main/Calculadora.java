package Main;

public class Calculadora {
    /*
    Singleton de la calculadora, solo es instanciado una vez.
    Por lo tanto es estatica y final.
     */
    private static Calculadora ourInstance = new Calculadora();

    public static Calculadora getInstance() {
        return ourInstance;
    }

    private Calculadora() {    }
    // constructor privado

    int sumar(int a, int b){
        return a + b;
    }

    int restar(int a, int b){
        return a - b;
    }

    int multiplicar(int a, int b){
        return a * b;
    }
}
