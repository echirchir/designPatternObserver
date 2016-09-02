
package designpatterns;

import java.util.ArrayList;
import java.util.List;


public class Subject2 implements ISubject{
    
    private final List<IObserver> otherObservers = new ArrayList<>();
    private int newValue;

    public int getNewValue() {
        return newValue;
    }

    public void setNewValue(int newValue) {
        this.newValue = newValue;
        
        notifyObservers(newValue);
    }
   

    @Override
    public void register(IObserver o) {
        otherObservers.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        otherObservers.remove(o);
    }

    @Override
    public void notifyObservers(int update) {
        for (int i = 0; i < otherObservers.size(); i++) {
            
            otherObservers.get(i).update(this.getClass().getCanonicalName(), update);
            
        }
    }
    
}
