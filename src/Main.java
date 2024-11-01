//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 2;



    public static void main(String[] args) {


        Car car1 = new Car("Mersedes");
        Car car2 = new Car("KiAMorning");
        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        thread1.start();
        thread2.start();
    }
}