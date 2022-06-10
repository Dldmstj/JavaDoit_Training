package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import collection.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);	// 입력
	}
	
	public boolean removeMember(int memberId) {
		
		if(treeMap.containsKey(memberId)) {		// key값에 대한 object가 hashTable에 있는지 검증
			treeMap.remove(memberId);
			return true;
		}
		
		System.out.println("memberId가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		
		while (ir.hasNext()) {	// 다음 가리킬 요소가 있는 동안
			int key = ir.next();	// key는 다음 요소
			
			Member member = treeMap.get(key);	// member에 key가 가리키는 값을 저장
			System.out.println(member);
		}
	}
}
