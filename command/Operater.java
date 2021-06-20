package command;

public class Operater {

	public void MarkFruit(Order order) {
		String str="";
		for(String key:order.getFruitmap().keySet()) {
			str+=key+order.getFruitmap().get(key).toString();
		}
		System.out.println("ºÚ°µÁÏÀí£º"+str);
		
	}

}
