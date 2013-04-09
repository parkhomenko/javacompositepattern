package javacompositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Composite Class
 */
public class CarSystem extends CarComponent {
    
    List<CarComponent> systems = new ArrayList<>();
    
    String name;
    
    public CarSystem(String name) {
        this.name = name;
    }
    
    @Override
    public void add(CarComponent system) {
        systems.add(system);
    }
    
    @Override
    public void remove(CarComponent system) {
        systems.remove(system);
    }
    
    @Override
    public CarComponent getChild(int index) {
        return systems.get(index);
    }
    
    @Override
    public void print(int indent) {
        
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            builder.append("\t");
        }
        if (indent != 0) {
            builder.append(" - ");
        }
        builder.append(this.name);
        
        System.out.println(builder.toString());
        
        indent++;
        
        for (CarComponent system : systems) {
            system.print(indent);
        }
    }
}