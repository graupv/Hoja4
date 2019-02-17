package Main;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {

    // Tomando como referencia HDT 2
    final static String PATH_DATOS = "C:\\datos.txt";

    //identificador de los delimitadores para eliminarse en la informacion
    final static String DELIMITADOR = " \t\n\r\fABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz|°!\"#$%&()=?¡¿'\\´¨[]{}_-:.;,^`¬~";

    public static void main(String[] args) throws IOException {

        StringTokenizer token = new StringTokenizer(getDataFile(), DELIMITADOR);
        // del tokenizer extraeremos los numeros y simbolos a operar

        try {
            Scanner scan = new Scanner(System.in);
            FactoryLista fl = new FactoryLista();
            FactoryPila fp = new FactoryPila();
            iCalculadora calc = Calculadora.getInstance();
            //  llamar instancia de singleton


            System.out.println("\nQue implementacion de Pila desea?");
            System.out.println("1. Vector\n2. Lista\n3. ArrayList\n ");
            // scan
            // dependiendo que pongan 1, 2 o 3
            int opcion;
            opcion = scan.nextInt();
            Pila<Integer> miPila = null;
            iPila mP;
            iLista iL;

            switch (opcion) {
                case 1:
                    // Se implementa la Pila con Vectores
                    mP = fp.getPila(3);
                    break;

                case 2:
                    // Se implementa la Pila con Listas
                    System.out.println(" Que implementacion de lista desea emplear?");
                    System.out.println("1. Simplemente encadenada\n2. Doblemente encadenada\n3. Circular");
                    int lista = scan.nextInt();
                    Lista<Integer> miLista;

                    // Dependiendo de la lista que se escoga esa su usara.
                    switch (lista) {
                        case 1:
                            // Usar la lista Simplemente Encadenada
                            miLista = fl.getLista(1);
                            break;

                        case 2:
                            // Usar la lista Doblemete Encadenada
                            miLista = fl.getLista(2);
                            break;

                        case 3:
                            // Usar la lista Circular
                            miLista = fl.getLista(3);
                            break;

                        default:
                            System.out.println("Opcion Invalida!");
                            break;
                    }


                case 3:
                    // Se implementa la Pila con ArrayLists
                    mP = fp.getPila(1);
                    break;

                default:
                    System.out.println("Opcion Invalida!");
                    break;
            }

            /*
            luego de escoger e instanciar el stack correcto
            usarlo.
             */
            double res;
            while (token.hasMoreTokens()) {


                for (char c : token.nextToken().toCharArray()) {
                /*
                Iteramos el String devuelto luego de convertirlo a arreglo de Char

                */
                    if (c == '+' || c == '-' || c == '/' || c == '*') {
                        // si esto se cumple es un operador entonces usamos la calculadora
                        //  tambien verificamos si hay suficientes operandos


                        if (mP.size() < 2) {
                            continue;
                            //  no hay suficientas operandos, sigamos buscando operandos
                            // y se tomara el siguiente operador para la operacion

                        } else {
                            switch (c) {
                                case '+':
                                    while (!mP.empty()) {
                                        if (mP.size() == 1) {
                                            //  es el ultimo valor
                                            break;

                                        } else {
                                            res = calc.sumar((double) mP.pop(), (double) mP.pop());
                                            mP.push(res);
                                            break; //
                                        }

                                    }


                                    break;

                                case '-':
                                    while (!mP.empty()) {
                                        if (mP.size() == 1) {
                                            //  es el ultimo valor
                                            break;

                                        } else {
                                            res = calc.restar((double) mP.pop(), (double) mP.pop());
                                            mP.push(res);
                                            break;
                                        }

                                    }

                                    break;

                                case '*':
                                    while (!mP.empty()) {
                                        if (mP.size() == 1) {
                                            //  es el ultimo valor
                                            break;

                                        } else {
                                            res = calc.multiplicar((double) mP.pop(), (double) mP.pop());
                                            mP.push(res);
                                            break;
                                        }

                                    }


                                    break;

                                case '/':
                                    while (!mP.empty()) {
                                        if (mP.size() == 1) {
                                            //  es el ultimo valor
                                            break;

                                        } else {
                                            res = calc.dividir((double) mP.pop(), (double) mP.pop());
                                            mP.push(res);
                                            break;
                                        }

                                    }

                                    break;
                            }
                        }

                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String getDataFile() throws IOException, FileNotFoundException{

        BufferedReader reader;
        File file;
        String linea,datos = "";
        try{
            if((new File(PATH_DATOS)).exists()){ //verificamos que el archivo exista


                reader = new BufferedReader(new FileReader(PATH_DATOS));

                while((linea = reader.readLine()) != null){
                    //concatenamos con un tabular la lectura de la linea,
                    //el tabular se eliminara al separar las expresiones.
                    datos += linea + "\t";
                }

                reader.close();
            }
            else{
                System.out.println("El archivo ingresado no fue encontrado.");
            }

        }

        catch(Exception e){
            e.printStackTrace();
        }

        return datos;
    }
}
