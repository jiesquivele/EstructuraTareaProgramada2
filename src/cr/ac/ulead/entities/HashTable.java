package cr.ac.ulead.entities;

import cr.ac.ulead.ui.Display;

public class HashTable {

    private Display display = new Display();
    private List[] productListArray;
    private int size;

    public HashTable(int size) {
        this.size = size;
        productListArray = new List[size];
        for (int i = 0; i < size; i++) {
            productListArray[i] = new List();
        }
    }

    public void put(Node node) {
        int key = implementHashFunction(node);
        productListArray[key].addNode(node);
    }

    public void get() {
        int key = display.readValue();
        productListArray[key].showList();
    }

    public void showListSizeByPosition() {
        for (int i = 0; i < size; i++) {
            int counter = productListArray[i].countNodes();
            display.listSizeByPosition(i, counter);
        }
    }

    private int implementHashFunction(Node node) {
        int key = 0;
        if (this.size == 4096) {
            String code = node.product.getCode();
            String lastThreeDigits = code.substring(29, 32);
            key = Integer.parseInt(lastThreeDigits, 16);
            return key;
        }
        if (this.size == 50) {
            String name = node.product.getName().toLowerCase();
            for (int i = 0; i < name.length(); i++) {
                char value = name.charAt(i);
                if ((value >= 'a' && value <= 'z') && (value != 'a' && value != 'e' && value != 'i' && value != 'o' && value != 'u')) {
                    key++;
                }
                if (key > size-1) {
                    key = size-1;
                }
            }
        }
        return key;
    }
}
