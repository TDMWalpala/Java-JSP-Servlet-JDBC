import java.util.Scanner;

// code by student 1
class Exercise5 {
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);

        System.out.print("Enter 1st angle: ");
        final int firstangle = newscan.nextInt();
        System.out.print("Enter 2nd angle: ");
        int secondangle = newscan.nextInt();
        System.out.print("Enter 3rd angle: ");
        int thirdangle = newscan.nextInt();

        int totalangle = firstangle+secondangle+thirdangle;
        if (totalangle == 180){
            System.out.println("This is a valid triangle");
        }
        else{
            System.out.println("This is not a valid triangle");
        }
    }
}

// code by student 2
class Test {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please Enter your 1st angle = ");
        int num1 = myScanner.nextInt(); 

        Scanner myScanner2 = new Scanner(System.in);
        System.out.print("Please Enter your 2nd angle = ");
        int num2 = myScanner2.nextInt(); 

        Scanner myScanner3 = new Scanner(System.in);
        System.out.print("Please Enter your 3rd angle = ");
        int num3 = myScanner3.nextInt(); 

        if((num1 + num2 + num3) == 180){
            System.out.print("yes ");
        }
        else{
            System.out.print("no");
        }
    }
}

// code by student 3
public class MyClass28{
    public static void main(String[] args) {
        
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Enter an angle1 : ");
        int angle1 = myscanner.nextInt();

        System.out.println("Enter an angle2 : ");
        int angle2 = myscanner.nextInt();

        System.out.println("Enter an angle3 : ");
        int angle3 = myscanner.nextInt();

        int angle = angle1 + angle2 + angle3;
        
        if (angle == 180) {
            System.out.println("Traingle is valid");
        }else{
            System.out.println("Invalid Triangle");
        }
        

    }
}

// code by student 4
class Triangle{  
    public static void main(String args[]){  
        int num1,num2,num3; 

        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the first number: ");  
        num1 = sc.nextInt();  
        System.out.print("Enter the second number: ");  
        num2 = sc.nextInt(); 
        System.out.print("Enter the third number: ");  
        num3 = sc.nextInt(); 

        if (num1+num2+num3 == 180){
            System.out.println("Valid Triangle"); 
        } else{
            System.out.println("Not Valid Triangle");
        }
    }
}

// code by student 5
class FirstAct {
    
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter First Angle: ");
        float r1 = in.nextFloat();
        System.out.print("Enter First Angle: ");
        float r2 = in.nextFloat();
        System.out.print("Enter First Angle: ");
        float r3 = in.nextFloat();
        
        if((r1+r2+r3) == 180) {
            System.out.print("3 angles of Triangle are Valid");  
        }else
            System.out.print("3 angles of Triangle are not Valid");    
    }
}

