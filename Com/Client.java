package Com;

public class Client {
	public static void main(String[] args) {
		MyElement obj1,obj2,obj3,obj4;
		Plate plate1,plate2;
		
		obj1=new Apple();
		obj2=new Pear();
		plate1=new Plate();
		plate1.add(obj1);
		plate1.add(obj2);
		
		obj3=new Apple();
		obj4=new Pear();
		plate2=new Plate();
		plate2.add(obj3);
		plate2.add(obj4);
		plate2.add(plate1);
		
		plate2.eat();
	}
}
