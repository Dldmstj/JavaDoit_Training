package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Externalizable {	// 직렬화 혀용
	
	String name;
	String title;
	
	public Person() {}
	public Person(String name, String title) {
		this.name = name;
		this.title = title;
	}
	public String toString() {
		return name + " , " + title;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
}
public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person p1 = new Person("짱구", "Manager");

		try(FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos) ) {
			
			oos.writeObject(p1);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis) ) {
			
			Object obj = ois.readObject();
			
			if (obj instanceof Person) {
				Person p = (Person)obj;
				System.out.println(p);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
