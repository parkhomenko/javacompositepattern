package javacompositepattern;

public class JavaCompositePattern {
    
    public static void main(String[] args) {
        
        CarComponent brakeSystem = new CarSystem("Brake System");
        CarComponent pedals = new CarDetail("Brake pedals");
        CarComponent pads = new CarDetail("Brake pads");
        CarComponent lines = new CarDetail("Brake lines");
        brakeSystem.add(pedals);
        brakeSystem.add(pads);
        brakeSystem.add(lines);
        
        CarComponent carEngine = new CarSystem("Car Engine");
        CarComponent plugs = new CarDetail("Spark Plugs");
        CarComponent oil = new CarDetail("Engine Oil");
        carEngine.add(plugs);
        carEngine.add(oil);
        
        CarComponent coolantSystem = new CarSystem("Coolant System");
        CarComponent antiFreeze = new CarDetail("Anti Freeze");
        coolantSystem.add(antiFreeze);
        
        CarComponent car = new CarSystem("The Car");
        car.add(brakeSystem);
        car.add(carEngine);
        car.add(coolantSystem);
        
        CarBuyer buyer = new CarBuyer(car);
        buyer.getCar();
    }
}