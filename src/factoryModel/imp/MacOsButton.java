package factoryModel.imp;

import factoryModel.model.Button;

public class MacOsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Vc criou MacOsButton");
    }
}
