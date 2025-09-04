public enum OrderStatus {
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED;

    public boolean isActive() {
        return this != DELIVERED && this != CANCELLED;
    }
}
