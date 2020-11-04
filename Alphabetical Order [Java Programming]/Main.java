import java.util.*;
class Main
{
    public static void main(String[] args) 
    {
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        count = scan.nextInt();
        String str[] = new String[count];
        scan.nextLine();
        for(int i = 0; i < count; i++)
        {
            str[i] = scan.next();
        }
        for (int i = 0; i < count; i++) 
        {
             //Try out your code here
          	for(int j = i+1; j < count; j++){
            	
              if(str[i].compareTo(str[j])>1){
              		temp = str[i];
                str[i] = str[j];
                str[j] = temp;
              
              }
            }
        }
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.print(str[i] + " ");
        }
    }
}

   