import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Poder {

    public static void main(String[] args) {
        Scanner azu = new Scanner(System.in);
        int a = azu.nextInt();
        int b = azu.nextInt();
        if(a>=1 && a<=1000 && b>=2 && b<=10){
            double root = Math.pow(a, 1/(double)b);
            int root1 = (int)root;
                int[]r = new int [root1];
            int reita = 0;
            for (int i=0; i<r.length; i++){
                r[i]= (int)Math.pow(i+1,b);
            }
        int m =0;
            for(int j=r.length-1; j>=0; j--){
                m = r[j]+m;
                for(int p=r.length-1; p>0; p--){
                    if(m==a){
                        reita ++;
                        m=r[j]+r[p];
                    }
                else if (m<a){
                    m=m+r[p];
                    
                }
                else{
                    m=r[j]+r[p];
                }
                }
               m=0;     
          
            }
            System.out.println(reita);
        }
    }
}
        
    
