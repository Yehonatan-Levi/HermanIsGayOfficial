public class RussianCat extends Organism{
    @Override
    public void sleep() {
        System.out.println("      |\\      _,,,---,,_\n" +
                "ZZZzz /,`.-'`'    -.  ;-;;,_\n" +
                "     |,4-  ) )-,_. ,\\ (  `'-'\n" +
                "    '---''(_/--'  `-'\\_) ");
    }

    @Override
    public void mentor() {
        System.out.println("Andrey: im actually from french");
    }
}
