package Main;

import java.util.*;

public abstract class Pila<E> implements iPila<E>{

}

class PilaLista<E> extends Pila<E>{

    protected ArrayList<E> = data;

    @Override
    public void push(E item) {
        data.add(item);
    }

    @Override
    public String pop() {
        return data.remove(0);
    }

    @Override
    public String peek() {
        return data.get(0);
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int size() {
        return data.size();
    }
}

class PilaVec <E> extends Pila<E> {

    protected Vector<E> = data;

    @Override
    public void push(E item) {
        data.add(item);
    }

    @Override
    public String pop() {
        return data.remove(0);
    }

    @Override
    public String peek() {
        return data.get(0);
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int size() {
        return data.size();
    }
//    Vector<E>
}

class PilaArr<E> extends Pila<E>{

    protected ArrayList<E> = data;

    @Override
    public void push(E item) {
        data.add(item);
    }

    @Override
    public String pop() {
        return data.remove(0);
    }

    @Override
    public String peek() {
        return data.get(0);
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int size() {
        return data.size();
    }
}
