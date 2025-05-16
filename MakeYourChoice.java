
import java.util.Scanner;
 
import javax.lang.model.util.ElementScanner14;
public class MakeYourChoice
{
 public static void main(String[] args)
   {
     try {
     
       System.out.println("In order for this to work please enter either a lowercase a or b");
       Thread.sleep(5000);
       //SWitch back to 5000 when done
       System.out.println("POV: Your a snickity snake trying to find a mate for this season");
       Thread.sleep(3000);
       // switch back to 3000 when done
       //^^Introduction
      
        //Choice1^^
       System.out.println("You see your dream mate, will you slither over to her or wait for her : (a) Slither over  (b) Wait for her?");
 
 
       boolean slitherOver = false;
       boolean joinConversation = false;
       boolean askToBeMate = false;
 
       Scanner sc = new Scanner(System.in);
       slitherOver = sc.nextLine().equals("a"); 
 
       if (slitherOver) {
           System.out.println("You slither over");
           System.out.println("Do you join the conversation or assert your dominance? (a) join conversation b) assert dominance to let her know you are serious");
           joinConversation = sc.nextLine().equals("a");
 
 
           if (joinConversation)
           {
               System.out.println("You joined conversation");
               System.out.println("Do you ask her to be your mate or phone number? (a) Mate (b) Phone Number");
               askToBeMate = sc.nextLine().equals("a");
 
               if (askToBeMate)
               {
                   System.out.println("You asked her to be your mate");
               }
               else // phone Number only
               {  
                   System.out.println("you asked her for her phone number only");
               }
           }
           else // assert dominance
           {
               System.out.println("You asserted your dominance");
               // other side of decision tree
           }
 
       } else {
           System.out.println("She slithers to you");
           System.out.println("Do you ask her out immediately or compliment her? (a) Compliment her (b) Ask her out immediately ");
           boolean compliment = sc.nextLine().equals("a");
 
           if (compliment)
           {
               System.out.println("You compliment her and she compliments you back");
               System.out.println("Do you continue with small talk or ask her out? (a) small talk (b) ask her out");
               boolean smallTalk = sc.nextLine().equals("a");
 
               if (smallTalk)
               {
                   System.out.println("You do some small talk and she gets a little angry");
                   System.out.println("You ask if she is OK or say something nice? (a) Say something nice (b) Ask if she is OK");
 
                   boolean saySomethingNice = sc.nextLine().equals("a");
 
                   if (saySomethingNice)
                   {
                       System.out.println("You say someting nice - she says that times are hard...");
                       System.out.println("Do you let her know you are here for her or talk about your problems? (a) here for her (b) talk about problems?");
                       boolean hereForHer = sc.nextLine().equals("a");
 
                       System.out.println("Do you make your move or say goodbye? (a) Make move (b) say goodbye?");
                       boolean makeMove = sc.nextLine().equals("a");
 
                       if (hereForHer && makeMove)
                       {   System.out.println("You say you are here for her, she says thanks");
                           System.out.println("You have a mate");
                       }
                       else if (hereForHer && !makeMove)
                       {
                           System.out.println("You say you are here for her, she says thanks");
                           System.out.println("You say goodbye and she leaves");
                       }
                       else // Not hereForHer - you talk about your problems
                       {
                           System.out.println("You talk about your problems and she gets annoyed and leaves");
                           System.out.println("Doesn't matter if you make a move or not");
                       }
 
                   }
                   else // Ask if she is OK?
                   {
                       System.out.println("She leaves because you are boring");
                   }
               }
               else // You ask her out too early
               {
                   System.out.println("You ask her out still to early - and you get rejected"); 
               }
           }
           else // Ask her out too early
           {
               System.out.println("You ask her out to early - and you get rejected"); 
 
           }
       }
       sc.close();
 
       if (slitherOver && joinConversation && askToBeMate)
       {
           System.out.println("Congratulations you have a mate this season!!!!!!");
       }
       else
       {
           System.out.println("Sorry you don't have a mate this season");
       }
 
       System.out.println("End of adventure game");
 
     }
     catch(InterruptedException ex)
     {
       ex.printStackTrace();
     }
 
 
   }
}
 
