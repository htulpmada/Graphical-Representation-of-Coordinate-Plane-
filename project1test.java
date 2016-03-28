//cs350 project#1 Adam Pluth
//this program tests the project1 class using the file 'Input.txt'
import java.io.*;
import java.util.Scanner;

import javax.swing.JFrame;
public class project1test 
{

	public static void main(String[] args) 
	{
		int choice1 = 3;
		int choice2 = 10;
		
		Scanner input;
		try {
			input=new Scanner(new File("Input.txt"));
			choice1=input.nextInt();
			choice2=input.nextInt();
			input.close();
		  }
		  catch (IOException e) {
			   System.err.println(e);
			   System.exit(1);
		  }
		project1 panel = new project1(choice1, choice2);
		
		JFrame application = new JFrame("project1");
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(520,500);
		application.setVisible(true);
	}

}
