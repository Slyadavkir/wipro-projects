

public class DecoratorDemo2 
{
	public static void main(String[] args) {
	
		
		   FastPizza pizza = new PlainPizza();

	       pizza = new Cheese(pizza); //decorator
	   

	       System.out.println(pizza.getDescription());
	       System.out.println(pizza.cost());
	}
	   
	
}
interface FastPizza {

    String getDescription();
    int cost();
}

class PlainPizza implements FastPizza {
    public String getDescription() {
        return "Plain Pizza";
    }
    public int cost() {
        return 100;
    }
}

abstract class PizzaDecorator implements FastPizza {
    protected FastPizza pizza;

    PizzaDecorator(FastPizza pizza) {
        this.pizza = pizza;
    }
}

// Cheese topping
class Cheese extends PizzaDecorator {
    Cheese(FastPizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public int cost() {
        return pizza.cost() + 30;
    }
}

// Paneer topping
class Paneer extends PizzaDecorator {
    Paneer(FastPizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Paneer";
    }

    public int cost() {
        return pizza.cost() + 50;
    }
}