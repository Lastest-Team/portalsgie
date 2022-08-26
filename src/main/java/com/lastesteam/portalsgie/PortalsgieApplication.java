package com.lastesteam.portalsgie;

//@SpringBootApplication
public class PortalsgieApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PortalsgieApplication.class, args);
		User user1 = new User(12,"Jhon Doe","jhond","jhond@correo.com","qwerty");
		Transaction Transaction = new Transaction(2222,"Nomina",2.33,user1);
		Transaction.showMovementMoney();


/*
		//SpringApplication.run(PortalsgieApplication.class, args);
		User user1 = new User(12,"Jhon Doe","jhond","jhond@correo.com","qwerty");
		Transaction Transaction = new Transaction(2222,"Nomina",2.33,user1);

		Enterprise Enterprise1 = new Enterprise(name: address: phone: document: );
		Enterprise.showEnterprise();  */
	}

}
