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
    static class MallardDuck extends duck implements Flyable {
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
    static class RedHeadDuck extends duck implements Flyable {
        @Override
        public void display() {
            System.out.println("Displaying Red Head Duck...");
        }

        @Override
        public void fly() {
            System.out.println("I'm Flying with wings.");
        }
    }

    // gray duck subclass also iplements flyable and defines the fly method
    static class GrayDuck extends duck implements Flyable {
        @Override
        public void display() {
            System.out.println("Displaying Gray Duck...");
        }

        @Override
        public void fly() {
            System.out.println("I'm Flying with wings.");
        }
    }

    public static void main(String[] args) {
        //test the implementation
        duck mallard = new MallardDuck();
        mallard.display();
        ((Flyable) mallard).fly(); // casting to flyable interface

        duck redDuck = new RedHeadDuck();
        redDuck.display();
        ((Flyable) redDuck).fly(); // casting to flyable interface

        duck grayDuck = new GrayDuck();
        grayDuck.display();
        ((Flyable) grayDuck).fly(); // casting to flyable interface

    }
}