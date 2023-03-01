package TernaryOperatorExercises;

public class TO {
    public static void main(String[] args) {

        // Rewrite the following using ternary operator :
        //if(x%2 == 0)
        //c = ‘E’;
        //else
        //c = ‘O’;

        int x = 0;
        char c = 'c';

        c = (x % 2 == 0) ? 'E' : 'O';

        //Rewrite the following statements using ternary operator.
        //if(ch> “C”)
        //value = 200;
        //else
        //value =100;

        int value = 0;
        char ch = 'x';

        value = (ch > 'C') ? 200 : 100;

        //Rewrite the following using ternary operator:
        //if (bill >10000 )
        //discount = bill * 10.0/100;
        //else
        //discount = bill * 5.0/100;

        double bill = 0;
        double discount = 0;

        discount = (bill > 1000) ? bill * 10.0 / 100 : bill * 5.0 / 100;


        //if(number > 0.0)
        //System.out.println(“positive”);
        //else
        //System.out.println(“not positive”);

        int number = 0;
        System.out.println((number > 0) ? "positive" : "notpositive");

        //Here, condition is evaluated and
        //
        //if condition is true, expression1 is executed.
        //And, if condition is false, expression2 is executed.
        //The ternary operator takes 3 operands (condition, expression1, and expression2). Hence, the name ternary operator.

    }
}
