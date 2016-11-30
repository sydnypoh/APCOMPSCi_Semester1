import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an expression");
		String expression = kb.nextLine();
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		doEquation(equation);
		
	}
	public static void doEquation(ArrayList<String> equation)
	{
		int i = 1;
		while (i < equation.size())
		{
			if(equation.get(i).equals("*"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1))));
			}
			else if(equation.get(i).equals("/"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1))));
			}
			else if(equation.get(i).equals("+"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
			}
			else if(equation.get(i).equals("-"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) - Integer.parseInt(equation.get(i+1))));
			}
			equation.remove(i-1);
			equation.remove(i);
			i++;
		}
		System.out.println(equation);
	}
}