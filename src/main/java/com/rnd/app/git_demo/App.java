package com.rnd.app.git_demo;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
	public void addData(String data) {
		if (data.equalsIgnoreCase(Constant.DATA_TYPE)) {
			System.out.println("welcome" + data);
		}
    }
}
