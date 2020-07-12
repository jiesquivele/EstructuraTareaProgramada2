package cr.ac.ulead.executables;

import cr.ac.ulead.logic.HashTableLogicByName;
import cr.ac.ulead.ui.Display;

public class ExecutableHashTableByName {

    public static void main(String[] args) {

        Display display = new Display();
        HashTableLogicByName logic = new HashTableLogicByName();

        int menuSelection;
        do {
            display.showMainMenuForHashTable2();
            menuSelection = display.readValue();
            logic.executeHashTable2(menuSelection);
        } while (menuSelection != 4);
    }
}

