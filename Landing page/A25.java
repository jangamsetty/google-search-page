package string1;

import java.util.Scanner;

public class A25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     int i=sc.nextInt();
     int j=sc.nextInt();
     int []k=new int[j];
     for(int l=0;l<j;l++)
     {
    	k[l]=sc.nextInt(); 
     }
     int count=0;
     for(int l1=0;l1<k.length-1;l1++)
     {
    	 for(int l2=l1+1;l2<k.length;l2++)
    	 {
    		 if(k[l1]+k[l2]==i)
    		 {
              count++;
    		 }
    	 }
     }
     System.out.println(count);

	}

}
