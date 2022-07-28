package collention_framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		System.out.println(set.isEmpty()+" "+set.size());
		set.add(1);
		set.add("World");
		set.add(3.14);
		set.add(true);
		set.add(3.22f);
		System.out.println(set.isEmpty()+" "+set.size());
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("============================");
		HashSet<String> hs = new HashSet<String>();

		hs.add("Hello");
		hs.add("World");
		hs.add("Hello");
		hs.add("Blog");
		hs.add("CrazyKim");

		// Traversing elements
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("============================");
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("Hello");
		ts.add("World");
		ts.add("Hello");
		ts.add("Blog");
		ts.add("CrazyKim");

		// Traversing elements
		Iterator<String> tr = ts.iterator();
		while (tr.hasNext()) {
			System.out.println(tr.next());
		}

	}

}
