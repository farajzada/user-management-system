package repository;

import java.util.List;
import java.util.Optional;

public interface GenericRepository<T> {
    public Optional<T> findById(Long id);

    public List<T> findAll();

    public void save(T entity);

    public void update(Long id, T entity);

    public void delete(Long id);


}
