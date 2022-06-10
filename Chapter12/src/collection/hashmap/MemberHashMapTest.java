package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHM= new MemberHashMap();
		
		Member member1 = new Member(101,"¯��");
		Member member2 = new Member(102,"�ͱ�");
		Member member3 = new Member(100,"ö��");
		
		memberHM.addMember(member1);
		memberHM.addMember(member2);
		memberHM.addMember(member3);
		
		memberHM.showAll();
		System.out.println("\n");
		
		memberHM.removeMember(100);
		memberHM.showAll();
	}

}
