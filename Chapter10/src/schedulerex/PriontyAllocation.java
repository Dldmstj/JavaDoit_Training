package schedulerex;

public class PriontyAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��ų�� ���� ���� ������ ��⿭�� �տ� �켱 ����մϴ�.");		
	}
	
	

}
