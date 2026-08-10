package desafioComposicaoEnum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import desafioComposicaoEnum.enumOrderStatus.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Client client = new Client();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date moment = new Date();
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		client.setName(sc.nextLine());
		System.out.print("Email: ");
		client.setEmail(sc.next());
		System.out.print("Birth date(DD/MM/YYYY) :");
		client.setBirthdate(sdf.parse(sc.next()));
		
		System.out.println("Enter order data:");
		System.out.print("Status:");
		String statusInput = sc.next();
		OrderStatus status = OrderStatus.valueOf(statusInput);
		
		Order order = new Order(moment,status,client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		double totalPrice = 0;
		for (int i=0; i<n ; i++) {
			System.out.println("Enter #" + (i+1) + " item data:");
			
			Product product = new Product();
			OrderItem orderItem = new OrderItem();
			
			System.out.print("Product name: ");
			product.setName(sc.next());
			System.out.print("Product price: ");
			product.setPrice(sc.nextDouble());
			System.out.print("Quantity: ");
			orderItem.setQuantity(sc.nextInt());
			
			orderItem.setPrice(product.getPrice());
			orderItem.setProduct(product);
			order.addItem(orderItem);
			
			totalPrice += orderItem.subTotal();
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY");
		System.out.println("Order moment: " + sdf2.format(order.getMoment()));
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + order.getClient());
		System.out.println("Order items: ");
		for(OrderItem item: order.getItens()) {
			System.out.println(item);
		}
		System.out.println("Total price: $" + totalPrice);
		
		sc.close();

	}

}
