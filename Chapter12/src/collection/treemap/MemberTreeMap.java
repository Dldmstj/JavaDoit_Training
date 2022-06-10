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
		treeMap.put(member.getMemberId(), member);	// �Է�
	}
	
	public boolean removeMember(int memberId) {
		
		if(treeMap.containsKey(memberId)) {		// key���� ���� object�� hashTable�� �ִ��� ����
			treeMap.remove(memberId);
			return true;
		}
		
		System.out.println("memberId�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAll() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		
		while (ir.hasNext()) {	// ���� ����ų ��Ұ� �ִ� ����
			int key = ir.next();	// key�� ���� ���
			
			Member member = treeMap.get(key);	// member�� key�� ����Ű�� ���� ����
			System.out.println(member);
		}
	}
}
