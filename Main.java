import java.util.Scanner;

class Main 
{
	public static void main(String[] args) 
	{
  //varibles
  String yourName;
  String partnerName;
  

     
    	//ask user for your name and partner's name
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your first name:");
    	yourName = sc.nextLine();
    	System.out.println("Enter your partner's name:");
    	partnerName = sc.nextLine();

	//create Speaking Object
      Speaking talk = new Speaking(yourName,partnerName);//Note: you need to pass parameter the "constructor" because in order for thte constructor to work, you need every little parts to make up the work and in this case, you need both the first user's name and the second's name in order for the fowlling methods to function when it's initialized.
      
      System.out.println("Yelling your name: " + talk.yelling()); 

      System.out.println("Whispering your name: " + talk.whisper());

    	talk.pigLatin();

      talk.nameJoin();


	}
}

/* Sample Output

Enter your first name:
 Jonathan
Enter your partner's name:
 Julia

Yelling your name: JONATHAN
Whispering your partner's name: julia
Your name in Pig Latin: onathanjay
Your partner's name in Pig Latin: uliajjay
Your team name is Jonathan or Julia 

*/