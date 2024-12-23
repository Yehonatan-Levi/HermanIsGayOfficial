public enum Category {
    CLOTHING(20),
    HILLEL(0),
    HERMAN(100),
    ELECTRONICS(13),
    CHAIRS(66);

    private final int salePercentage;

    Category(int salePercentage){
        this.salePercentage = salePercentage;
    }

    public int getSalePercentage(){
        return salePercentage;
    }
}
