// Why Functional Programming Matters -- Coding Tech
// https://www.youtube.com/watch?v=oB8jN68KGcU

package devoxxpoland;

import java.util.*;

public class App {
   public static void main(String... args) {
     List<Person> people = Arrays.asList(
        new Person("Ted", "Neward", 45),
        new Person("Matt", "Stine", 35),
        new Person("Neal", "Ford", 55),
        new Person("Chalotte", "Neward", 39),
        new Person("Michael", "Neward", 22),
        new Person("Matthew", "Neward", 16)
        );
     
   List<Person> drinkers = Lists.filter(people, new Function1<Boolean,Person>() {
      public Boolean apply(Person p) {
    		return p.getAge() > 20;
    	}
    });
   
   List<Integer> ages = Lists.transform(new Function1<Integer, Person>() {
	     public Integer apply(Person p) {
	         return p.getAge();
	     }
	}, people);
	for (Integer i : ages) {
	    System.out.println(i);
	}
	
	Integer totalAges = Lists.fold(0, people, new Function2<Integer,Integer,Person>() {
		public Integer apply(Integer current, Person p) {
			return current + p.getAge();
		}
	});
	System.out.println("Total ages"+totalAges);
	
	String xml =  Lists.fold("<persons>", people, new Function2<String, String, Person>(){
		public String apply(String current, Person p) {
			return current + "<person firstName='" + p.getFirstName() + "' lastName='" + p.getLastName() + "'>";
		}
	}) + "</persons>";
	
   System.out.println(xml);
    
    for (Person p : drinkers)
     {
    	if(p.getAge() > 20) {
    	 System.out.println("Here, have a beer, " +
          p.getFirstName()); 
    	} 
     }
  }
}