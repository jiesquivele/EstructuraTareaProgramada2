package cr.ac.ulead.executables;

import cr.ac.ulead.logic.ProductListLogic;
import cr.ac.ulead.ui.Display;

public class ExecutableProductList {

    public static void main(String[] args) {

        Display display = new Display();
        ProductListLogic logic = new ProductListLogic();

        int menuSelection;
        do {
            display.showMainMenuForList();
            menuSelection = display.readValue();
            logic.executeProductList(menuSelection);
        } while (menuSelection != 4);
    }
}
