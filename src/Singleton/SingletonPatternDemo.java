package Singleton;
/*
https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
 */

public class SingletonPatternDemo {
    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: The constructor SingletonObject() is not visible
        //SingletonObject object = new SingletonObject();

        //Get the only object available
        SingletonObject object = SingletonObject.getInstance();

        //show the message
        object.showMessage();
    }
}
