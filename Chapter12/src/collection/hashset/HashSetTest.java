package collection.hashset;

import java.util.HashSet;
import collection.Member;

public class HashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHS = new MemberHashSet();
		
		Member member1 = new Member(100,"Â¯±¸");
		Member member2 = new Member(101,"¸Í±¸");
		Member member3 = new Member(102,"Ã¶¼ö");
		
		memberHS.addMember(member1);
		memberHS.addMember(member2);
		memberHS.addMember(member3);
		
		memberHS.showAll();
		System.out.println("\n");
		
		Member member4 = new Member(102,"ÈÆÀÌ");
		memberHS.addMember(member4);	// memberId Áßº¹, Ãß°¡µÇÁö ¾ÊÀ½
		
		memberHS.showAll();
		
	}
}
