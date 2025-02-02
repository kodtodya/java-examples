import com.kodtodya.practice.inheritance.service.DogService;

public class AnimalInheritanceDemo {
    public static void main(String[] args) {

        DogService dog = new DogService();

        dog.makeSound(); // parent properties/methods

        dog.bark(); // own properties/methods
    }
}