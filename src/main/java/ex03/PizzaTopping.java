package ex03;

public class PizzaTopping {
    public static void main(String[] args) {
        String[] toppings = {"pepperoni","mushrooms","onions","sausege","bacon"};
        for(String s : toppings){
            System.out.println(s);
        }

        for(int i=0;i<toppings.length;i++){
            System.out.println(toppings[i]);
        }

    }
}
