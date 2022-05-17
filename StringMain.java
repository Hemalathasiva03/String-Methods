public class StringMain {
	
	public static void main(String[] args) 
	{
		 
		 String str1 ="hema";
		 String str2 ="latha";
		 StringMethods obj = new StringMethods(str1);
		 String word ="hello world";
		 String prefix ="h";
		 String suffix ="world";
		 //char ch ='m';
		 //char ch2 ='s';
		 System.out.println("Length : "+obj.Length(str1));
		 System.out.println("Concat : "+obj.Concat(str2));
		 System.out.println("IsEmpty : "+obj.IsEmpty(obj.Length(str1)));
		 System.out.println("StrtoUpper : "+obj.StrtoUpperCase(str1));
		 System.out.println("StrtoLower :"+obj.StrtoLowerCase(str1));
		 System.out.println("Compare : "+obj.Compare(str2));
		 System.out.println("ObjectToString : "+obj.ObjectToString());
		 System.out.println("StartWith : "+obj.StartWith(word,prefix));
		 System.out.println("endsWith : "+obj.endsWith(word,suffix));
		 System.out.println("Replace : "+obj.Replace(str1,'m','s'));
		 System.out.println("StrIndexOf : "+obj.StrIndexOf(str1,'m',obj.Length(str1)));
		
	}

}
