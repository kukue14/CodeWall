package Chapter_2_ControlFlows.Control_Flows.Lesson_3_ForLoop;

public class Nested_For_Loop_code {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(" * ");
            System.out.println();
        }
    }
}
