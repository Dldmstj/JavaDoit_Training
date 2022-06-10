package object;


class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {

		if( obj instanceof Student) {
			Student std = (Student)obj;		// Student�� �ٿ�ĳ����
			
			if(this.studentID == std.studentID) {
				return true;
			}
			else return false;		// studentID �ٸ� ��� false
		}
		return  false;		// �ν��Ͻ��� Student�� �ƴ� ��� false
	}
	
	public int hashCode() {
		return studentID;		// studentID�� ����ϵ��� hashCode() ������
	}
	

}


public class EqualsEX {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
//		System.out.println(str1 == str2);		// �ν��Ͻ� �ּ� �� ��
//		System.out.println(str1.equals(str2));	// ���ڿ� ��
		
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));		//false, ������ equals�� == �� �ǹ�
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());		// �ؽ��ڵ� �޼ҵ尡 String Ŭ�������� �����ǵǾ�����
		
	}

}
