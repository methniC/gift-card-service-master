package com.guusto.giftcardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GiftcardserviceApplication {

	public static void main(String[] args) {
		/*try {
			Thread.sleep(3600*10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		SpringApplication.run(GiftcardserviceApplication.class, args);
	}

}
