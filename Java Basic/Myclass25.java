import java.util.Scanner;
//import java.util.*; to import all classes in java.util package
public class Myclass26{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of student ?");
		int studentcount = scanner.nextInt();

		int marks[] = new int[studentcount];
		
        
		for(int i=0; i<studentcount;i++)
		{
			System.out.print("Enter student "+(i+1)+" marks :");
			marks[i] = scanner.nextInt();
		}
		int total =0;
		for(int i=0; i<studentcount;i++)
		{
            total +=marks[i];
		}
		System.out.println("ICT total marks :" +total);
		System.out.println("Average ICT marks : "+(float)(total/studentcount));
        int max = marks[0];
        int min = marks[0];
		for(int i=1; i<studentcount; i++)
		{
			if(max<marks[i])
			{
				max = marks[i];
			}

			if(min>marks[i])
			{
				min = marks[i];
			}
		}
        
		System.out.println("Maximun ICT marks :" +max);
		System.out.println("Minimun ICT marks :" +min);

		System.out.print("What is the marks you want to seach for ?");
		int seach  = scanner.nextInt();

		for(int i=0; i<studentcount; i++)
		{
			if(marks[i]==seach)
			{
				System.out.println("Student "+(i+1)+"has got the marks" +seach);
			}
		}

	}


}