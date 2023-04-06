package dependency_inversion.good_code;

import dependency_inversion.bad_code.KeyBoard;
import dependency_inversion.bad_code.Mouse;

public class MacBook {
    // concrete class. this is wrong. This should be an interface.
    private final KeyBoard keyboard;

    // concrete class. this is wrong. This should be an interface.
    private final Mouse mouse;

    public MacBook(KeyBoard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    void details() {
        keyboard.keyboard();
        mouse.mouse();
    }
}
