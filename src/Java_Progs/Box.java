package Java_Progs;

public class Box {

    void square(int length, int width){
        if(length == width){
            System.out.println("Box is Square");
        }
        else
        {
            System.out.println("Box is not Sqaure");
        }

    }
    public static void main(String[] args) {
        Box B1 = new Box();  // Object 1
        Box B2 = new Box();  // Object 2
        B1.square(4,4);
        B2.square(3,4);
    }
}
