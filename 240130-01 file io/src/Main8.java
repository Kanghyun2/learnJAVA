import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;

public class Main8 {
	public static void main(String[] args) {
		Person p = new Person("이름", 170, 77.77, true);
		Person o = new Person("성재", 190, 55.55, true);
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(new File("p.ser"), true))) {
			oos.writeObject(p);
			oos.writeObject(o);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(new File("p.ser")))) {
			while(true) {
			Person read = (Person) ois.readObject();
			System.out.println(read);
			}
		} catch (StreamCorruptedException e) {
			System.out.println("ㅋ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
}
