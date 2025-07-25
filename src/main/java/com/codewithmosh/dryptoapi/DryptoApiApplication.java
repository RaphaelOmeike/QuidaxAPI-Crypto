package com.codewithmosh.dryptoapi;

import com.codewithmosh.dryptoapi.services.WalletService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DryptoApiApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(DryptoApiApplication.class, args);

        var walletService = context.getBean(WalletService.class);
//        walletService.loadWallets();
//        walletService.createWallets(); //they have performed

//        var user = context.getBean(User.class);

        System.out.println("working now");
    }

}
