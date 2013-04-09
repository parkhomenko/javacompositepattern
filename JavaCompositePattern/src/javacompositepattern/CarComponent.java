package javacompositepattern;

public abstract class CarComponent {
    
    public abstract void print(int indent);
    
    public void add(CarComponent system) {
        throw new UnsupportedOperationException();
    }
    
    public void remove(CarComponent system) {
        throw new UnsupportedOperationException();
    }
    
    public CarComponent getChild(int index) {
        return null;
    }
}