package PlayGround;

public class InterestOnThreeMonths {
    public static void main(String[] args) {

        int amount = 20000;
        int interest = 0;
        for (int i = 0; i < 3; i++) {
            interest = (int) (amount * 0.1);
            amount = amount - interest;
        }
        System.out.println(amount);
    }
}
