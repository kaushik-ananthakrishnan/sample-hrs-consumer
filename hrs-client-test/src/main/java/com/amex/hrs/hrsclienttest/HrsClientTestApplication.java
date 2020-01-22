package com.amex.hrs.hrsclienttest;

import com.amex.interview.hrs.client.HRClient;
import com.amex.interview.hrs.client.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrsClientTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrsClientTestApplication.class, args);
		HRClient hrClient = new HRClient();
		Employee employee = null;
		try {
			 employee = hrClient.getEmployeeById(1);
			 System.out.println(employee.toString());
			 employee = hrClient.getEmployeeById(4); // this throw the exception
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
