
package thang7.He_phan_tan.socketTCP;

import java.util.Scanner;
public class dayFibo {
    public static void main(String[] args) {
    int k, a ,b ,p;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập vào số phần tử của dãy Fibonaci: k=");
        k = scanner.nextInt();
    } while (k < 2);
    
    System.out.println("Nhập vào số a=");
        a = scanner.nextInt();
    System.out.println("Nhập vào số b=");
        b = scanner.nextInt(); 
        
    String s=String.valueOf(a)+";"+String.valueOf(b)+";"+String.valueOf(k);
    System.out.println(" s="+s);
    
    // khởi tạo và cấp phát bộ nhớ cho mảng
    int array[] = new int[k];
         
    array[0]=a;array[1]=b;
    for (int i = 2; i < k; i++) {
        array[i] = array[i-1]+array[i-2];
        System.out.print(array[i] + "  ");
    }
     
    System.out.println("Nhập vào số p=");
    p = scanner.nextInt();
    
  
    // Tim phần tử có trong mảng
    for (int i = 0; i < k; i++) {
        if (array[i]==p)
        {
         System.out.println("Phần tử "+ p+ " ở vị trí thứ " + (i+1));
        }       
    }     
}
}
