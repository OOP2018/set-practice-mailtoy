import java.util.*;

/**
 * Practice using a Set.
 */
public class SetPractice {
	/**
	 * Add zero or more items to the set, and print what is being added.
	 * @parameter set is the Set to add items to
	 * @parameter values zero or more Strings to add to set
	 */
	public static void addAll(Set<String> set, String ...values) {
		for(String arg: values) {
		       System.out.print(" "+arg);
		       set.add(arg);
		       }
		System.out.println();
		}
		// then use:
		
		// add all the values to the set. 
		// print each one as you add it
	
	
	/**
	 * Print all the elements in a set, using an Iterator.
	 */
	public static void print(Set<String> set) {
		Iterator<String> iter = set.iterator();
		while( iter.hasNext() ) {
			String setnext = iter.next();
			System.out.println(setnext + " ");
		}
		
		// create an Iterator using set.iterator()
		// then use the iterator to print everything in the set
	}
	
	/**
	 * Explore behavior of a Set.
	 */
	public static void setExplorer( ) {
		// 1. Create a HashSet and add strings: dog, ant, bird, elephant, cat
		Set<String> set = new HashSet<>();
		addAll(set, "dog", "ant", "bird", "elephant", " cat");
		print(set);

		
		
		
		
		
		// 2. Print elements in the set using an Iterator over the Set.
		// You're going to need to do this again, so write a method print(Set set) to do it.
		
		
		// 3. are the elements printed in same order than you added them? 
		// What does this tell you about Sets?
		
		
		// 4. Remove all the elements from the set, using a method that 
		// defined in Set (and Collection). What is the method to use?
		set.clear();
		
		
		// 5. Add same elements as exercise 1, but in a different order,
		// such as: "cat", "elephant", "bird", "ant", "dog"
		addAll(set, "cat", "elephant", "bird", "ant", "dog");
		print(set);
		
		
		// 6. Print the elements in the set.  Is the order same as before?
		
		
		// 7. Add duplicate elements to the set.  Add another "cat" and "dog".
		// To ensure that these are *distinct* objects use 'set.add(new String("cat"))'
		// and new String("dog").
		System.out.println("Add duplicate items to the set ");
		set.add(new String("cat"));
		set.add(new String("dog"));
		// 8. Print the elements in set.  Are there any duplicates?
		// What property of Set does this demonstrate?
		System.out.print("Set contains: ");
		print(set);
		
		
		
		// 9. Repeat the exercises using a TreeSet instead of HashSet.
		//  What is different when you use TreeSet?
		
		Set<String> setT = new TreeSet();
		addAll(setT, "dog", "ant", "bird", "elephant", "cat");
		print(setT);
		
		setT.clear();
		
		System.out.println("Add duplicate items to the setT ");
		setT.add(new String("cat"));
		setT.add(new String("dog"));
		System.out.print("Set contains setT: ");
		print(setT);
		
		
		// Hint: Use Polymorphism.  Make the Set object be a *parameter* to the
		// method so you can easily use a different set just by changing the parameter!
		
		// 10. Repeat again using TreeSet with a Comparator.
		
	}

	public static void main(String[] args) {
		setExplorer();
	}
}
