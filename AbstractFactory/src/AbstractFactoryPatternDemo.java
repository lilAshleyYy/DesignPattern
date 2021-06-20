
public class AbstractFactoryPatternDemo {
	//使用FactoryProducer来获取abstractFactory，通过传递类型信息来获取实体类的对象
	public static void main(String args[]) {
		//获取食材工厂
		AbstractFactory foodFactory=FactoryProducer.getFactory("FOOD");
		//获取食材为potato的对象
		Food food1=foodFactory.getFood("POTATO");
		food1.SelectFood();
		//获取食材为cabbage的对象
		Food food2=foodFactory.getFood("CABBAGE");
		food2.SelectFood();
		//获取食材为pork的对象
		Food food3=foodFactory.getFood("PORK");
		food3.SelectFood();
		//获取烹饪方法工厂
		AbstractFactory recipeFactory=FactoryProducer.getFactory("RECIPE");
		//获取fry的对象
		Recipe cookMethod1=recipeFactory.getCookMethod("FRY");
		//调用Fry的cookMethod方法
		cookMethod1.cookMethod();
		//获取steamed的对象
		Recipe cookMethod2=recipeFactory.getCookMethod("STEAMED");
		cookMethod2.cookMethod();
		//获取braise的对象
		Recipe cookMethod3=recipeFactory.getCookMethod("BRAISE");
		cookMethod3.cookMethod();
		
	}
}
