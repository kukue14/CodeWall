package Module1.Chapter2_ControlFlows.Control_Flows.Lesson_2_WhileLoop;

/* Syntax
   do{ <implementation> } while( <condition> );
 */

public class Do_While_Loop_code {
    public static void main(String[] args) {
        int c = 1;
        do {
            System.out.print(c + " ");
            c++;
        } while (c < 10);
    }
}
