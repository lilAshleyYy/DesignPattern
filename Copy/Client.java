package Copy;

public class Client {

	public static void main(String[] args) {
		MyFruit fu1=new Apple();
		MyFruit fu2=new Banana();
////		MyFruit fu2=fu1;
//		MyFruit fu2=(Apple)fu1.clone();
//		fu1.display();
//		fu2.display();
//		System.out.println("fu1:"+fu1.hashCode());
//		System.out.println("fu2:"+fu2.hashCode());
		
//		MyFruitStore mfs=new MyFruitStore();
//		mfs.Add(1, fu1);
//		mfs.Add(2, fu2);
//		mfs.Add(3, new Apple());
//		mfs.Add(4, new Banana());
		MyFruitStore.Add(1, fu1);
		MyFruitStore.Add(2, fu2);
		MyFruitStore.Add(3, new Apple());
		MyFruitStore.Add(4, new Banana());
		MyFruit fruit=(MyFruit)MyFruitStore.Get(1);
		
		fruit.display();
		
		
	}
}
