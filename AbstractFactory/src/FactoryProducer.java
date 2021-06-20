
public class FactoryProducer {
	//����һ������������/��������ͨ������ʳ�ĺ���⿷�����ȡ����
	public static AbstractFactory getFactory(String choice) {
		if(choice.equals("FOOD")) {
			return new FoodFactory();
		}
		else if(choice.equals("RECIPE")) {
			return new RecipeFactory();
		}
		return null;
	}
}
