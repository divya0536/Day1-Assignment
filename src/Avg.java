
import java.util.Scanner;
public class Avg {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of students:");
int n= sc.nextInt();
float GradeAvg = 0;
int grade[] = new int[50];
for(int i=1;i <= n;i++) {
boolean flag=true;
System.out.print("Enter the grade for student "+i+":" );
int numStudents=sc.nextInt();
if(numStudents>100) {
flag=false;
System.out.println("Invalid grade, try again...");
i = i-1;
}
if(flag)
grade[i]=numStudents;
System.out.println();
}
for(int i=0;i<=n;i++) {
GradeAvg += grade[i];
}
System.out.println("The average is: "+GradeAvg/n);
sc.close();
}

}

