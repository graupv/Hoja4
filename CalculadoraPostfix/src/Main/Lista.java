package Main;

public abstract class Lista<E> implements iLista<E>{

    @Override
    public boolean empty() {
        return size() == 0;
    }
}

class ListaSimple<E> extends Lista<E> {



    @Override
    public int size() {
        return 0;
    }

    @Override
    public E get(int n) {
        return null;
    }
    /*
    * Contiene nodo siguiente
    * */

}

class ListaDoble<E> extends Lista<E> {
    /* Contiene nodo siguiente y anterior */
}

class ListaCirc<E> extends Lista<E> {
    /* Con*/
}