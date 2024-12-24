public enum Currency {
    NIS(0.27),
    USD(1);

    private final double toDollarRatio;

    Currency(double toDollarRatio) {
        this.toDollarRatio = toDollarRatio;
    }

    public double exchangeToDollar(double amount) {
        return amount * toDollarRatio;
    }

    public double exchangeToCurrency(double amount, Currency currency) {
        return exchangeToDollar(amount) / currency.toDollarRatio;
    }
}
