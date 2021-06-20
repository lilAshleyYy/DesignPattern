package 建造者模式;

public class SMBuiderB extends MBuilder{
	public void buildFood() {
		Meal.setFood("一个鸡肉卷");
	}
	public void buildDrink() {
		Meal.setDrink("一杯果汁");
	}
}
