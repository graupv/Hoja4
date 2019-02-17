package Main;

public class FactoryPila<E> {

    public Pila getPila(int n){
         if (n == 1){
            Pila<E> stack = new PilaArr<E>();
            return stack;
        }

        else {
            Pila<E> stack = new PilaVec<E>();
            return stack;
        }
    }
}
