package command;

public class OrderCommand implements Command {

	private Operater receiver;
	private Order order;
	public OrderCommand(Operater receiver,Order order) {
		this.receiver=receiver;
		this.order=order;
	}

	@Override
	public void execute() {
		System.out.println(order.getId()+"�Ź˿͵ĵ���");
		receiver.MarkFruit(order);
		
	}

}
