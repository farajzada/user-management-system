package repository;

import model.Product;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ProductRepository implements GenericRepository<Product> {

    private final List<Product> products = new ArrayList<>();
    private Long currentId = 1L;

    @Override
    public Optional<Product> findById(Long id) {
        for (Product product : products) {
            if (Objects.equals(product.getId(), id)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    @Override
    public void save(Product entity) {
        products.add(entity);
    }

    @Override
    public void update(Long id, Product entity) {
        for (Product product : products) {
            if (Objects.equals(product.getId(), id)) {
                product.setId(id);
                products.add(entity);
                break;

            }
        }
    }

    @Override
    public void delete(Long id) {
        for (Product product : products) {
            if (Objects.equals(product.getId(), id)) {
                products.remove(product);
                break;
            }
        }
    }
}
