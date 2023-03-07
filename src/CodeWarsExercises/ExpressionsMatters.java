package CodeWarsExercises;

//Task
//Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ()
//In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained (Read the notes for more detail about it)
//Example
//With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:
//
//1 * (2 + 3) = 5
//1 * 2 * 3 = 6
//1 + 2 * 3 = 7
//(1 + 2) * 3 = 9
//So the maximum value that you can obtain is 9.
public class ExpressionsMatters {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 10;
        int minimumValue = Integer.MIN_VALUE;
        Integer[] sumList = new Integer[4];
        sumList[0] = a * (b + c);
        sumList[1] = a * b * c;
        sumList[2] = a + b * c;
        sumList[3] = (a + b) * c;
        for (Integer integer : sumList) {
            if (integer > minimumValue) {
                minimumValue = integer;
            }
        }
        System.out.println(minimumValue);
    }
}


//public class Kata
//{
//    public static int expressionsMatter(int a, int b, int c)
//    {
//
//      int[] myArray = {a+b+c, a*b*c, a+b*c, a*b+c, (a+b)*c, a*(b+c)};
//      int max = 0;
//      for(int i = 0; i<myArray.length; i++ ){
//        if(myArray[i] > max ){
//          max = myArray[i];
//        }
//      }
//      return max;
//    }
//}
