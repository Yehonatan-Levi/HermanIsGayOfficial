public class Product {

    private final String name;
    private final Category category;
    private double price;
    private Currency currency;

    public Product(String name, double price, Currency currency, Category category) {
        this.name = name;
        this.price = price;
        this.currency = currency;
        this.category = category;
    }

    public double getPriceAfterSaleWithRequestedCurrency(Currency currency) {
        if (this.currency == currency) {
            return price * category.getSalePercentage() / 100;
        }
        return currency.exchangeToCurrency(price) * (100 -  category.getSalePercentage()) / 100;
    }

}
