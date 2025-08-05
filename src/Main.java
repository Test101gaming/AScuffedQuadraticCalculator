import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        //Variable User Input3
        Scanner a = new Scanner(System.in); //scanner obj
        System.out.println("Enter the value for a");
        Float varA = a.nextFloat();
        System.out.println("Enter the value for b");
        Float varB = a.nextFloat();
        System.out.println("Enter the value for c");
        Float varC = a.nextFloat();

        //The fun part: the actual math
        float BSquared = varB * varB;
        float discriminant = BSquared - 4 * varA *  varC;
float sqrtDiscriminant = (float) Math.sqrt(discriminant);
float denominator = 2 * varA;
float bFront = -varB;
float solOnef = bFront + sqrtDiscriminant;
float solTwof = bFront - sqrtDiscriminant;
float solOne = solOnef / denominator;
float solTwo = solTwof / denominator;
if (discriminant <0) {
    System.out.println("This is a complex solution");
} else
    System.out.println(solOne);
System.out.println(solTwo);
  }
}