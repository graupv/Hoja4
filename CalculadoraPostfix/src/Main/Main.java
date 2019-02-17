package Main;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {

    // Tomando como referencia HDT 2
    final static String PATH_DATOS = "C:\\datos.txt";

    //identificador de los delimitadores para eliminarse en la informacion
    final static String DELIMITADOR = " \t\n\r\fABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz|°!\"#$%&()=?¡¿'\\´¨[]{}_-:.;,^`¬~";

    public static void main(String[] args) throws IOException{

        StringTokenizer token = new StringTokenizer(getDataFile(), DELIMITADOR);
        // del tokenizer extraeremos los numeros y simbolos a operar

        try{

            // Instanciar clases
            Scanner scan = new Scanner(System.in);
            FactoryLista fl = new FactoryLista();
            FactoryPila fp = new FactoryPila();

            // bloque de opciones para que quiere instanciar
            //  lista encadenada, doble o circular
            // y tambien para la implementacion del stack

            //  Un switch creo que seria lo mas facil
            //  TODO
            //      1. Switch
            //      2. UML
            //      3. Tests
            //      4. Implementacion de cada lista / stack
            //      5. Factories

            System.out.println("Que implementacion de Pila desea?");
            System.out.println("1. Vector\n2. Lista\n3. ArrayList\n4. Salir");
            //  scan
            // dependiendo que pongan 1, 2 o 3
            int opcion;
            opcion = scan.nextInt();

            switch (opcion) {
                case 1: // Se implementa la Pila con Vectores
                        fp.getPila(3);

                        break;

                case 2: // Se implementa la Pila con Listas

                        System.out.println(" Que implementacion de lista desea emplear?");
                        System.out.println("1. Simplemente encadenada\n2. Doblemente encadenada\n3. Circular");
                        int lista = scan.nextInt();

                        // Dependiendo de la lista que se escoga esa su usara.
                        switch (lista) {
                            case 1: // Usar la lista Simplemente Encadenada
    |                               fl.getLista(1);

                                    break;

                            case 2: // Usar la lista Doblemete Encadenada
                                    fl.getLista(2);

                                    break;

                            case 3: // Usar la lista Circular
                                    fl.getLista(3);

                                    break;
                        }

                        break;

                case 3: // Se implementa la Pila con ArrayLists
                        fp.getPila(2);
                        break;

                case 4: // Hacer mensaje de despediad para el usuario.
                        break;
            }

            /*Pila p = fp.getPila(1);

            System.out.println("Que implementacion de Lista desea?");
            System.out.println("1. Simplemente Encadenada\n2. Doblemente Encadenada\n3. Circular");
            //  scan
            // dependiendo que pongan 1, 2 o 3
            fl.getLista(1); */

        } catch (Exception e){
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
