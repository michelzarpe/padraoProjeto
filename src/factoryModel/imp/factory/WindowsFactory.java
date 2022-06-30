package factoryModel.imp.factory;

import factoryModel.imp.WindowsButton;
import factoryModel.imp.WindowsCheckbox;
import factoryModel.model.Button;
import factoryModel.model.Checkbox;
import factoryModel.model.GUIFactory;

public class WindowsFactory implements GUIFactory {
    
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
