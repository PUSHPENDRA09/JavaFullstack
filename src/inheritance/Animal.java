package inheritance;

    public class Animal{
        void eat(){
            System.out.println("animals can eat");
        }
    }

    class Dog extends Animal {
        void run()
        {
            System.out.println("can run everywhere");
        }
    }

    class BabyDog extends Dog{
        void sleep()
        {
            System.out.println("cam sleep & eat");
        }
    }

    class AnimalImpl{
        public static void main(String args[])
        {
            BabyDog babydog = new BabyDog();
            babydog.sleep();
            babydog.eat();
            babydog.run();
            babydog.eat();


        }
    }

