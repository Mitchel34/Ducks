abstract class lazyPeople {
    public interface sitting {
        void sit();
    }

    public void sleeping() {
        System.out.println("Sleeping...");
    }

    public void resting() {
        System.out.println("Resting...");
    }

    class sittingOnChair implements sitting {
        @Override
        public void sit() {
            System.out.println("Sitting on a chair...");
        }
    }

    class sittingOnBed implements sitting {
        @Override
        public void sit() {
            System.out.println("Sitting on a bed...");
        }
    }

    class sittingOnHead implements sitting {
        @Override
        public void sit() {
            System.out.println("Sitting on head...");
        }
    }

    public static void main(String[] args) {
        lazyPeople lazyBedPerson = new lazyPeople() {
        };
        lazyBedPerson.sleeping();
        lazyBedPerson.resting();
        lazyBedPerson.new sittingOnBed().sit();

        lazyPeople lazyChairPerson = new lazyPeople() {
        };
        lazyChairPerson.sleeping();
        lazyChairPerson.resting();
        lazyChairPerson.new sittingOnChair().sit();

        lazyPeople lazyHeadPerson = new lazyPeople() {
        };
        lazyHeadPerson.sleeping();
        lazyHeadPerson.resting();
        lazyHeadPerson.new sittingOnHead().sit();
    }
}