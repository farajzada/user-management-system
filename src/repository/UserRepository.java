package repository;

import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserRepository implements GenericRepository<User> {

    private final List<User> users = new ArrayList<>();
    private Long currentId = 1L;

    @Override
    public Optional<User> findById(Long id) {
        for (User user : users) {
            if (Objects.equals(user.getId(), id)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void save(User entity) {
        users.add(entity);
    }

    @Override
    public void update(Long id, User entity) {
        for (User user : users) {
            if (Objects.equals(user.getId(), id)) {
                user.setId(id);
                users.add(entity);

            }
        }
    }

    @Override
    public void delete(Long id) {
        for (User user : users) {
            if (Objects.equals(user.getId(), id)) {
                users.remove(user);
                break;

            }
        }
    }
}
