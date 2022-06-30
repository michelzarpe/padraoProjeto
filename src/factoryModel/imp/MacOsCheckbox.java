package factoryModel.imp;

import factoryModel.model.Checkbox;

public class MacOsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Vc criou MacOsCheckbox");
    }
}
