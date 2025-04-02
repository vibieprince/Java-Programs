package J4MethodOverloading;

public class Rectangle {
    int length;
    int breadth;

    int perimeter(int a,int b){
        length = a;
        breadth = b;
        return 2*(length+breadth);
    }

    float perimeter(float a,float b){
        // length = a;
        // breadth = b; error can't convert float to int
        return 2*(a+b);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1.perimeter(5,7));
        System.out.println(r1.perimeter(7.4f,6.3f));
    }
}
