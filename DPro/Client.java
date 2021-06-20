package DPro;

public class Client {
	public static void main(String[] args) {
		IShowPic isp=new CRemoPic();
		CLocalPicShow cpic=new CLocalPicShow(isp);
		IShowPic localpic=(IShowPic)cpic.getProxyInstance();
		localpic.ShowPic("AAA");
		
		
		ITest it=new CTest();
		CLocalPicShow ct=new CLocalPicShow(it);
		ITest localtest=(ITest)ct.getProxyInstance();
		localtest.sendMessage("BBB");
	}
}
