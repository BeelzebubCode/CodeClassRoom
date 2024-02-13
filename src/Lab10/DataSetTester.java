package Lab10;

/**
 * This program tests the DataSet class.
 */
public class DataSetTester {
    public static void main(String[] args) {
        final int TRIES = 10;

        DataSet bankData = new DataSet();

        bankData.add(new BankAccount(0));
        bankData.add(new BankAccount(10000));
        bankData.add(new BankAccount(2000));

        System.out.println("Average balance = "
                + bankData.getAverage());
        Measurable max = bankData.getMaximum();
        System.out.println("Highest balance = "
                + max.getMeasure());

        DataSet coinData = new DataSet();

        coinData.add(new Coin(0.25, "quarter"));
        coinData.add(new Coin(0.1, "dime"));
        coinData.add(new Coin(0.05, "nickel"));

        System.out.println("Average coin value = "
                + coinData.getAverage());
        max = coinData.getMaximum();
        System.out.println("Highest coin value = "
                + max.getMeasure());

        System.out.println();
        System.out.println("............ Die ........... ");
        DataSet ds = new DataSet();
        for (int i = 1; i <= TRIES; i++) {
            Die d = new Die(6);
            int n = d.cast();
            ds.add(d);
            System.out.print(n + " ");
        } // for
        System.out.println();
        System.out.println("The average is " + ds.getAverage());
    } // main
}// class