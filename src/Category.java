public enum Category {
    CLOTHING(20),
    HILLEL(0),
    HERMAN(100),
    ELECTRONICS(13),
    CHAIRS(66);

    private static final int PERCENTAGE_IN_A_WHOLE = 100;
    private final int salePercentage;

    public double getPriceAfterSale(double amount){
        return amount * (PERCENTAGE_IN_A_WHOLE - salePercentage) / PERCENTAGE_IN_A_WHOLE;
    }

    Category(int salePercentage){
        this.salePercentage = salePercentage;
    }

    public int getSalePercentage(){
        return salePercentage;
    }
}
