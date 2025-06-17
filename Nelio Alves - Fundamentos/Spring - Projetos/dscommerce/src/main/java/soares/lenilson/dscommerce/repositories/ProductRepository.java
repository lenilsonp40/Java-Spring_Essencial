package soares.lenilson.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import soares.lenilson.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
