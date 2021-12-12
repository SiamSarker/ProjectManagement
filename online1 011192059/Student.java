
package ct;

import java.util.Scanner;

class student
{
private String name;
private int id;
private double Chemistry;
private double Physics;
private  double Math;

student(String name,int id,double Chemistry,double Physics,double Math)
{
this.name=name;
this.id=id;
this.Chemistry=Chemistry;
this.Physics=Physics;
this.Math=Math;
}
 

double calculateAvg()
{
    return((Chemistry+Physics+Math)/3);
}

void printHighest()
{
    
}
public class Student 
{
    
    {
        String name;
        int id;
        double chemistry,physics,math;
        int n;
        
    Scanner input=new Scanner(System.in);
    
        System.out.println("Enter the numbwe of students:");
        n=input.nextInt();
        
        student s[] = new student(n);
        name=input.next();
        id=input.nextInt();
        chemistry=input.nextDouble();
        physics=input.nextDouble();
        math=input.nextDouble();
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j < n; j++)
            {
                System.out.println("Student details:"+j+" ");
                System.out.println(s[i]);
                System.out.println("");
                
            }
            
        }
        
        
        
    }
    
}
}
