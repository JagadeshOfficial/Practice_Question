package Collections;
import java.util.*;
public class ArrayCollectionDemo {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(9);
		a.add(10);
		a.add("XXX");
		a.add("yyy");
		System.out.println(a);
		a.add(2,"ZZZ");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		String s =  (String) a.get(1);
		System.out.println(s);

	}

}

/*
 Converting  respective primitive type into reference type or vice-versa  automatically.
 This feature is known as autoboxing 
 */
