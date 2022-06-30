package factoryModel.imp.factory;

import factoryModel.imp.MacOsButton;
import factoryModel.imp.MacOsCheckbox;
import factoryModel.model.Button;
import factoryModel.model.Checkbox;
import factoryModel.model.GUIFactory;

public class MacOsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
