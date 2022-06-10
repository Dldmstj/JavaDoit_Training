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
		hashMap.put(member.getMemberId(), member);	// �Է�
	}
	
	public boolean removeMember(int memberId) {
		
		if(hashMap.containsKey(memberId)) {		// key���� ���� object�� hashTable�� �ִ��� ����
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println("memberId�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAll() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while (ir.hasNext()) {	// ���� ����ų ��Ұ� �ִ� ����
			int key = ir.next();	// key�� ���� ���
			
			Member member = hashMap.get(key);	// member�� key�� ����Ű�� ���� ����
			System.out.println(member);
		}
	}
}
