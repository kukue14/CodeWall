package Chapter_2_ControlFlows.Control_Flows.Lesson_3_ForLoop;

/* Syntax
    for( <initialization>; <condition>; <increment/ decrement>) { <implementation> }

    There are 3 Statements in (   ) of For.
            First Statement     : Initialization
            Second Statement    : Condition
            Third Statement     : Increment / Decrement

 */
public class For_Loop_code {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n========================");
        for(int j = 9; j >= 0; j--) {
            System.out.print(j + " ");
        }
    }
}