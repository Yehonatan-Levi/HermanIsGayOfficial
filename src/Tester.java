public class Tester {
    public static void main(String[] args){
        Missions.printMaxNumber();

        System.out.println("\n------------------------------\n");

        Product shirt = new Product("shirt", 89.90, Currency.NIS, Category.CLOTHING);
        System.out.println(shirt.getPriceAfterSaleWithRequestedCurrency(Currency.USD));
    }
}
