package Module1.Chapter2_ControlFlows.Control_Flows.Lesson_1_IfStatements;

/* Syntax
    if( <condition> ) { <implementation> } else if( <condition> ) { <implementation> } else { <implementation> }
 */
public class If_else_if_code {
    public static void main(String[] args) {
        String day = "Sunday";
        if (day == "Monday") {
            System.out.println("Go to School.");
        } else if (day == "Tuesday") {
            System.out.println("Go to School.");
        } else if (day == "Wednesday") {
            System.out.println("Go to School.");
        } else if (day == "Thursday") {
            System.out.println("Go to School.");
        } else if (day == "Friday") {
            System.out.println("Go to School.");
        } else if (day == "Saturday") {
            System.out.println("Sleep.");
        } else {
            System.out.println("Go out.");
        }


        if (day == "Saturday") {
            System.out.println("Sleep.");
        } else if (day == "Sunday") {
            System.out.println("Go out.");
        } else {
            System.out.println("Go to School.");
        }
    }
}
