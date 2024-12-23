public record Product(String name, Category category, double price, Currency currency) {
    private static final int PERCENTAGE_IN_A_WHOLE = 100;

    public double getPriceAfterSaleByCurrency(Currency currency) {
        if (this.currency == currency) {
            return price * (PERCENTAGE_IN_A_WHOLE - category.getSalePercentage()) / PERCENTAGE_IN_A_WHOLE;
        }
        return this.currency.exchangeToCurrency(price, currency) * (PERCENTAGE_IN_A_WHOLE - category.getSalePercentage()) / PERCENTAGE_IN_A_WHOLE;
    }

}
