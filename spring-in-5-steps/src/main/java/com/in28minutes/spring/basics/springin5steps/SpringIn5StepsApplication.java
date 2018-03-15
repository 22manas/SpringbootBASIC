package com.in28minutes.spring.basics.springin5steps;


import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		//what are the beans
		//what are the dependencies
		//where to search for the beans --> as we are in a same package so no need to do this
		
		//instancing the binary search
		//BinarySortImpl binarysearch = new BinarySortImpl(new QuickSortAlgorithem());
		 ConfigurableApplicationContext run = SpringApplication.run(SpringIn5StepsApplication.class, args);
		 BinarySortImpl binarysearch = run.getBean(BinarySortImpl.class);
		 int result = binarysearch.BinarySearch(new int[] {12,4,6}, 3);
		 System.out.println(result);
		
	}
}
