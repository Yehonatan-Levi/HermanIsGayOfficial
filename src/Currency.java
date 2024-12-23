public enum Currency {
    NIS(3.65),
    USD(0.27);

    private final double toOtheCurrencyRatio;

    Currency(double toDollarRatio) {
        this.toOtheCurrencyRatio = toDollarRatio;
    }

    public double exchangeToCurrency(double amount) {
        return amount * this.toOtheCurrencyRatio;
    }
}
