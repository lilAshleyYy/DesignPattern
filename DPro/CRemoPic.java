package DPro;

public class CRemoPic implements IShowPic {
//Ô¶³ÌÍ¼Æ¬µ÷ÓÃ
	@Override
	public void ShowPic(String picname) {
		for(int i=0;i<3;i++) {
			System.out.println(i+1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
