import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorA {

	public static void main(String[] args){		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Ajay");
		al.add("Bijay");
		al.add("Sujay");
		al.add("Sumit");
		al.add("Nikhil");
		al.add("Siba");
		al.add("Pavan");
		
		Iterator itr =al.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
