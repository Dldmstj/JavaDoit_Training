package collection.hashset;

import java.util.HashSet;
import collection.Member;

public class HashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHS = new MemberHashSet();
		
		Member member1 = new Member(100,"¯��");
		Member member2 = new Member(101,"�ͱ�");
		Member member3 = new Member(102,"ö��");
		
		memberHS.addMember(member1);
		memberHS.addMember(member2);
		memberHS.addMember(member3);
		
		memberHS.showAll();
		System.out.println("\n");
		
		Member member4 = new Member(102,"����");
		memberHS.addMember(member4);	// memberId �ߺ�, �߰����� ����
		
		memberHS.showAll();
		
	}
}
