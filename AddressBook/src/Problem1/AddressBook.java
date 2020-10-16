
import java.util.Scanner;

class Record{
    private String name, designation, email, address;
    private int mob_number;
    
    Record(String name, int mob_number, String designation, String email, String address){
        this.name=name;
        this.designation=designation;
        this.email=email;
        this.address=address;
        this.mob_number=mob_number;
        
    }
    void editName(String name){
        this.name=name;
        System.out.println("Name Updated");
    }
    void editMobNumber(int mob_number){
        this.mob_number=mob_number;  
        System.out.println("Mobile No. Updated");
    }
    void editDesignation(String designation){
        this.designation=designation;
        System.out.println("Designation Updated");
    }
    void editEmail(String email){
        this.email=email;
        System.out.println("Email Updated");
    }
    void editAddress(String address){
        this.address=address;
        System.out.println("Address Updated");
    }
    void delete(){
        name="\0";
        designation="\0";
        email="\0";
        address="\0";
        mob_number=0;
        System.out.println("Deleted");
    }
    void print(){
        System.out.println("Name:           "+name);
        System.out.println("Designation:    "+designation);
        System.out.println("Mobile No:      "+mob_number);
        System.out.println("Email:          "+email);
        System.out.println("Address:        "+address);
    }
    
   
    
}
public class AddressBook {
        static Scanner input=new Scanner(System.in);
        
        static String name, designation, email, address;
        static int mob_number;
 
        static Record person[]=new Record[200];
        static int n=0;
        
        static void add(){
            n++;
            for(int i=(n-1); i<n; i++){
            System.out.println("Entry: "+(i+1));
            System.out.print("Name:         ");
            name=input.nextLine();
            System.out.print("Mobile:       ");
            mob_number=input.nextInt();
            System.out.print("Designation:  ");
            input.nextLine();
            designation=input.nextLine();
            System.out.print("Email:        ");
            email=input.nextLine();
            System.out.print("Address:      ");
            address=input.nextLine();
            
            person[i]=new Record(name, mob_number, designation, email, address);
            
            }
        }
        
    
        public static void main(String[] args) {
            
            System.out.println("New Entry:  1");
            System.out.println("Edit:       2");
            System.out.println("Delete:     3");
            System.out.println("Print:      4");
            System.out.println("Close:      0");
            
           
            while(true){
                int comand;
                System.out.println("");
                System.out.print("Enter Command: ");
                comand=input.nextInt();
                input.nextLine();
                if(comand==1){
                    add();
                }
            
                if(comand==2){
                    int edt, entry;
                    System.out.print("Select Entry: ");
                    entry=input.nextInt();
                    System.out.println("");
                    
                    if(person[(entry-1)]==null){
                        System.out.println("Not Found");
                    }
                    else{
                        System.out.println("Edit Mode: ");
                        System.out.println("Name:         1");
                        System.out.println("Mobile:       2");
                        System.out.println("Designation:  3");
                        System.out.println("Email:        4");
                        System.out.println("Address:      5");
                        System.out.print("Select Mode: ");
                        edt=input.nextInt();
                    
                        if(edt==1){
                            String newName;
                            System.out.print("Enter New Name: ");
                            input.nextLine();
                            newName=input.nextLine();
                            person[(entry-1)].editName(newName);
                        }
                    
                        if(edt==2){
                            int newNum;
                            System.out.print("Enter New Number: ");
                            newNum=input.nextInt();
                            person[(entry-1)].editMobNumber(newNum);
                        }
                    
                        if(edt==3){
                            String newDesig;
                            System.out.print("Enter New Designation: ");
                            input.nextLine();
                            newDesig=input.nextLine();
                            person[(entry-1)].editDesignation(newDesig);
                        }
                    
                        if(edt==4){
                            String newEmail;
                            System.out.print("Enter New Email: ");
                            input.nextLine();
                            newEmail=input.nextLine();
                            person[(entry-1)].editEmail(newEmail);
                        }
                    
                        if(edt==5){
                            String newAdd;
                            System.out.print("Enter New address: ");
                            input.nextLine();
                            newAdd=input.nextLine();
                            person[(entry-1)].editAddress(newAdd);
                        }
                    }
                    
                }
                
                if(comand==3){
                    System.out.print("Delete Entry: ");
                    int entry=input.nextInt();
                    if(person[(entry-1)]==null){
                        System.out.println("Entry Does Not Esist");
                    }
                    else{
                        person[(entry-1)]=null;
                        System.out.println("Entry Deleted");
                    }
                }
            
                if(comand==4){
                    System.out.print("Disply Entry: ");
                    int entry=input.nextInt();
                    if(person[(entry-1)]==null){
                    System.out.println("Empty");
                    }
                    else{
                        person[(entry-1)].print();
                    }
                
                }
                               
                if(comand==0){
                    break;
                }
            } 
  
    }
    
}
