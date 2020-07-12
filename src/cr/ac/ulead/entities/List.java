package cr.ac.ulead.entities;

import cr.ac.ulead.ui.Display;

public class List {

    private Node head = null;
    private Display display = new Display();

    public void addNode(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void searchProductByName() {
        String text = display.readText();
        int counter = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.product.getName().contains(text)) {
                String productName = temp.product.getName();
                counter++;
                display.showProductByPosition(counter, productName);
            } else {
                counter++;
            }
            temp = temp.next;
        }
    }

    public void showProductByCode() {
        Node temp = head;
        while (temp != null) {
            String code = temp.product.getCode();
            String threeLastDigits = code.substring(29, 32);
            display.showCodeByProduct(threeLastDigits, temp.product.getName());
            temp = temp.next;
        }
    }

    public void showList() {
        Node temp = head;
        while (temp != null) {
            display.showList(temp.product.getName());
            temp = temp.next;
        }
    }

    public int countNodes() {
        int counter = 0;
        Node temp = head;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter++;
    }

}
