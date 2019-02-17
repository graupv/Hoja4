package Main;

public class FactoryLista {

//    public FactoryLista()

    public Lista getLista(int n){
        if (n == 1){
            Lista<Integer> list = new ListaSimple<Integer>();
            return list;

        }

        else if (n == 2){
            Lista<Integer> list = new ListaDoble<Integer>();
            return list;
        }

        else {
            Lista<Integer> list = new ListaCirc<Integer>();
            return list;
        }
    }
}

