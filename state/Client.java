package state;

public class Client {

	public static void main(String[] args) {
		ThreadContext tc=new ThreadContext();
		tc.start();
		tc.getCpu();
		tc.suspend();
	}
}
