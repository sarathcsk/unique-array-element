/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unique.integer;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class UniqueInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        System.out.println("enter the no array elements");
        Scanner s =new Scanner(System.in);
        a=s.nextInt();
        int[] n=new int[a];
        int[] n1=new int[a];
        int k=0,flag=0;
        System.out.println("enetr the array elements");
        for(int i=0;i<a;i++)
        {
            n[i]=s.nextInt();
        }
        for(int i=0;i<a;i++)
        {  flag=0;
            for(int j=i+1;j<a;j++)
            {
                if(n[i]==n[j])
                {
                  flag=1;
                  n[i]=-1;
                  n[j]=-1;
                  break;
                    
                }
            }
            if(flag==0)
            {
                if(n[i]!=-1)
                {
                n1[k]=n[i]; 
                  k++;
            }}
        }
        
        for(int i=0;i<k;i++)
        {
            System.out.println("\t"+n1[i]);
        }
        
       
    }
    
}
