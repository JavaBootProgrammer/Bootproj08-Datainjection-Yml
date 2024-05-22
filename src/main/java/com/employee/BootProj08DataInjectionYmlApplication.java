package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.employee.sbeans.EmployeeInfo;

@SpringBootApplication
public class BootProj08DataInjectionYmlApplication {

	public static void main(String[] args) {
		   //get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj08DataInjectionYmlApplication.class, args);
		  //get  Spring bean class obj ref
		EmployeeInfo  info=ctx.getBean("empInfo",EmployeeInfo.class);
		System.out.println(info);
		
		//close the IOC container
		((ConfigurableApplicationContext) ctx).close();
	}

}
