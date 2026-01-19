public class CoffeeShop {
    public static void main(String[] args) {
        Customer cs1 = new Customer("Joseph", 200);
        Customer cs2 = new Customer("Peter");
        Customer cs3 = new Customer();

        cs2.addPoints(80);
        cs2.addPoints(30);

        System.out.println();

        System.out.println("- - - Redemption Reward - - -");
        cs1.redeemReward();
        cs2.redeemReward();
        cs3.redeemReward();

        System.out.println();

        System.out.println("- - - Customer Information - - -");
        cs1.displayCustomerInfo();
        cs2.displayCustomerInfo();
        cs3.displayCustomerInfo();
        Customer.displayTotalCustomers();

        System.out.println();

        System.out.println("- - - New Customer - - -");
        Customer c4 = new Customer("Diane");
        c4.addPoints(50);
        Customer.displayTotalCustomers();

        System.out.println();

        System.out.println("- - - Allowed Reward Redemption - - -");
        Customer.getAllowedRewardRedemption(cs1);
        Customer.getAllowedRewardRedemption(cs2);
        Customer.getAllowedRewardRedemption(cs3);
        Customer.getAllowedRewardRedemption(c4);
    }
}
