import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
Cat cat = new Cat (4,3);
Dog dog1 = new Dog (5, 2);
Lion lion1 = new Lion (2,2);
Cow cow1 = new Cow();
        System.out.println(cat);
        System.out.println(dog1);
        // Здесь в классе Lion нет метода toString, поэтому метод взят из родительского класса
        System.out.println(lion1);
        System.out.println(cow1);
        cat.food();
        lion1.free();
        dog1.sound();
        cat.sound();
        lion1.food();
        lion1.bite();
        dog1.bite();
           System.out.println();
            cow1.sounding();
        System.out.println();
Car car1 = new Car("Green", "gas", 2010);
        System.out.println(car1);
    }
}