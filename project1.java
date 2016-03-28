//cs350 project #1 Adam Pluth
// this program takes in two variables and displays a line segment based on the two input values
//
import java.awt.*;
import javax.swing.JPanel;

public class project1 extends JPanel
{
	int choice1 = 1;
	int choice2 = 20;
	int i;
	double e = 2.71828;
	int xmin = 20;
	int xmax = 520;
	int y = 250;
	int [] origin = {xmin,y};
	// constructor
	public project1(int input1, int input2)
	{
		choice1 = input1;
		choice2 = input2;
		
	}// end constructor
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		//draw axis
		g.setColor(Color.black);
		g.drawLine(xmin,y,xmax,y);//x axis
		g.drawLine(xmin, y+200,xmin, y-200);//y axis
		//draws hash marks on x axis
		int [] x1 = {50,90,135,180,225,270,315,360,405,450};
		for (int num : x1){
			g.drawLine(num,y-5,num,y+5);
		}
		//draws hash marks on y axis
		int [] y1 = {50,150,350,450};
		for(int nu : y1){
			g.drawLine(xmin-5, nu, xmin+5, nu);
		}
		//draws value markers
		String []	values = {"0",".1",".2",".3",".4",".5",".6",".7",".8",".9","1","x","y","1",".5","-.5","-1"};
		int [] x3 = {30,45,90,135,180,225,270,315,360,405,450,466,30,xmin-20,xmin-20,xmin-20,xmin-20};
		int [] y3 = {y+20,y+20,y+20,y+20,y+20,y+20,y+20,y+20,y+20,y+20,y+20,y+10,xmin+15,50,150,350,450};
		int i=0;
		for (String chr : values){
			g.drawString(chr, x3[i], y3[i]);
			i++;
		}
		
		double [] x = new double[choice2+1];
		double [] fx = new double[choice2+1];
		g.setColor(Color.red);
		switch (choice1)
		{
		case 1:{//get points y=x
			for(int i1=0;i1 < fx.length;i1++){
				x[i1] = .1*i1;
				fx[i1] = i1;
				System.out.println(i1);
				System.out.println(fx[i1]);
			}
		}	break;
		case 2:{//get points y=e ^-0.25x
			for(int i1=0;i1 < fx.length;i1++){
				x[i1] = .1*i1;
				fx[i1] = (int)Math.pow(e,-.25 *x[i1]);
				System.out.println(i1);
				System.out.println(fx[i1]);
			}
		}	break;
		case 3:{//get points y=e ^-0.5x
			for(int i1=0;i1 < fx.length;i1++){
				x[i1] = .1*i1;
				fx[i1] = (int)Math.pow(e,-.5 *x[i1]);
				System.out.println(i1);
				System.out.println(fx[i1]);
			}
		}	break;		
		case 4:{//get points y=e ^-0.725x
			for(int i1=0;i1 < fx.length;i1++){
				x[i1] = .1*i1;
				fx[i1] = (int)Math.pow(e,-.75 *x[i1]);
				System.out.println(i1);
				System.out.println(fx[i1]);
			}
		}	break;
		case 5:{//get points y=e ^-x
			for(int i1=0;i1 < fx.length;i1++){
				x[i1] = .1*i1;
				fx[i1] = (int)Math.pow(e,-1*x[i1]);
				System.out.println(i1);
				System.out.println(fx[i1]);
			}
		}	break;	
		}
		//draw lines based on values of x and f(x)
		double xdis = 10*(500/choice2);
		double ydis = (250/choice2);
		for (int p = 0;p<x.length;p++){
			x[p] = (x[p]*xdis);
			fx[p] = (fx[p]*ydis);
		}
		for(int point= 1;point<x.length;point++){
			g.drawLine((int)(origin[0]+x[point-1]),(int)(origin[1]-fx[point-1]),(int)(origin[0]+x[point]),(int)(origin[1]-fx[point]));
			g.setColor(Color.black);
			System.out.println(point);
			System.out.println(fx[point]);
			
			//shows line segments
			g.drawLine((int)(origin[0]+x[point]), (int)(origin[1]-fx[point]-2), (int)(origin[0]+x[point]), (int)(origin[1]-fx[point]+2));
			g.setColor(Color.red);
		}
		
	
	
	}
}

