package Module3.Chapter14_LambdaFunction;

interface Changeable {
    void change(String name);
}

public class Lesson2_Changable {
    public static void main(String[] args) {


        //simple way
        Changeable changeable = new Changeable() {
            @Override
            public void change(String name) {
                System.out.println(name);
            }
        };


        //erase
        Changeable changeable1 = (String name) ->{ System.out.println(name);};



        //shortcut
        Changeable changeable2 =  name -> {};


        //customise shortcut
        Changeable changeable3 = n ->{};


        //replace by ide
        Changeable changeable4 = name -> {};




    }
}
