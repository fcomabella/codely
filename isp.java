public interface Animal {
    void run();
}

public interface BarkingAnimal extends Animal {
  void bark();
}

public interface FlyingAnimal extends Animal {
  void fly();
}

public class Dog implements BarkingAnimal {
    @Override
    public void run() {
        System.out.print("Dog is running");
    }

    @Override
    public void bark() {
        System.out.print("Dog is barking");
    }
}

public class Bird implements FlyingAnimal {
    @Override
    public void run() {
        System.out.print("Bird is running");
    }

    @Override
    public void fly() {
        System.out.print("Bird is flying");
    }
}
