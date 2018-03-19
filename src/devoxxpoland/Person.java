// Why Functional Programming Matters -- Coding Tech
// https://www.youtube.com/watch?v=oB8jN68KGcU

package devoxxpoland;
	
	public class Person
	{
	    public Person(String fn, String ln, int a)
	    {
	        this.firstName = fn; this.lastName = ln; this.age = a;
	    }
	 
	    public String getFirstName()   { return firstName; }
	    public String getLastName()  { return lastName; }
	    public int getAge() { return age; }

	    public String toString()
	    {
	        return "[Person: firstName=" + firstName +
	               "lastName " + lastName +
	               " age = " + age + "]";

	    }

	    private String firstName;
	    private String lastName;
	    private int age;
	}

