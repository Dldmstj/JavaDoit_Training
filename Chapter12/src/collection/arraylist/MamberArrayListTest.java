package collection.arraylist;

import collection.Member;

public class MamberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberAL = new MemberArrayList();
		
		Member member1 = new Member(100, "Â¯±¸");
		Member member2 = new Member(101, "¸Í±¸");
		Member member3 = new Member(102, "Ã¶¼ö");
		
		memberAL.addMember(member1);
		memberAL.addMember(member2);
		memberAL.addMember(member3);
		
		memberAL.showAll();
		
		System.out.println("\n");
		
		memberAL.removeMember(member1.getMemberId());
		memberAL.showAll();
	}

}
