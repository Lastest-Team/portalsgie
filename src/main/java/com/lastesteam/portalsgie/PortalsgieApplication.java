package com.lastesteam.portalsgie;

import com.lastesteam.portalsgie.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortalsgieApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalsgieApplication.class, args);
		/*instanciando una clase, user*/
		/* alias = user1*/
		User user1 = new User(12,"Jhon Doe","jhond","jhond@correo.com","qwerty");
		user1.printUser();
		user1.setName("Juan G");
		user1.printUser();
		User user2 = new User(12,"Jhon K","jhond","jhond@correo.com","qwerty");
		user2.printUser();

		//Enterprise AgregarEmpresa = new Enterprise();
		//AgregarEmpresa.addUser(user1);

		//enterprises AgregarEmpresa = new enterprises ("Dell")


		//Transaction Transaction = new Transaction(2222,"Nomina",2.33,user1);
		//Transaction.showMovementMoney();
		//Enterprise Enterprise = new Enterprise(/*name: address: phone: document:*/ );
		//Enterprise.showEnterprise();
		//Employee Employee = new Employee(/*name: address: phone: document:*/ );
		//Employee.showEmployee();

/*
		//SpringApplication.run(PortalsgieApplication.class, args);
		User user1 = new User(12,"Jhon Doe","jhond","jhond@correo.com","qwerty");
		Transaction Transaction = new Transaction(2222,"Nomina",2.33,user1);
		Enterprise Enterprise1 = new Enterprise(name: address: phone: document: );
		Enterprise.showEnterprise();  */
	}

}
