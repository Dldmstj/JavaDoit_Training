package schedulerex;

public class Leastjob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� �������� ���ų�, ����Ⱑ ���� �������� ����մϴ�.");		
	}
	
	

}