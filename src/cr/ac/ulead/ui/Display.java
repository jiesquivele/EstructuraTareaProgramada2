package cr.ac.ulead.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class Display {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);

    public void showMainMenuForList() {
        output.println("\n");
        output.println("=======================================================================");
        output.println("=======================   MENU DE LA LISTA   ==========================");
        output.println("=======================================================================");
        output.println(" - 1) Cargar productos en la lista.");
        output.println(" - 2) Buscar productos por nombre.");
        output.println(" - 3) Listar codigos alfanumericos.");
        output.println(" - 4) Salir.");
    }

    public void showMainMenuForHashTable1() {
        output.println("\n");
        output.println("=======================================================================");
        output.println("=====================   MENU DEL HASHTABLE 1   ========================");
        output.println("=======================================================================");
        output.println(" - 1) Cargar productos en el hashtable.");
        output.println(" - 2) Listar productos en una posicion especifica del hashtable.");
        output.println(" - 3) Listar posiciones del hashtable y su cantidad de elementos.");
        output.println(" - 4) Salir.");
    }

    public void showMainMenuForHashTable2() {
        output.println("\n");
        output.println("=======================================================================");
        output.println("=====================   MENU DEL HASHTABLE 2   ========================");
        output.println("=======================================================================");
        output.println(" - 1) Cargar productos en el hashtable.");
        output.println(" - 2) Listar productos en una posicion especifica del hashtable.");
        output.println(" - 3) Listar posiciones del hashtable y su cantidad de elementos.");
        output.println(" - 4) Salir.");
    }

    public int readValue() {
        output.println("Ingrese una opcion: ");
        int option = input.nextInt();
        this.input.skip("[\r\n]");
        return option;
    }

    public String readText() {
        output.println("Ingrese el nombre a buscar: ");
        return input.nextLine();
    }

    public void showProductByPosition(int counter, String name) {
        output.println("En la posicion " + counter + " de la lista esta el producto con el nombre de \"" + name + "\".");
    }

    public void showCodeByProduct(String code, String name) {
        output.println("El codigo \"" + code + "\" corresponde al producto con el nombre de \"" + name + "\".");
    }

    public void showList(String name) {
        output.println("Nombre del producto en la lista: " + name);
    }

    public void listSizeByPosition(int i, int counter) {
        output.println("La posicion " + i + " del arreglo contiene una lista con " + counter + " productos.");
    }

    public void showFileNotFoundMessage() {
        output.println("El dataset no fue encontrado. Revise el \"path\" y vuelva a intentarlo.");
    }

    public void showAlreadyLoaded() {
        output.println("Los datos ya fueron cargados anteriormente.");
    }

    public void showDataNotLoaded() {
        output.println("Los datos aun no han sido cargados.");
    }

    public void showExitMessage() {
        output.println("Gracias por usar el programa!");
    }
}
