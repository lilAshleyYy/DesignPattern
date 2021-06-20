package SimpleFactory;

public class Client {
	public static void main(String[] args) {
//		Factory fac=new BFactory();
//		Fruit fru=fac.CreateFruit();
		//Fruit fru=fac.CreateFruit("B");
		Factory fac=(Factory)XMLUtil.getBean();
		Fruit fru=fac.CreateFruit();
		fru.eat();
	}
}
