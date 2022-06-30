package factoryModel.imp;

import factoryModel.model.Button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Vc criou WindowsButton");
    }
}
