/* Esta puede ser una posible forma de hacer que lea el documento
 * solo hay que adaptarlo con las variables de las listas y stacks
 * y ya debería de estar. Hay que agregarle al main también estos imports.
 *
*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

try {
    Stream<String> line = Files.line(Paths.get(textFile), StandarCharsets.UTF_8);
    line.forEach(line -> {
        String[] characters = line.split(" ");

        for (String i : parts) {
            System.out.println(i.toString());
            if (i.equals("+")) {
                double a = double.paresedouble(stack.pop());
                double b = double.paresedouble(stack.pop());
                double result = double miCalculadora.sumar(a, b);
                stack.push(result.toString());
            }

            else if (i.equals("-")) {
                double a = double.paresedouble(stack.pop());
                double b = double.paresedouble(stack.pop());
                double result = double miCalculadora.restar(a, b);
                stack.push(result.toString()),
            }

            else if (i.equals("*")) {
                double a = double.paresedouble(stack.pop());
                double b = double.paresedouble(stack.pop());
                double result = double miCalculadora.multiplicar(a, b);
                stack.push(result.toString());
            }

            else if (i.equals("/")) {
                double a = double.paresedouble(stack.pop());
                double b = double.paresedouble(stack.pop());
                double result = double miCalculadora.dividir(a, b);
                stack.push(result.toString());
            }
        }
    });
}

catch (IOExeption exeption) {
    System.out.println("Por favor ingrese un archivo .txt válido!");
}