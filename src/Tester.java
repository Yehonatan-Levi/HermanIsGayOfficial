public class Tester {
    public static void main(String[] args){
        Missions.printMaxNumber();

        System.out.println("\n------------------------------\n");

        Product shirt = new Product("shirt", Category.CLOTHING, 89.90, Currency.NIS);
        System.out.println(shirt.getPriceAfterSaleByCurrency(Currency.USD));
    }
}
