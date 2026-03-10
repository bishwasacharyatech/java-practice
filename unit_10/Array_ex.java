package unit_10;
import java.util.Scanner;
public class Array_ex {
    public static void main(String[] args) {
        int a[] = new int[8];
        int i,max,min;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter  6 number");
        for(i=0; i<6; i++){
             a[i]=Scan.nextInt();
             


    }
    
    max=a[0];
    min=a[0]; 
    for(i=1; i<6; i++){
            if(a[i]>max)
                max=a[i];
        }
         for(i=1; i<6; i++){
            if(a[i]<min)
                min=a[i];
}
    System.out.println("main value is : "+max);

    System.out.println("main value is : "+min);
    Scan.close();
    
}
}



