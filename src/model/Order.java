package model;

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
}
