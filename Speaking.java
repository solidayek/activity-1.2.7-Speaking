public class Speaking
{
//attributes
String yourName;
String partnerName;
String firstLetter;
String ayWord = "ay";
String yourPigLatinName;
String partnerPigLatinName;

public Speaking(String firstUsername, String secondUsername){
  yourName = firstUsername;
  partnerName = secondUsername;
}

//methods
public String yelling() {
  return yourName.toUpperCase();
}

public String whisper(){
  return partnerName.toLowerCase();
}

// public String pigLatin()
// {
//    firstLetter = yourName.substring(0,1);
//    return yourPigLatinName = yourName.substring(1)+ firstLetter + ayWord;

  

// }

public void pigLatin() //when you use void, you cannot use the "return" value
 {
    //yourPigLatinName
    firstLetter = yourName.substring(0,1);
     yourPigLatinName = yourName.substring(1)+ firstLetter + ayWord;
    System.out.println("Your name in Pig Latin: " + yourPigLatinName);

    //partnerPigLatinName
    firstLetter = partnerName.substring(0,1);
     partnerPigLatinName = partnerName.substring(1)+ firstLetter + ayWord;
    System.out.println("Your partner's name in Pig Latin: " + partnerPigLatinName);

}

public void nameJoin(){
  System.out.println("Your team name is " + yourName + " or " + partnerName);
}




}




/*
Sample Output

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