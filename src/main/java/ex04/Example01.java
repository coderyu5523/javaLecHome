package ex04;
class Circle{
    public int radius;
    public String color ;

    public double getArea(){
        return 3.14*radius*radius;
    }
}


public class Example01 {
    public static void main(String[] args) {

        Circle obj = new Circle();
        obj.radius = 100;
        obj.color = "blue";
        double area = obj.getArea();
        System.out.println(area);
    }
}
