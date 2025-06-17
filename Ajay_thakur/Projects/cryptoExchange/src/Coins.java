public class Coins {

    private String CoinName;
    private String coinSymbol;
    private int coinQuantity;
    private double coinPrice;
    private String dateOfPublish;

    public Coins(String coinName, String coinSymbol, int coinQuantity, double coinPrice, String dateOfPublish) {
        CoinName = coinName;
        this.coinSymbol = coinSymbol;
        this.coinQuantity = coinQuantity;
        this.coinPrice = coinPrice;
        this.dateOfPublish = dateOfPublish;
    }

    public String getCoinName() {
        return CoinName;
    }

    public String getCoinSymbol() {
        return coinSymbol;
    }

    public int getCoinQuantity() {
        return coinQuantity;
    }

    public double getCoinPrice() {
        return coinPrice;
    }

    public String getDateOfPublish() {
        return dateOfPublish;
    }

    public void setCoinName(String coinName) {
        CoinName = coinName;
    }

    public void setCoinSymbol(String coinSymbol) {
        this.coinSymbol = coinSymbol;
    }

    public void setCoinQuantity(int coinQuantity) {
        this.coinQuantity = coinQuantity;
    }

    public void setCoinPrice(double coinPrice) {
        this.coinPrice = coinPrice;
    }

    public void setDateOfPublish(String dateOfPublish) {
        this.dateOfPublish = dateOfPublish;
    }
}
