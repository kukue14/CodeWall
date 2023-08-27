package Module1.Chapter2_ControlFlows.Control_Flows.Lesson_1_IfStatements;

/* Syntax
    if( <condition> ) { <implementation> } else { <implementation> }
 */
public class If_else_code {
    public static void main(String[] args) {
        int num = 007;
        if (num < 0) {
            System.out.println("Number is negative integer.");
        } else {
            System.out.println("Number is positive integer.");
        }
    }
}
