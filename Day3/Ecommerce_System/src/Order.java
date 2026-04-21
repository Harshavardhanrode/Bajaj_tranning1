public interface Order {

    void placeOrder();
    void cancelOrder(int orderId) throws InvalidOrderException;

}
