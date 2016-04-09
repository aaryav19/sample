package sample;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);             
            String s= sc.nextLine();
            System.out.println("s------->"+s);
            
            int n=sc.nextInt();  
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else{
                if(n%2==0){
                    if(2<=n && n<=5){
                        ans = "Not Weird";
                    }else if(6<=n && n<=20){
                        ans = "Weird";
                    }else if(n>20){
                        ans = "Not Weird";
                    }
                }
               //Complete the code
                
            }
            System.out.println(ans);
    }
}
