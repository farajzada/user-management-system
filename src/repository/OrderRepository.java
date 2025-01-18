package repository;

import model.Order;
import model.Product;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OrderRepository implements GenericRepository<Order> {

    private final List<Order> orders = new ArrayList<>();
    private Long currentId = 1L;

    @Override
    public Optional<Order> findById(Long id){{
            try {
                if (this.currentId != id)
                throw new NotFound("The provided ID is null.");
                else {
                    for (Order order : orders) {
                        if (Objects.equals(order.getId(), id)) {
                            return Optional.of(order);
                        }
                    }
                    return Optional.empty();
                }

            } catch (NotFound e) {
                System.out.println(e.getMessage());
            }
            return Optional.empty();
        }
        }

    @Override
    public List<Order> findAll() {
        return new ArrayList<>(orders);
    }

    @Override
    public void save(Order entity) {
        orders.add(entity);

    }

    @Override
    public void update(Long id, Order entity) {
        for (Order order : orders) {
            if (Objects.equals(order.getId(), id)) {
                order.setId(id);
                orders.add(entity);
                break;
            }
        }
    }

    @Override
    public void delete(Long id) {
        for (Order order : orders) {
            if (Objects.equals(order.getId(), id)) {
                orders.remove(order);
                break;
            }
        }
    }
}
