package com.rnd.app.git_demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
	public void addData(String data) {
    	System.out.println("data : " + data);
		if (data.equalsIgnoreCase("sdas")) {
			System.out.println("welcome" + data);
		}
    }
}
