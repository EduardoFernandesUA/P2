import p2utils.HashTable;
import p2utils.Queue;

public class SupermarketOrdering {
  private int numOrders = 0;
  private Queue<Order> ordersQueue;
  private HashTable<Integer> stock;

  public SupermarketOrdering(){
    ordersQueue = new Queue<Order>();
    stock = new HashTable<Integer>(10);
  }

  public int numOrders(){ return numOrders; }

  public void enterOrder(Order order){
    ordersQueue.in(order);
    if(stock.contains(order.prodName)){
      int n = stock.get(order.prodName);
      stock.set(order.prodName, n+order.quantity);
    }else{
      stock.set(order.prodName, order.quantity);
    }    
  }

  public Order serveOrder(){
    Order order = ordersQueue.peek();
    ordersQueue.out();
    int currStock = stock.get(order.prodName);
    stock.set(order.prodName, currStock-order.quantity);
    return order;
  }

  public int query(String product){
    return stock.get(product);
  }

  public void displayOrders(){
    for (int i = 0; i < ordersQueue.size(); i++) {
      Order order = ordersQueue.peek();
      ordersQueue.out();
      System.out.println(order);
      ordersQueue.in(order);
    }
    // String[] keys = stock.keys();
    // for(String key : keys){
    //   int n = stock.get(key)
    // }
    System.out.println(stock);
  }
}
