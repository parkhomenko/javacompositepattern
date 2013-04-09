package javacompositepattern;


public class CarBuyer {
    
    CarComponent component;
    
    public CarBuyer(CarComponent component) {
        this.component = component;
    }
    
    public void getCar() {
        component.print(0);
    }
}