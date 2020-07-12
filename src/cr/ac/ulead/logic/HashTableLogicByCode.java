package cr.ac.ulead.logic;

import cr.ac.ulead.entities.HashTable;
import cr.ac.ulead.entities.Node;
import cr.ac.ulead.entities.Product;
import cr.ac.ulead.ui.Display;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HashTableLogicByCode {

    private Display display = new Display();
    private HashTable productListArray = new HashTable(4096);
    private boolean dataLoaded = false;

    public void executeHashTable1(int menuSelection) {
        switch (menuSelection) {
            case 1:
                if (dataLoaded == true) {
                    display.showAlreadyLoaded();
                } else {
                    loadData();
                }
                break;
            case 2:
                if (dataLoaded == true) {
                    productListArray.get();
                } else {
                    display.showDataNotLoaded();
                }
                break;
            case 3:
                if (dataLoaded == true) {
                    productListArray.showListSizeByPosition();
                } else {
                    display.showDataNotLoaded();
                }
                break;
            default:
                display.showExitMessage();
                break;
        }
    }

    private void loadData() {
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(new File("C:\\dev\\estructuras\\tarea2\\flipkart_com-ecommerce_sample-CLEAN.csv"));
            while (fileReader.hasNextLine()) {
                String currentLine = fileReader.nextLine();
                String[] data = currentLine.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                Product newProduct = new Product();
                newProduct.setCode(data[0]);
                newProduct.setName(data[3]);
                newProduct.setCategory(data[4]);
                Node newNode = new Node(newProduct);
                productListArray.put(newNode);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            display.showFileNotFoundMessage();
        } finally {
            if (fileReader != null) {
                this.dataLoaded = true;
            }
        }
    }
}
