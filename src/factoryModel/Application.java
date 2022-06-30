package factoryModel;

import factoryModel.model.Button;
import factoryModel.model.Checkbox;
import factoryModel.model.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory){
        this.button =  guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
