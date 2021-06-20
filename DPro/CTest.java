package DPro;

public class CTest implements ITest{

	@Override
	public void sendMessage(String mes) {
		for(int i=5;i>=0;i--)
		{
			System.out.println(mes+"怪物还有"+i+"秒抵达战场");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("怪物出来了");
		}
		
		
	}

	
}
