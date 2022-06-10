package schedulerex;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("��ȭ ��� ��� ����� �����ϼ���. R, L, P");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if (ch == 'R' || ch == 'r' ) {
			scheduler = new RoundRobin();
		}
		else if (ch == 'L' || ch == 'l' ) {
			scheduler = new Leastjob();
		}
		else if (ch == 'P' || ch == 'p' ) {
			scheduler = new PriontyAllocation();

		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
