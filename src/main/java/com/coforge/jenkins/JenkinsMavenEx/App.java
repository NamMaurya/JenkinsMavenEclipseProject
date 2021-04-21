package com.coforge.jenkins.JenkinsMavenEx;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Player sachin = new Player(10,"Sachin", "Maharashtra");
		System.out.println(sachin.getJerseyNo()+" : "+sachin.getPlayerName()+" : "+sachin.getState());    }
}
