package Main;

public class FactoryLista {

//    public FactoryLista()

    public Lista getLista(int n){
        if (n == 1){
            Lista<E> list = new ListaSimple<E>();
            return l;

        }

        else if (n == 2){
            Lista<E> list = new ListaDoble<E>();
            return l;
        }

        else {
            Lista<E> list = new ListaCirc<E>();
            return l;
        }
    }
}

