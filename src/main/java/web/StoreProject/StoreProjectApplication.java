package web.StoreProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import web.StoreProject.entity.Customer;

@SpringBootApplication
public class StoreProjectApplication  implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(StoreProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Customer customer=new Customer();
        customer.setFullName("Gunay Ceferli");
        customer.setEmail("cafarligunay@gmail.com");
        customer.setPassword("12345");
        customer.setPhone("0505505050");
        
    }
}
