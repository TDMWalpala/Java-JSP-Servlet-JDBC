public class MyClass29{
    public static void main(String[] args) {

        int a;              // this is correct

        final int b;        
        b = 30;

        final int c = 10;   // this is correct

        //System.out.println(a);
        System.out.println(b);

        // b = 40;             // this gives an error - Error A

        // c = 50;             // this gives an error - Error B

        System.out.println(c);
    }
}