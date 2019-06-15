/**
 * 
 */
package com.thaontrung.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Anonymous
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudAppBoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringCloudAppBoot.class, args);
	}

}
