package DPro;

public class CTest implements ITest{

	@Override
	public void sendMessage(String mes) {
		for(int i=5;i>=0;i--)
		{
			System.out.println(mes+"���ﻹ��"+i+"��ִ�ս��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("���������");
		}
		
		
	}

	
}
