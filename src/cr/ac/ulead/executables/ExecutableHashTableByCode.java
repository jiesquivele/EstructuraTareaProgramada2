package cr.ac.ulead.executables;

import cr.ac.ulead.logic.HashTableLogicByCode;
import cr.ac.ulead.ui.Display;

public class ExecutableHashTableByCode {

    public static void main(String[] args) {

        Display display = new Display();
        HashTableLogicByCode logic = new HashTableLogicByCode();

        int menuSelection;
        do {
            display.showMainMenuForHashTable1();
            menuSelection = display.readValue();
            logic.executeHashTable1(menuSelection);
        } while (menuSelection != 4);
    }
}

