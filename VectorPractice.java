package JavaCollections;
import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		Vector <String> v= new Vector<>();            // Create of objects
		v.add("Siddu");                               // Adding the elements
		v.add("Lilly");
		v.add(1,"Gayyaladhi");
		
		
		
		Vector <String> v1 = new Vector<>();
		v1.add("Paramesh");
		v1.add("Prasanaa");
		
		System.out.println(v);
		
		v.addAll(1,v1);            // Adding all the elements
		
		
		System.out.println(v);
		
		v.remove("Siddu");        //Remove the element
		v.removeAll(v1);          // Remove all the elements
		//v.clear();              // clear the whole the list of the elements
		System.out.println(v.contains("Lilly"));
		
		v.set(1, "Ajay");          // update of elements
		v.set(0, "Manasa");
		
		
		System.out.println(v);      //Retrieval of elements from the list
		System.out.println(v.firstElement());
		System.out.println(v1.firstElement());
	}
}
