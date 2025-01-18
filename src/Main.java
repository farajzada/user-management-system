import model.Order;
import model.Product;
import model.User;
import repository.OrderRepository;
import repository.ProductRepository;
import repository.UserRepository;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        ProductRepository productRepository = new ProductRepository();
        OrderRepository orderRepository = new OrderRepository();


        User user = new User("John Doe");
        userRepository.save(user);

        System.out.println("All Users: " + userRepository.findAll());

        Product product = new Product("Laptop", 1200.00);
        productRepository.save(product);

        System.out.println("All Products: " + productRepository.findAll());

        Order order = new Order(1L,3424);
        orderRepository.findById(2L);
        orderRepository.save(order);
        System.out.println("All Orders: " + orderRepository.findAll());

    }
}