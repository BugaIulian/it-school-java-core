package CodeForces849;

import java.util.Scanner;

public class Codeforces1 {
    public static void main(String[] args) {
//  New scanner object!
        Scanner scanner = new Scanner(System.in);

//  Integer pentru a alege de cate cazuri avem nevoie!!

        System.out.println("Please type a number from 1 to 26:");
        int inputScanner = scanner.nextInt();
//  Am creat un string care sa contina textul "codeforces"
        String codeForces = "codeforces";
        //                   012345
/*
  Aici am creat un while loop in caz ca utilizatoru o sa alege un numar mai mare ca 26.
  O sa se repete pana in momentul in care utilizatorul alege numarul corect.
*/
        while (inputScanner > 26) {
            System.out.println("Please provide a number from 1 to 26, any other numbers will repeat this statement:");

            inputScanner = scanner.nextInt();
        }

/*
  Aici am avut nevoie de un for loop pentru a crea literele din alfabet conform ca numar dupa primul integer introdus.
  iterez din primul char care este "a" pana la : x < a + numarul introdus initial in proiect. Daca pun spre exemplu int 2 in input,
  o sa am prima iterare de la "a" apoi urmeaza 'a' + 1 = b
*/

        for (char x = 'a'; x < 'a' + inputScanner; x++) {
            System.out.print(x + " "); // OUT  a  b  c  etc
/*
    Iar aici am folosit logica urmatoare: daca indexul din "codeforces" of x (caracterele iterate) este mai mare sau egal cu 0(apartine)
    o sa returneze YES. Spre exemplu codeForces.indexOf(c) o sa returneze true. Adica acel char face parte din textul "codeforces"!
*/
            if (codeForces.indexOf(x) >= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO"); // Else < 0 o sa returneze NO
            }
        }
        scanner.close(); // invata de la Anton, it's a good thing to close the scanner.
    }
}

