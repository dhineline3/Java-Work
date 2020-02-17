/*
 * Daniel Hineline
 * LightSwitch Assignment 
 * 
 */
import java.util.Scanner;

public class CircuitTester
{
    public static void main(String[] args)
    {
        char answer = 'y';
        do
        {
            Circuit myCircuit = new Circuit(); //calls the Circuit class into main
            Scanner input = new Scanner(System.in); // allows the user of the Scanner
            System.out.println("Which switch would you like to use? Press 1 or 2!");
            int lightChoice = input.nextInt(); //sets the user provided next int value 
                                               //to lightChoice
        
            myCircuit.getLampState();
        
        if (lightChoice==1)
          {
            System.out.println("You have selected light switch 1!");
            myCircuit.getFirstSwitchState();
            myCircuit.toggleFirstSwitch();
            System.out.println("You hit the first switch!");
            myCircuit.getFirstSwitchState();
            myCircuit.getLampState();

          }
        else if (lightChoice==2)
          {
            System.out.println("You have selected light switch 2!");
            myCircuit.getSecondSwitchState();
            myCircuit.toggleSecondSwitch();
            System.out.println("You hit the second switch!");
            myCircuit.getSecondSwitchState();
            myCircuit.getLampState();
          }
        else
          {
            System.out.println("This is not a valid input! Please try again");
          }
        }
        while(answer == 'y');
    }
}