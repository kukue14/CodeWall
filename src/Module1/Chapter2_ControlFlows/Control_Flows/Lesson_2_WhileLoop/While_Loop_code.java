package Module1.Chapter2_ControlFlows.Control_Flows.Lesson_2_WhileLoop;

/* Syntax
    while( <condition> ) { <implementation> }
 */
public class While_Loop_code {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 9) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();

        a = 9;
        while (a > 0) {
            System.out.print(a + " ");
            a--;
        }
    }
}
