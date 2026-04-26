public class OnlineOrder implements Order{

    private int orderId;
    private String productName;
    private double amount;
    private String deliveryAddress;
    private String status;

    public OnlineOrder() {
    }

    public OnlineOrder(int orderId, String productName, double amount, String deliveryAddress, String status) {
        this.orderId = orderId;
        this.productName = productName;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
        this.status = "Placed";
    }

    @Override
    public void cancelOrder(int orderId) throws InvalidOrderException {
        if (this.orderId == orderId) {
            this.status = "Cancelled";
        } else {
            throw new InvalidOrderException();
        }
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
