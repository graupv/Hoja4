package Main;

public class FactoryPila {

    public Pila getPila(int n){
        if (n == 1){
            Pila<E> stack = new PilaLista<E>();
            return l;

        }

        else if (n == 2){
            Pila<E> stack = new PilaArr<E>();
            return l;
        }

        else {
            Pila<E> stack = new PilaVec<E>();
            return l;
        }
    }
}
