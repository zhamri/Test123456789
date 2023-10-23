package my.zhamri;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Car car1 = new Car();
        car1.calculateSpeed();
        car1.openDoor();

        Car car2 = new Car();
        car2.calculateSpeed();
        car2.openDoor();
    }
}
