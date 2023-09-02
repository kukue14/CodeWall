package Module2.Chapter10_Strings;

public class Lesson1_CreateString {
    public static void main(String[] args) {
        String str1 = "Ku Kue";
        String str1Lite = "Ku Kue"; // value တူရငိ ရှိပြီးသား value ကိုပဲ ပြန် initialize လုပ်ပေး
        System.out.println(str1);
        System.out.println(str1Lite);

        String str2 = new String("Ku Kue");
        System.out.println(str2);

        char[] chars = {'K', 'u', ' ', 'K', 'u', 'e'};
        String str3 = new String(chars);
        System.out.println(str3);
    }
}
