
package designpatterns;


public class Observer2 implements IObserver{

    @Override
    public void update(String s, int i) {
        System.out.println("Observer 2 value changed to: " + s +", "+ i);
    }
    
}
