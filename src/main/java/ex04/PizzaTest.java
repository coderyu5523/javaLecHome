package ex04;

class Pizza{
    int size ;
    String type ;

    public Pizza(){
        size = 12 ;
        type = "슈퍼슢프림";
    }

    public Pizza(int size, String type) {
        this.size = size;
        this.type = type;
    }
}



public class PizzaTest {
    public static void main(String[] args) {
        Pizza obj1 = new Pizza();
        System.out.println(obj1.size+ ","+ obj1.type);

        Pizza obj2 = new Pizza(10,"치즈");
        System.out.println(obj2.size+","+obj2.type);
    }
}
