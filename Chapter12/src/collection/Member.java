package collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member>{
	
	private int memberId;
	private String memberName;
	
	public Member(int memberID, String memberName) {
		this.memberId = memberID;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + " ȸ������ ID�� " + memberId + " �Դϴ�.";
	}

	@Override
	public int hashCode() {
		return memberId;		// ���� ����� ��� ���� memberId ��ȯ
	}

	@Override
	public boolean equals(Object obj) {		// equals() �������̵�, memberId�� ������ Ȯ���ϴ� �޼ҵ�
		if (obj instanceof Member) {
			Member member = (Member)obj;
			
			if (this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}

	@Override
	public int compareTo(Member member) {
		
		return (this.memberId - member.memberId); 
		// this�� �Ѿ�� �Ű����� ��, this�� �� Ŭ �� �����ȯ -> �������� ����
		
//		return (this.memberId - member.memberId) *(-1);
		// ���� ��ȯ -> �������� ����
	}

	@Override
	public int compare(Member mem1, Member mem2) {	//
		
		return mem1.memberId - mem2.memberId;
	}
	
	
}
