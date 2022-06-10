package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import collection.Member;

public class MemberHashSet {

private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		
		Iterator<Member> iterator = hashSet.iterator();
		while (iterator.hasNext()) {		// 다음 가리키는 요소가 있는 동안
			Member member = iterator.next();	// member는 next 요소
			
			int tempId = member.getMemberId();
			if(memberID == tempId) {
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID + " 가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for (Member member : hashSet) {
			System.out.println(member);
		}
	
	}
}
