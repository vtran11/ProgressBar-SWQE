/*
Authors: Vy Tran, Zuodong Zhou
Project 3 - Control Flow
Problem 1: Progress Bar
    The Progress Bar function in this program takes percentage completed of the circle,
     x coordinate of a point and y coordinate of the same point as input and prints 
     the output as “RED” if given point will be colored red and BLUE if the given point
      will have blue color for the current progress percentage.

*/

public class example{
    public static void circle_progressbar(double percentage, double x_coordinate, double y_coordinate) 
    {
        //if x-y coordinates are out of the progress bar circle or percentage is invalid
        if(x_coordinate>100 || y_coordinate>100 || percentage >100 || percentage < 0)  
        {
            System.out.println("Invalid Input");
        }
        
        else {
            if(percentage == 0)
                System.out.println("BLUE");
                        
            else 
            {
                double angle_percentage = Math.toDegrees(Math.atan2(x_coordinate - 50, y_coordinate - 50));
                if (angle_percentage < 0)
                    angle_percentage+= 360;
                
                double bar_percentage = percentage*3.6;
                
                double dist_from_center= Math.pow((x_coordinate - 50),2) + Math.pow((x_coordinate - 50),2);
                    //A point can be red only if it is inside of the circle
                if(angle_percentage <= bar_percentage && dist_from_center < 2500)
                {
                    System.out.println("RED");
                } 
            
                else
                {
                    System.out.println("BLUE");
                }
            
            //Calculate the x-y coordinate to angle
            //then calculate that angle is what percentage of the circle
            //then if the given percentage >= angle percentage - RED
            //if the given percentage < angle percentage - BLUE
            }   
        }
    } 
    
    
    public static void main(String[] args) {
    	System.out.print("Expected output for (0, 10, 15) is BLUE. Output: ");
    	circle_progressbar(0, 10, 15);//When percentage is 0, any point in the screen is BLUE
    	
    	System.out.print("Expected output for (10, 10, 15) is BLUE. Output: ");
        circle_progressbar(10, 10, 15);//The 10% does not cover many points
        
    	System.out.print("Expected output for (90, 60, 50) is RED. Output: ");
        circle_progressbar(90, 60, 50); //The 90% covers the most points inside of the circle
        
    	System.out.print("Expected output for (100, 30, 15) is RED. Output: ");
        circle_progressbar(100, 30, 15); //When percentage is 100, any point inside of the circle is RED
        
    	System.out.print("Expected output for (100, 0, 1) is BLUE. Output: ");
        circle_progressbar(100, 0, 1); //Any point outside of the circle is always BLUE even percentage is 100
        
    	System.out.print("Expected output for (100, 50, 100) is RED. Output: ");
        circle_progressbar(100, 50, 100); //The verge of circle has successfully been covered
        
    	System.out.print("Expected output for (100, 105, 15) is Invalid Input. Output: ");
        circle_progressbar(100, 105, 15); //The input does not meet the requirement
        
        circle_progressbar(100, 105, 15); 

    }

}