package factoryModel;

import factoryModel.imp.factory.MacOsFactory;
import factoryModel.imp.factory.WindowsFactory;
import factoryModel.model.GUIFactory;

import java.util.Locale;

public class Demo {

    private static Application configureApplication(){
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toUpperCase(Locale.ROOT);

        if (osName.contains("mac")){
            factory = new MacOsFactory();
            app = new Application(factory);
        }else{
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
