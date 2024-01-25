import java.util.Scanner;
class marksheet
{
public static void main(String[] args)
{
int s1,s2,s3,s4,total;
int i1,i2,i3,i4;
int t1,t2,t3,t4;
float per ;
Scanner n=new Scanner(System.in);
System.out.printf("enter the marks of s1");
i1=n.nextInt();
t1=n.nextInt();
System.out.printf("enter the marks of s2");
i2=n.nextInt();
t2=n.nextInt();
System.out.printf("enter the marks of s3");
i3=n.nextInt();
t3=n.nextInt();
System.out.printf("enter the marks of s4");
i4=n.nextInt();
t4=n.nextInt();
s1=i1+t1;
s2=i2+t2;
s3=i3+t3;
s4=i4+t4;
total=s1+s2+s3+s4;
per=total/4;
System.out.printf("\t\t\tYash Marksheet");
System.out.printf("\n---------------------------------------------------------------");
System.out.printf("\n Subject name\t Internal/20 \t Theory/80 \t Total/100");
System.out.printf("\n C language        "+i1+"      \t     "+t1+"  \t     "+s1      );
System.out.printf("\n C++               "+i2+"      \t     "+t2+"  \t     "+s2      );
System.out.printf("\n JAVA              "+i3+"      \t     "+t3+"  \t     "+s3      );
System.out.printf("\n PYTHON            "+i4+"      \t     "+t4+"  \t     "+s4      );
System.out.printf("\nTotal  mark you obtain                               "+total   );
System.out.printf("\nYou get good percentage                              "+per     );
   
}
}
