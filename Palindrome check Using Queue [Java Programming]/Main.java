import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        Queue queue = new LinkedList();
		//Try out your code here
      	for(int i=inputString.length()-1; i>=0; i--) queue.add(inputString.charAt(i));
      	String reverseString = "";
      
      	while(!(queue.isEmpty())){
          reverseString = reverseString + queue.remove();
        }  
      
        if (inputString.equals(reverseString))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");

    }
}
