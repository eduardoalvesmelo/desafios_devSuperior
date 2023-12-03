package com.eduardo.alves.desafios;

import com.eduardo.alves.desafios.entities.Order;
import com.eduardo.alves.desafios.services.OrderService;
import com.eduardo.alves.desafios.services.ShippingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DesafiosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafiosApplication.class, args);


		OrderService orderService = new OrderService();

		ShippingService shippingService = new ShippingService();

		Order order = new Order();

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o codigo: ");
		String codigo = sc.next();
		order.setCode(Integer.valueOf(codigo));

		System.out.println("Informe o valor: ");
		String valor = sc.next();
		order.setBasic(Double.valueOf(valor));

		System.out.println("Informe o % desconto: ");
		String desconto = sc.next();
		order.setDiscount(Double.valueOf(desconto));

		double vlorTotal = orderService.total(order) + shippingService.shipment(order);

		System.out.println("Pedido código: " + order.getCode() + "\nValor total: " + vlorTotal);
	}

}
