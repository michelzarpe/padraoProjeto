package builder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        System.out.println("--------------------------------------------------------------------------------");
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car build: \n" +car);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------");
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        Manual manual = carManualBuilder.getResult();
        System.out.printf("Car manual build: \n" +manual.print());
        System.out.printf("--------------------------------------------------------------------------------");
    }
}
