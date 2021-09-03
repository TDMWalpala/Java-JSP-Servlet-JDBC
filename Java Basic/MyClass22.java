import java.util.Scanner;

// code by student 1
class Exercise4 {
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = newscan.nextInt();

        if((num%3 == 0) || (num%5 == 0)){
            System.out.println(num + " is divisable by 3 or 5");
        }
        else{
            System.out.println(num + " is not divisable by 3 or 5");
        } 
    }
}


// code by student 2
class Test {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please Enter your 1st number = ");
        int num1 = myScanner.nextInt(); 

        //myScanner = new Scanner(System.in);
        System.out.print("Please Enter your 2nd number = ");
        int num2 = myScanner.nextInt(); 

        if((num1 %3 ==0)||(num1 %5 ==0)){
            System.out.println("divisible by 3 or 5");
        }
        else{
            System.out.println("not divisible by 3 or 5");
        }

        if((num2 %3 ==0)||(num2 %5 ==0)){
            System.out.println("divisible by 3 or 5");
        }
        else{
            System.out.println("not divisible by 3 or 5");
        }

    }
}
