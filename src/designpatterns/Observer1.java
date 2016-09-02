
package designpatterns;

public class Observer1 implements IObserver{

    @Override
    public void update(String s, int i) {
        System.out.println("Observer 1 value changed to: " + s +", "+ i);
    }
    
}
