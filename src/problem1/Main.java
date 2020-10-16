package problem1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Club obj[] = new Club[n];

        for (int i = 0; i<n; i++){
            obj[i] = new Club(sc.next(),sc.nextInt());

        }

        sc.close();
    }

}




//    Main function:
//        First take an integer n from console,
//        then take total n number of clubs information, then you have to print each club’s information in sorted order based on the total number of current players.
//        For each club, you have to print the player’s information in sorted order based on the jersey number.
//        Sample Input:
//        2
//        Barcelona 2
//        Xyz 2000 1
//        Hed 3000 6
//        Realmadrid 3
//        Debjh 3000 4
//        Idjieded 3000 2
//        Kdbeb 40000 7
//        Output:
//        Club name: RealMadrid Total Players: 3
//        Player name: Idjieded Salary: 3000 Jersey No:2
//        Player name: Debjh Salary:3000 Jersery No:4
//        Player name: Kdbeb Salary: 40000 Jersey No: 7
//
//        Club Name:Barcelona Total Players:2
//        Player Name: Xyz Salary: 2000 Jersey Number:1
//        Player Name: Hed Salary:3000 Jersey Number: 6
