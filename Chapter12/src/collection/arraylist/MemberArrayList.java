package collection.arraylist;

import java.util.ArrayList;
import collection.Member;	// ���� ��Ű���� �ƴϹǷ� import

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
	arrayList = new ArrayList();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberID) {
		
		for( int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempID = member.getMemberId();
			if ( memberID == tempID) {
				arrayList.remove(i);
				return true;
			}
		}
		
		System.out.println(memberID + " �� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAll() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		
//		System.out.println(arrayList);
	}

	
}
