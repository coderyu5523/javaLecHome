package ex04;


class Box{
    int width ;
    int length;
    int height ;
    double getVoume(){
        return (double) width*length*height;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        Box b = new Box();
        b.height =20;
        b.length=20;
        b.width= 30;
        System.out.println(b.getVoume());


    }
}
