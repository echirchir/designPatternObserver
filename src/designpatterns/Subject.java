
package designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{
    
    private int myValue;
    
    private final List<IObserver> observersList = new ArrayList<>();

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
        
        notifyObservers(myValue);
    }
    
   
    @Override
    public void register(IObserver o) {
        observersList.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observersList.remove(o);
    }

    @Override
    public void notifyObservers(int value) {
        
        for (int i = 0; i < observersList.size(); i++) {
            
            observersList.get(i).update(this.getClass().getCanonicalName(), value);
            
        }
    }
    
}
