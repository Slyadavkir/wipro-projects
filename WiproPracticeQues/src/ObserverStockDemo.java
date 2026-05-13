
public class ObserverStockDemo {

    public static void main(String[] args) {

        Subscriber investor1 = new Investors1("kirtiman");
        Subscriber investor2 = new Investors1("Anita");

        Subscriber investors[] = { investor1, investor2 };

        StockMarket market = new StockMarket(investors);
        market.notifyInvestorService("Stock price increased!");
    }
}

                                                 // Observer Interface
interface Subscriber {
    void updates(String message);
}

  
class Investors1 implements Subscriber {

    String name;

    public Investors1(String name) {
        this.name = name;
    }

    public void updates(String message) {
        System.out.println(name + " - " + message);
    }
}


class StockMarket {

    Subscriber investors[];

    public StockMarket(Subscriber investors[]) {
        this.investors = investors;
    }

    public void notifyInvestorService(String msg) {
        for (Subscriber investor : investors) {
            investor.updates(msg);
        }
    }
}
