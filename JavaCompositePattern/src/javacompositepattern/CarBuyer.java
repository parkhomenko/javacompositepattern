package javacompositepattern;

/**
 * 
 * Client Class
 */
public class CarBuyer {
    
    CarComponent component;
    
    public CarBuyer(CarComponent component) {
        this.component = component;
    }
    
    /**
     * Prints all the tree structure on the console
     */
    public void getCar() {
        component.print(0);
    }
}