package collection.treeset;

import java.util.HashSet;
import collection.Member;

public class TreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet memberHS = new MemberTreeSet();
		
		Member member1 = new Member(101,"Â¯±¸");
		Member member2 = new Member(102,"¸Í±¸");
		Member member3 = new Member(100,"Ã¶¼ö");
		
		memberHS.addMember(member1);
		memberHS.addMember(member2);
		memberHS.addMember(member3);
		
		memberHS.showAll();
		
	}
}
