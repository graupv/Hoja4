package Main;



public abstract class Lista<E> implements iLista<E> {

    //@Override
    public boolean empty() {
        return size() == 0;
    }
}



class Node<E>{
//  nodo para listasimple

    protected E data;
    protected Node<E> nextElement;
    public Node(E v, Node<E> next){
        data = v;
        nextElement = next;
    }

    public Node(E v){
        this(v, null);
    }

    Node<E> next(){
        return nextElement;
    }

    void setNext(Node<E> next){
        nextElement = next;
    }

    void setValue(E val){
        data = val;
    }

    E value(){
        return data;
    }


}

class ListaSimple<E> extends Lista<E> {

    protected E data;
    protected ListaSimple<E> nextElement;
    public ListaSimple(E v, ListaSimple<E> next){
        data = v;
        nextElement = next;
    }
    public ListaSimple(){


    }

    public ListaSimple(E v){
        this(v, null);

    }


    @Override
    public void addFirst(E obj) {

    }

    @Override
    public void addLast(E obj) {

    }

    @Override
    public E getLast(E obj) {
        return null;
    }

    @Override
    public E getFirst(E obj) {
        return null;
    }

    //@Override
    public int size() {
        return 0;
    }

   // @Override
    public E get(int n) {
        return null;
    }
    /*
    * Contiene nodo siguiente
    * */

    public ListaSimple<E> next() {
        return nextElement;
    }

}

class ListaDoble<E> extends Lista<E> {

    protected ListaDoble<E> nextElement;
    protected ListaDoble<E> prevElement;
    protected E data;

    public ListaDoble(){

    }

    public ListaDoble(E v, ListaDoble<E> next, ListaDoble<E> prev){
        data = v;
        if (next != null){
            nextElement.prevElement = this;
        }
        prevElement = prev;
        if (prev != null){
            prevElement.nextElement = this;
        }

    }

    public ListaDoble(E v){
        this(v, null, null);
    }

    /* Contiene nodo siguiente y anterior */
    public ListaDoble<E> next() {
        return nextElement;
    }

    @Override
    public E get(int i) {
        return null;
    }


    public E pop() {
        return null;
    }

    @Override
    public void addFirst(E obj) {

    }

    @Override
    public void addLast(E obj) {

    }

    @Override
    public E getLast(E obj) {
        return null;
    }

    @Override
    public E getFirst(E obj) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}

class ListaCirc<E> extends Lista<E> {
    @Override
    public E get(int i) {
        return null;
    }


    public E pop() {
        return null;
    }

    @Override
    public void addFirst(E obj) {

    }

    @Override
    public void addLast(E obj) {

    }

    @Override
    public E getLast(E obj) {
        return null;
    }

    @Override
    public E getFirst(E obj) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
    /* Con*/
}