
package designpatterns;

public class Observer3 implements IObserver{

    @Override
    public void update(String s, int i) {
        System.out.println("Observer 3 value changed to: " + s +", "+ i);
    }
    
}
