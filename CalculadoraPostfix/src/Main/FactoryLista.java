package Main;

public class FactoryLista {

//    public FactoryLista()

    public Lista getLista(int n){
        if (n == 1){
            Lista l = new ListaSimple();
            return l;

        } else if (n == 2){
            Lista l = new ListaDoble();
            return l;
        } else {
            Lista l = new ListaCirc();
            return l;
        }
    }
}
