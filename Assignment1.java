import java.util.Scanner;
/**
 * Lab03 Assignment1.
 *
 * @author (Sani Musa Muhammad u15/fns/csc/005)
 * @version (a version number or a date)
 */
public class Assignment1
{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double volume;
        double SFA;
        System.out.print("Enter the length" );
        double length = input.nextDouble();
        System.out.print("Enter the width");
        double width = input.nextDouble();
        System.out.print("Enter the Height");
        double Height = input.nextDouble();
        
        volume = length * width * Height;
        SFA = 2*(length*width + length*Height + width*Height);
        
        System.out.println("the volume of the box is " + volume);
        System.out.println("the Surface area of the box is " + SFA);
        
    }
   
}
