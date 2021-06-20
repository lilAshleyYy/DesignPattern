
public abstract class AbstractFactory {  
	//为Food和Recipe对象创建抽象类来获取工厂
	public abstract Food getFood(String food);
	public abstract Recipe getCookMethod(String recipe);
}
