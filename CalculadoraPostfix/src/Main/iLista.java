package Main;

public interface iLista<E> {
    /*
    Construir la interfaz de la Lista, su clase abstracta
    y las clases de implementación con:
        1. Simplemente encadenadas
        2. Doblemente encadenadas
        3. Lista circular.
    Debe utilizar genéricos.

    A mi me da a entender que el orden debe ser
    interfaz -> clase abstracta que implementa la interfaz -> clases de instancia en el factory
     */


    public void setNext(Node<E> next)
    // post: sets reference to new next value
    {
        nextElement + next:
    }

    public E value ()
    // post: returns value associated with  this element
    {
        return data:
    }

    public void setValue (E value)
    // post: sest value associated with this element
    {
        data = value:
    }
}
