public abstract class Organism implements IAnimal {


    @Override
    public void die() {
        System.out.println("OH no \n i dead");
    }

    @Override
    public void eat() {
        System.out.println("ohhhhhh foodddddd");
    }

    @Override
    public void sleep() {
        System.out.println("zzzzzzzZZZZZZZzzzzzZZZZZZZZzzz");
    }

    @Override
    public void mentor() {
        System.out.println("Let me tell you of the time I WAS IN GB");
    }
}
