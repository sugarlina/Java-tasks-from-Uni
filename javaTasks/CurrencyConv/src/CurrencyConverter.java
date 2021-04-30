public class CurrencyConverter {
    double[] exchangeRates;

    void setExchangeRates(double[] rates) {
        exchangeRates = rates;
    }

    void updateExchangeRates(int arrayIndex, double newVal) {
        exchangeRates[arrayIndex] = newVal;
    }

    double getExchangeRates(int arrayIndex) {
        return exchangeRates[arrayIndex];
    }

    double computeTransferRate(int arrayIndex, double amount) {
        return amount * getExchangeRates(arrayIndex);
    }

    void printCurrencies(){
        System.out.println("rupee "+exchangeRates[0]);
        System.out.println("dirham "+exchangeRates[1]);
        System.out.println("real "+exchangeRates[2]);
        System.out.println("chilean_peso "+exchangeRates[3]);
        System.out.println("$australian "+exchangeRates[exchangeRates.length-1]);

    }
    public static void main (String [] args)
    {
        CurrencyConverter c=new CurrencyConverter();

        double[] rates={63.0,3.0,3.0,595.0,18.0,107.0,2.0};
        c.setExchangeRates(rates);
        c.printCurrencies();

        rates=new double[] {63.0,3.0,3.0,595.0,18.0,107.0,2.0};
        c.setExchangeRates(rates);
        c.printCurrencies();
        c.updateExchangeRates(0,66.0);
        c.printCurrencies();
        double amount= c.computeTransferRate(0,100);
        System.out.println("\nTransferred amount: "+ amount);
    }

}
