package AdressBook;

import java.util.Scanner;

class PersonInfo {
    String name;
    String address;
    String phoneNum;

    Scanner sc = new Scanner(System.in);

    public PersonInfo(String name, String address, String phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    void newRecord(){
        this.name = sc.next();
        this.address = sc.next();
        this.phoneNum = sc.next();

    }

    void updateRecord(){

        System.out.println(name);
        System.out.println(address);
        System.out.println(phoneNum);


    }

    void deleteRecord(){
        this.name = null;
        this.address = null;
        this.phoneNum = null;

    }
}
