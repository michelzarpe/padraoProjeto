package factoryModel.imp;

import factoryModel.model.Checkbox;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Vc criou WindowsCheckbox");
    }
}
