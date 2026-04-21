public class StroreOrder  implements Order{


    private int orderId;
    private double amount;

    public StroreOrder() {
    }

    public StroreOrder(int orderId, double amount, String storeLocation, String status) {
        this.orderId = orderId;
        this.amount = amount;
        this.storeLocation = storeLocation;
        this.status = status;
    }

    private String storeLocation;
    private String status;



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



    @Override
    public void placeOrder() {

    }

    @Override
    public void cancelOrder(int orderId) throws InvalidOrderException {

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
