package repository;

import model.User;

import java.util.List;
import java.util.Optional;

public class UserRepository implements GenericRepository<User> {

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public void save(User entity) {

    }

    @Override
    public void update(Long id, User entity) {

    }

    @Override
    public void delete(Long id) {

    }
}
