import com.kodtodya.practice.inheritance.service.CarService;
import com.kodtodya.practice.inheritance.service.SportsCarService;

public class VehicleInheritanceDemo {
    public static void main(String[] args) {

        SportsCarService sportsCar = new SportsCarService();
        sportsCar.move(); // parent methods is accessible
        sportsCar.speeds(); // own methods too are accessible
        sportsCar.turbo(); // own methods too are accessible
    }
}