package Main;

public class FactoryPila {

    public Pila getPila(int n){
        if (n == 1){
            Pila l = new PilaLista();
            return l;

        } else if (n == 2){
            Pila l = new PilaArr();
            return l;
        } else {
            Pila l = new PilaVec();
            return l;
        }
    }
}
