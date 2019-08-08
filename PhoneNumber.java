public abstract class Phone {
    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String toString() {
        return "#(" + phoneNumber + ")";
    }
    public abstract boolean createConnection(Network network);
    public abstract void closeConnection();
    private String phoneNumber;
}
