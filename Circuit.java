public class Circuit
{ 
    int lampState = 0;
    int firstSwitchState = 0;
    int secondSwitchState = 0;
 
    public int getFirstSwitchState() // 0 for down, 1 for up
    {
        if (firstSwitchState == 0)
        {
            System.out.println("The first switch is currently down!");
        }
        else if (firstSwitchState == 1)
        {
            System.out.println("The first switch is currently up!");
        }
        return 1;
    }
        
    public int getSecondSwitchState()
    {
        if (secondSwitchState == 0)
        {
            System.out.println("The second switch is currently down!");
        }
        else if (secondSwitchState == 1)
        {
            System.out.println("The second switch is currently up!");
        }
        return 1;
    }
        
    public int getLampState() // 0 for off, 1 for on
    {
         if (lampState == 0)
         {
             System.out.println("The lamp is currently off!");
         }
         else if (lampState == 1)
         {
             System.out.println("The lamp is currently on!");
         }
        return 1;
        
    }
      
    public void toggleFirstSwitch()
    {
        if (firstSwitchState == 0)
        {
            firstSwitchState = 1;
            if (lampState == 0)
            {
                lampState = 1;
            }
        }
        else if (firstSwitchState == 1)
        {
            firstSwitchState = 0;
            if (lampState == 1)
            {
                lampState = 0;
            }
        }
        return;
    }
        
    public void toggleSecondSwitch()
    {
        if (secondSwitchState == 0)
        {
            secondSwitchState = 1;
             if (lampState == 0)
            {
                lampState = 1;
            }
        }
        else if (secondSwitchState == 1)
        {
            secondSwitchState = 0;
            if (lampState == 1)
            {
                lampState = 0;
            }
        }
         return;
    }
   
}