package com.nt.sbeans;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("empInfo")
@Data
@ConfigurationProperties(prefix="emp.info")
public class EmployeeInfo {
	private  Integer id;
	private  String name;
	private   String addrs;
	private   Float salary;
	@Value("${emp.data.email}")
	private   String email;
	private   String[] favColors;
	private   Set<Long> phones;
	private   Map<String,Object> idDetails;
	private   Company  company;
	private   Long  pinCode;
	private  String  area;
	

}
