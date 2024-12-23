public class Parrot extends Animal{

    private final String name;

    public Parrot (String name){
        this.name = name;
    }

    @Override
    public void makeNoise(){
        System.out.println("hi Im " + name);
    }

    public void makeNoise(String message){
        System.out.println((message));
    }
}
