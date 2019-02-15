package Main;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {

    final static String PATH_DATOS = "C:\\datos.txt";
    //identificador de los delimitadores para eliminarse en la informacion
    final static String DELIMITADOR = " \t\n\r\fABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz|°!\"#$%&()=?¡¿'\\´¨[]{}_-:.;,^`¬~";

    public static void main(String[] args) throws IOException{

        StringTokenizer token = new StringTokenizer(getDataFile(), DELIMITADOR);
        // del tokenizer extraeremos los numeros y simbolos a operar
        try{
            // stuff
            Scanner scan = new Scanner(System.in);
            // bloque de opciones para que quiere instanciar
            //  lista encadenada, doble o circular
            // y tambien

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
