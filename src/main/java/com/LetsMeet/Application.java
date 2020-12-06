package com.LetsMeet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static final Logger log =
            LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //@Bean
    //public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
      //  return args -> {

            /*System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }*/

            // save a few customers
            /*repository.save(new User("Jack", "Bauer", "jbauer", "jbauerpsd", true, "USER"));
            repository.save(new User("Chloe", "O'Brian", "cobrian","cobrianpsd",true, "USER"));
            repository.save(new User("Kim", "Bauer", "kbauer", "kbauerpsd",true, "USER"));
            repository.save(new User("David", "Palmer", "dpalmer","dpalmerpsd",true, "USER"));
            repository.save(new User("Michelle", "Dessler","mdessler","mdesslerpsd",true, "USER"));

            // fetch all customers
            log.info("Users found with findAll():");
            log.info("-------------------------------");
            for (User user : repository.findAll()) {
                log.info(user.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            User user = repository.findById(1L);
            log.info("User found with findById(1L):");
            log.info("--------------------------------");
            log.info(user.toString());
            log.info("");

            // fetch customers by last name
            log.info("Users found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            // for (Customer bauer : repository.findByLastName("Bauer")) {
            //  log.info(bauer.toString());
            // }
            log.info("");
    */
       // };
   // }

}