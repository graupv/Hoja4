package Main;

import java.util.*;

public abstract class Pila<E> implements iPila<E>{

}

class PilaLista<E> extends Pila<E>{

    @Override
    public void push(E item) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}

class PilaVec <E> extends Pila<E> {
    @Override
    public void push(E item) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
//    Vector<E>
}

class PilaArr<E> extends Pila<E>{


    @Override
    public void push(E item) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
