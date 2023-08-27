package Module1.Chapter2_ControlFlows.Control_Flows.Lesson_1_IfStatements;

/* Syntax
    a. if
        syntax : if( <condition> ) { <implementation> }
    b. if else
        syntax : if( <condition> ) { <implementation> } else { <implementation> }
    c. if else if
        syntax : if( <condition> ) { <implementation> } else if( <condition> ) { <implementation> } else { <implementation> }
 */
public class IfStatement_Intro {
    public static void main(String[] args) {
        int a = 3;

//        if
        if (a > 0) {
            System.out.println("a is greater than 0.");
        }

//        if else
        if (a < 0) {
            System.out.println("a is less than 0.");
        } else {
            System.out.println("a is greater than 0.");
        }

//        if else if
        if (a > 0) {
            System.out.println("a is greater than 0.");
        } else if (a < 0) {
            System.out.println("a is less than 0.");
        } else {
            System.out.println("a is 0.");
        }
    }
}
