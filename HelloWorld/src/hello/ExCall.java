package hello;

import java.util.ArrayList;
import java.util.Iterator;


public class ExCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList al = new ArrayList(); -- non generic
		//non generic -- no specific type os data collection is mentioned.
		//Array is collection of similar items.
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(4);
		al.add(1);
		System.out.println(al);
		
		//generic-->types of objects need to be collected by the collection.
		//<Wrapperclass/Userdefined class>
		
		/*for(int i=0;i<al.size();i++) {
		//if u wan tot access a value in a specific location of a collection then get is used
			if(al.get(i)==4) {
				System.out.println("found 4 at"+i);
	}}*/
		// Iterator: it is a class which holds the object
		Iterator i = al.iterator();//we get the base address of the array list
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
