public class StoreOrder implements Order{


    private int orderId;
    private String productName;
    private double amount;
    private String storeLocation;
    private String status;

    public StoreOrder() {
    }

    public StoreOrder(int orderId, String productName, double amount, String storeLocation, String status) {
        this.orderId = orderId;
        this.productName = productName;
        this.amount = amount;
        this.storeLocation = storeLocation;
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

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

//    Attributes
//* orderId
//* productName
//* amount
//* storeLocation
//* status
//            Behavior
//* placeOrder()
//* cancelOrder()
}
