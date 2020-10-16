package AddressBook;

import java.util.Scanner;

public class AddressBookTest {
    public static void main(String[] args) {

        Record arr[] = new Record[10];

        Scanner sc = new Scanner(System.in);


        int i = 0;
        int n;
        while (true)
        {
            System.out.println();
            System.out.println("Choose an action");
            System.out.println();
            System.out.println("For new record press '1'\nFor update record press '2'\nFor delete address press '3'\nFor addressBook press '4'\nWant to stop the program press '5'");
            n = sc.nextInt();
            if (n == 1) {
                sc.nextLine();
                System.out.println("Write Name Phone Number and Address per line");
                arr[i] = new Record(sc.nextLine(), sc.nextLine(), sc.nextLine());
                i++;
            }
            else if (n == 2)
            {
                System.out.println("Give the index number to update information");
                int index = sc.nextInt();
                sc.nextLine();
                System.out.println("Write Name Phone Number and Address per line");
                arr[index] = new Record(sc.nextLine(),sc.nextLine(),sc.nextLine());
            }
            else if (n == 3)
            {
                System.out.println("Give the index number to delete information");
                int index = sc.nextInt();
                sc.nextLine();
                arr[index] = new Record(null,null,null);
            }
            else if(n == 4)
            {
                System.out.println("Address Book:");
                for (int j = 0; j<i;j++)
                {
                    System.out.println("Information at index "+j);
                    System.out.println(arr[j].getName());
                    System.out.println(arr[j].getPhnNum());
                    System.out.println(arr[j].getAddress());
                    System.out.println();
                }
                System.out.println();
            }

            else if(n == 5)
            {
                System.out.println("This is the final Address book ");

                for (int k = 0; k<i;k++)
                {
                    System.out.println("Information at index "+k);
                    System.out.println(arr[k].getName());
                    System.out.println(arr[k].getPhnNum());
                    System.out.println(arr[k].getAddress());
                    System.out.println();
                }
                break;
            }

        }
    }
}
