package desafioComposicaoEnum;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import desafioComposicaoEnum.enumOrderStatus.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> itens = new ArrayList<>();
	
	public Order() {
	}
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public List<OrderItem> getItens() {
		return itens;
	}
	public void addItem(OrderItem item) {
		itens.add(item);	
	}
	public void removeItem(OrderItem item) {
		itens.remove(item);	
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public void setItens(List<OrderItem> itens) {
		this.itens = itens;
	}
	public Date getMoment() {
		return moment;
	}
	public double total(){
		double total = 0;
		for(OrderItem item : itens) {
			total += item.subTotal();
		}
		return total;
	}
}
