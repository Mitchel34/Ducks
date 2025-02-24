abstract class duck {
    // create an interface
    public interface Flyable {
        void fly();
    }

    public void quack() {
        System.out.println("Quacking...");
    }

    public void swim() {
        System.out.println("Swimming...");
    }

    public abstract void display();

    // mallard duck class that implements flyable
    class MallardDuck extends duck implements Flyable {
        @Override
        public void display() {
            System.out.println("Displaying Mallard Duck...");
        }

        @Override
        public void fly() {
            System.out.println("I'm Flying with wings.");
        }
    }

    // red head duck class that implements flyable
    class RedHeadDuck extends duck implements Flyable {
        @Override
        public void display() {
            System.out.println("Displaying Red Head Duck...");
        }

        @Override
        public void fly() {
            System.out.println("I'm Flying with wings.");
        }
    }

    public static void main(String[] args) {

    }
}