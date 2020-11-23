import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Stack;
import java.util.stream.Stream;

public class Lab_4
{
    public static boolean checkBalanced(String exp)
    {
        // Creating a stack to store the open parentheses
        Stack stack = new Stack();
        // Iterating through the string
        for (int i = 0; i < exp.length(); i++)
        {
            // Storing the '(' into the stack
            if (exp.charAt(i) == '('){
                stack.push(exp.charAt(i));
            }
            // Checking for each parentheses to has a pair
            if (exp.charAt(i) == ')'){

                // Checking fot the stack if it is empty
                if (stack.empty()) {
                    return false;
                }
                // If expression has an element ')', another element from stack that is '(' will be deleted
                Character top = (Character) stack.pop();

                if ((top == '(' && exp.charAt(i) != ')')){
                    return false;
                }
            }
        }
        // Checking fot the stack is it is empty, in case it is empty the expression is balanced, otherwise one of the
        // parentheses does not have a pair
        return stack.empty();
    }

    public static void main(String[] args){

        // Indicating the path to the file
        String filePath = "c:/Users/Alex/Desktop/ObjectOrientedProgramming/one_expression.txt";
        // Storing the expression in a string
        String str = readLineByLineJava8( filePath );

        // Checking if the expression is balanced according to the boolean value returned
        if (checkBalanced(str)) {
            System.out.println("The expression is balanced");
        } else {
            System.out.println("The expression is not balanced");
        }
    }

    // Function to read an expression from a txt file like a string using String Builder
    private static String readLineByLineJava8(String filePath)
    {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
}
