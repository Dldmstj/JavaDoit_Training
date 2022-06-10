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
		return memberName + " 회원님의 ID는 " + memberId + " 입니다.";
	}

	@Override
	public int hashCode() {
		return memberId;		// 같은 사람인 경우 같은 memberId 반환
	}

	@Override
	public boolean equals(Object obj) {		// equals() 오버라이딩, memberId가 같은지 확인하는 메소드
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
		// this와 넘어온 매개변수 비교, this가 더 클 때 양수반환 -> 오름차순 정렬
		
//		return (this.memberId - member.memberId) *(-1);
		// 음수 반환 -> 오름차순 정렬
	}

	@Override
	public int compare(Member mem1, Member mem2) {	//
		
		return mem1.memberId - mem2.memberId;
	}
	
	
}
