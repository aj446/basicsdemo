package com.amerigroup.screening.dice;



public class WorkingDiceRoller
implements IDiceRoller
{

public WorkingDiceRoller()
{
}

public  int roll(int i, int j)
{
    if(i < 0)
    {
        throw new IllegalArgumentException("The number of dice must be a positive integer");
    }
    if(j < 4 || j > 100)
    {
        throw new IllegalArgumentException("The number of sides per die supplied is invalid");
    } else
    {
     
    	//return 1+(int)Math.floor(Math.random() * (double)j * (double)i);
    	
	return i +  (int)(Math.random() * ((i*j - i) + 1));
    	
    	            

    }
}
}
