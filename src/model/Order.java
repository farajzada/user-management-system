package model;

import java.util.Objects;

public class Order  extends BaseEntity{
    private long userId;
    private long pruductId;

    public Order(long userId, long pruductId) {
        this.userId = userId;
        this.pruductId = pruductId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getPruductId() {
        return pruductId;
    }

    public void setPruductId(long pruductId) {
        this.pruductId = pruductId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId=" + userId +
                ", pruductId=" + pruductId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return userId == order.userId && pruductId == order.pruductId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, pruductId);
    }
}
