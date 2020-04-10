package java_practice;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /* a strange /* // /* single-line comment */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            String[] b = new String[a];
            b[a] = sc.nextLine();
            if(b.length>10){
                int c=b.length-2;
                System.out.println(b[0]+ c+b[b.length-1]);
            }
            else{
                System.out.println(b);
            }
        }
    }
}
