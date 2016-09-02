
package designpatterns;


public class DesignPatterns {

    
    public static void main(String[] args) {
       
        System.out.println("designpatterns.DesignPatterns.main()");
        
        Subject subject = new Subject();
        Subject2 sub2 = new Subject2();
        
        Observer1 ob1 = new Observer1();
        
        Observer2 ob2 = new Observer2();
        
        Observer3 ob3 = new Observer3();
        
        subject.register(ob1);
        subject.register(ob2);
        subject.register(ob3);
        sub2.register(ob3);
        
        subject.setMyValue(5);
        sub2.setNewValue(10);
        System.out.println("-------");
        subject.setMyValue(25);
        sub2.setNewValue(300);
        System.out.println("-------");
        sub2.setNewValue(200);
        
        subject.unregister(ob1);
        sub2.unregister(ob3);
        
        subject.setMyValue(100);
        sub2.setNewValue(28);
    }
    
}
