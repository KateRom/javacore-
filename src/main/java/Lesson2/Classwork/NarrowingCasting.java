package Lesson2.Classwork;

public class NarrowingCasting {
    int int1 = 0;
    float float1 = 0.0f;

    public void narrowing(){
        int1 = (int)float1;
        System.out.println(int1);
    }
}
