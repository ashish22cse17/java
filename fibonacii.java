import java.util.Scanner;
public class fibonacii{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=-1,b=1,c;
        for(int i=0;i<n;i++){
        c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
        }
        sc.close();
    }
}
