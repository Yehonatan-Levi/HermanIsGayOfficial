public record Product(String name, Category category, double price, Currency currency) {
    public double getPriceAfterSaleByCurrency(Currency wantedCurrency) {
        if (this.currency == wantedCurrency) {
            return category.getPriceAfterSale(price);
        }
        return category.getPriceAfterSale(this.currency.exchangeToCurrency(price, wantedCurrency));
    }
}
