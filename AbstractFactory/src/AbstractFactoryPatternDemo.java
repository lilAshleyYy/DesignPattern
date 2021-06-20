
public class AbstractFactoryPatternDemo {
	//ʹ��FactoryProducer����ȡabstractFactory��ͨ������������Ϣ����ȡʵ����Ķ���
	public static void main(String args[]) {
		//��ȡʳ�Ĺ���
		AbstractFactory foodFactory=FactoryProducer.getFactory("FOOD");
		//��ȡʳ��Ϊpotato�Ķ���
		Food food1=foodFactory.getFood("POTATO");
		food1.SelectFood();
		//��ȡʳ��Ϊcabbage�Ķ���
		Food food2=foodFactory.getFood("CABBAGE");
		food2.SelectFood();
		//��ȡʳ��Ϊpork�Ķ���
		Food food3=foodFactory.getFood("PORK");
		food3.SelectFood();
		//��ȡ��⿷�������
		AbstractFactory recipeFactory=FactoryProducer.getFactory("RECIPE");
		//��ȡfry�Ķ���
		Recipe cookMethod1=recipeFactory.getCookMethod("FRY");
		//����Fry��cookMethod����
		cookMethod1.cookMethod();
		//��ȡsteamed�Ķ���
		Recipe cookMethod2=recipeFactory.getCookMethod("STEAMED");
		cookMethod2.cookMethod();
		//��ȡbraise�Ķ���
		Recipe cookMethod3=recipeFactory.getCookMethod("BRAISE");
		cookMethod3.cookMethod();
		
	}
}
