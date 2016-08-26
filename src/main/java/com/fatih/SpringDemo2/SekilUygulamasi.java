package com.fatih.SpringDemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SekilUygulamasi {
    public static void main( String[] args ){
        
    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	context.registerShutdownHook();
    	Sekil sekil=context.getBean("daire",Daire.class);
    	
    	sekil.sekilCiz();
    	
    }
}
