package Chapter_3_Array.Lesson_3_JaggetArray;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] nums = {
                {1,2,3},
                {4,5,6,7},
                {8,9},
                {10,11,12,13,14}
        };

        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums[i].length; j++) System.out.print(nums[i][j] + "\t");
            System.out.println();
        }
    }
}
