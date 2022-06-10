package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap memberTM= new MemberTreeMap();
		
		Member member1 = new Member(101,"¯��");
		Member member2 = new Member(102,"�ͱ�");
		Member member3 = new Member(100,"ö��");
		
		memberTM.addMember(member1);
		memberTM.addMember(member2);
		memberTM.addMember(member3);
		
		memberTM.showAll();

	}

}
