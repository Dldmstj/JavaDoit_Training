package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);	// 입력
	}
	
	public boolean removeMember(int memberId) {
		
		if(hashMap.containsKey(memberId)) {		// key값에 대한 object가 hashTable에 있는지 검증
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println("memberId가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while (ir.hasNext()) {	// 다음 가리킬 요소가 있는 동안
			int key = ir.next();	// key는 다음 요소
			
			Member member = hashMap.get(key);	// member에 key가 가리키는 값을 저장
			System.out.println(member);
		}
	}
}
