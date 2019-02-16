package Main;

public interface iLista<E> {

    E get(int i);

    E pop();

    boolean empty();

    void addFirst(E obj);

    void addLast(E obj);

    E getLast(E obj);
    // non empty list

    E getFirst(E obj);
    // non empty list

    boolean size();


}
