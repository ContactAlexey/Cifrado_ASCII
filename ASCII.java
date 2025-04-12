package Libre;

import java.util.HashMap; // Importa HashMap para almacenar pares de caracteres y valores ASCII
import java.util.Scanner; // Importa Scanner para leer entrada del usuario
import java.util.ArrayList; // Importa ArrayList para almacenar valores ASCII
import java.util.List; // Importa la interfaz List
import java.util.Random; //generar numeros aleatorios

public class ASCII {
    public static void main(String[] args) {
  
        HashMap<Character, Integer> diccionario = new HashMap<>();// Diccionario para mapear caracteres a sus valores ASCII
        Scanner teclado = new Scanner(System.in); // Scanner para leer la entrada del usuario
        Random aleatorio =new Random();
        
        // Lista para almacenar los valores ASCII de una palabra ingresada
        List<Integer> valoresASCII = new ArrayList<>();
        
        
        //genera numeros aleatorios del 0-999
        int numero_error= aleatorio.nextInt(999);
        
        // Llenar el diccionario con los valores ASCII de caracteres comunes
        diccionario.put(' ', 32);
        diccionario.put('!', 33);
        diccionario.put('"', 34);
        diccionario.put('#', 35);
        diccionario.put('$', 36);
        diccionario.put('%', 37);
        diccionario.put('&', 38);
        diccionario.put('\'', 39);
        diccionario.put('(', 40);
        diccionario.put(')', 41);
        diccionario.put('*', 42);
        diccionario.put('+', 43);
        diccionario.put(',', 44);
        diccionario.put('-', 45);
        diccionario.put('.', 46);
        diccionario.put('/', 47);
        diccionario.put('0', 48);
        diccionario.put('1', 49);
        diccionario.put('2', 50);
        diccionario.put('3', 51);
        diccionario.put('4', 52);
        diccionario.put('5', 53);
        diccionario.put('6', 54);
        diccionario.put('7', 55);
        diccionario.put('8', 56);
        diccionario.put('9', 57);
        diccionario.put(':', 58);
        diccionario.put(';', 59);
        diccionario.put('<', 60);
        diccionario.put('=', 61);
        diccionario.put('>', 62);
        diccionario.put('?', 63);
        diccionario.put('@', 64);
        diccionario.put('A', 65);
        diccionario.put('B', 66);
        diccionario.put('C', 67);
        diccionario.put('D', 68);
        diccionario.put('E', 69);
        diccionario.put('F', 70);
        diccionario.put('G', 71);
        diccionario.put('H', 72);
        diccionario.put('I', 73);
        diccionario.put('J', 74);
        diccionario.put('K', 75);
        diccionario.put('L', 76);
        diccionario.put('M', 77);
        diccionario.put('N', 78);
        diccionario.put('O', 79);
        diccionario.put('P', 80);
        diccionario.put('Q', 81);
        diccionario.put('R', 82);
        diccionario.put('S', 83);
        diccionario.put('T', 84);
        diccionario.put('U', 85);
        diccionario.put('V', 86);
        diccionario.put('W', 87);
        diccionario.put('X', 88);
        diccionario.put('Y', 89);
        diccionario.put('Z', 90);
        diccionario.put('[', 91);
        diccionario.put('\\', 92);
        diccionario.put(']', 93);
        diccionario.put('^', 94);
        diccionario.put('_', 95);
        diccionario.put('`', 96);
        diccionario.put('a', 97);
        diccionario.put('b', 98);
        diccionario.put('c', 99);
        diccionario.put('d', 100);
        diccionario.put('e', 101);
        diccionario.put('f', 102);
        diccionario.put('g', 103);
        diccionario.put('h', 104);
        diccionario.put('i', 105);
        diccionario.put('j', 106);
        diccionario.put('k', 107);
        diccionario.put('l', 108);
        diccionario.put('m', 109);
        diccionario.put('n', 110);
        diccionario.put('o', 111);
        diccionario.put('p', 112);
        diccionario.put('q', 113);
        diccionario.put('r', 114);
        diccionario.put('s', 115);
        diccionario.put('t', 116);
        diccionario.put('u', 117);
        diccionario.put('v', 118);
        diccionario.put('w', 119);
        diccionario.put('x', 120);
        diccionario.put('y', 121);
        diccionario.put('z', 122);
        diccionario.put('{', 123);
        diccionario.put('}', 125);
        diccionario.put('~', 126);
        diccionario.put('¡', 161);
        diccionario.put('¿', 191);
        diccionario.put('Á', 193);
        diccionario.put('É', 201);
        diccionario.put('Í', 205);
        diccionario.put('Ñ', 209);
        diccionario.put('Ó', 211);
        diccionario.put('Ú', 218);
        diccionario.put('Ü', 220);
        diccionario.put('á', 225);
        diccionario.put('é', 233);
        diccionario.put('í', 237);
        diccionario.put('ñ', 241);
        diccionario.put('ó', 243);
        diccionario.put('ú', 250);
        diccionario.put('ü', 252);
        

        // Menú de selección para cifrar o descifrar
        System.out.println("Selecciona una opción:");
        System.out.println("1. Cifrar una palabra");
        System.out.println("2. Descifrar números ASCII");
        System.out.print("Opción: ");
        int opcion = teclado.nextInt(); // Leer la opción del usuario
        teclado.nextLine(); // Limpiar el buffer
        
        if (opcion == 1) {
            // CIFRAR UNA PALABRA
            System.out.print("Ingresa la palabra a cifrar: ");
            String palabra = teclado.nextLine(); // Leer la palabra ingresada por el usuario
            
            // Convertir cada letra en su valor ASCII usando el diccionario
            for (char letra : palabra.toCharArray()) {
                if (diccionario.containsKey(letra)) { // Verificar si el carácter está en el diccionario
                    valoresASCII.add(diccionario.get(letra)); // Agregar su valor ASCII a la lista
                }
            }

            // Imprimir la lista de valores ASCII en formato limpio
            System.out.println("Palabra cifrada en ASCII: " + valoresASCII.toString().replaceAll("[\\[\\],]", ""));
        
        } else if (opcion == 2) {
            // DESCIFRAR NÚMEROS ASCII
            System.out.print("Ingresa los valores ASCII separados por espacio: ");
            String numerosTexto = teclado.nextLine(); // Leer la línea con los números ASCII
            String[] numerosArray = numerosTexto.split(" "); // Separar los valores por espacio
            StringBuilder palabraDescifrada = new StringBuilder(); // StringBuilder para reconstruir la palabra

            for (String numStr : numerosArray) {
                try {
                    int num = Integer.parseInt(numStr); // Convertir el número de texto a entero
                    palabraDescifrada.append((char) num); // Convertir el número ASCII a carácter y agregarlo
                } catch (NumberFormatException e) {
                    // Manejo de error en caso de que se ingrese un valor no numérico
                    System.out.println("Error: '" + numStr + "' no es un número válido.");
                    return;
                }
            }

            // Imprimir la palabra descifrada
            System.out.println("Palabra descifrada: " + palabraDescifrada.toString());
        } else {
            // Mensaje de error si la opción ingresada no es válida
            System.out.println("Opción inválida error "+ numero_error+ " Inténtalo de nuevo.");
        }
      
        }
    }


