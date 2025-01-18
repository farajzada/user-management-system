package repository;

import model.Order;

import java.util.List;
import java.util.Optional;

public class OrderRepository implements GenericRepository<Order> {

    @Override
    public Optional<Order> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Order> findAll() {
        return List.of();
    }

    @Override
    public void save(Order entity) {

    }

    @Override
    public void update(Long id, Order entity) {

    }

    @Override
    public void delete(Long id) {

    }
}
