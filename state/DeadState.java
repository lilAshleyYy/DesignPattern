package state;

public class DeadState extends ThreadState {

	public DeadState() {
		state=StateSet.DEAD;
		System.out.println("�߳�����");
	}
//	public void resume(ThreadContext tc) {
//		System.out.println("���CPUʱ��");
//		if(state==StateSet.BLOCKED)
//			tc.setThreadState(new RunnableState());
//		else 
//			System.out.println("��ǰ״̬����״̬");
//	}
}
