package javacompositepattern;

/**
 * 
 * Component Class
 */
public abstract class CarComponent {
    
    /**
     * Operation method
     * 
     * @param indent The indent of the current component
     */
    public abstract void print(int indent);
    
    /**
     * Method in which a new component can be added to the list
     * 
     * @param system The component to add
     */
    public void add(CarComponent system) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Method in which a specified component can be deleted from the list
     * 
     * @param system The component to delete
     */
    public void remove(CarComponent system) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Method in which a component can be obtained by its index in the list
     * 
     * @param index The index of the component in the list
     * @return The component from the list
     */
    public CarComponent getChild(int index) {
        return null;
    }
}