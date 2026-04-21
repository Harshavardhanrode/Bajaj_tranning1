public class OnlineOrder implements Order{

    private int orderId;
    private double amount;
    private String deliveryAddress;
    private String status;

    public OnlineOrder() {
    }

    public OnlineOrder(int orderId, double amount, String deliveryAddress, String status) {
        this.orderId = orderId;
        this.amount = amount;
        this.deliveryAddress = deliveryAddress;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void placeOrder() {

    }

    @Override
    public void cancelOrder(int orderId) throws InvalidOrderException {

    }

//    orderId (int)
//* productName (String)
//* amount (double)
//* deliveryAddress (String)
//* status (String)
//    Behavior
//* placeOrder() → sets status = "Placed"
//            * cancelOrder() → changes status = "Cancelled"
}
