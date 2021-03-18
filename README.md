# MustangCommandBased

first of all, TAB SIZE 4 MAN COME **ON**
	no but srsly we need to work on formatting code right...

	To convert a file to indent with tabs, size 4:
		Ctrl-Shift-P
		search "tabs"
		and choose either option, i generally try both and see what happens

	Remember, converting to tabs is easier *before* you start coding in the file than after.

	Do NOT hit the spacebar to indent. VSCode will automatically insert spaces or tabs, whichever you configured it with,
	whenever you hit the Tab key on your keyboard.


	other than indenting with tab size 4,
	use curly braces like THIS()
	{
		return 0;
	}

	not like this pls(){
		return 0;
	}

	Easy way to do that:
		- Start typing the method heading
			public void beep()
		
		-
	

	Also, try installing the 'indent-rainbow' and 'Bracket Pair Colorizer' extensions, trust me they're a godsend





	Now, those were just preferences that are specific to our code. (Don't go to a company project and convert their files to tabs, if they have a styleguide follow that)
	
	In general:
		Make sure your indentation is consistent.
			I've seen some of your code where each deeper scope isn't even indented in.
			Here's how to do that correctly.
	
public class JavaClass
{
	public static void main()
	{
		// Notice how the braces and indents work
	}

	private class Bonkadonko
	{
		private int one = 1;

		public void setOne()
		{
			one = 1;
		}
	}
}


	Do NOT do:

	public class Monkey{
	int age;
	 public void setAge(int age){
	this.age = age;
	 }
	}

	As you can see, it's disgusting.

	Stuff like this will compile, however, you should always write code
	as if it is meant to be read by a HUMAN, not just by a computer.

	This may mean adding comments/javadocs where necessary,
		simplifying your approach to the problem to make it more understandable to a n00b,
		or just formatting the durn code better.