/*
Authors: Vy Tran, Zuodong Zhou
Project 3 - Control Flow
Problem 1: Progress Bar
	The Progress Bar function in this program takes percentage completed of the circle,
	 x coordinate of a point and y coordinate of the same point as input and prints 
	 the output as “RED” if given point will be colored red and BLUE if the given point
	  will have blue color for the current progress percentage.

*/

public class ProgressBar{
	public static void circle_progressbar(int percentage, int x_coordinate, int y_coordinate) 
	{
		if()  //if x-y coordinates are out of the progress bar circle
		{
			
		}
		
		if(percentage == 0)
			System.out.print("BLUE");
		
		else if(percentage > 0) 
		{
			//Calculate the x-y coordinate to angle
			//then calculate that angle is what percentage of the circle
			//then if the given percentage >= angle percentage - RED
			//if the given percentage < angle percentage - BLUE
		}
		
	}
	
	public static void main(String[] args) {
		circle_progressbar(0, 10, 15);
	}
	
}