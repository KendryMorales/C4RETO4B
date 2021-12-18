package C4.C4Reto04;

import C4.C4Reto04.CrudRepository.OrderCrudRepository;
import C4.C4Reto04.CrudRepository.UserCrudRepository;
import C4.C4Reto04.CrudRepository.SupplementCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class C4Reto04Application implements CommandLineRunner {

    @Autowired
    private SupplementCrudRepository supplementCrudRepository;
    @Autowired
    public UserCrudRepository userCrudRepository;
    @Autowired
    public OrderCrudRepository orderCrudRepository ;

    public static void main(String[] args) {
        SpringApplication.run(C4Reto04Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        supplementCrudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();
    }

}
