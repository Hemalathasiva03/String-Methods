public class StringMain {
	
	public static void main(String[] args) 
	{
		 StringMethods obj = new StringMethods();
		 String str1 ="hema";
		 String str2 ="latha";
		 String word ="hello world";
		 String prefix ="h";
		 String suffix ="world";
		 char ch ='m';
		 char ch2 ='s';
		 System.out.println("Length : "+obj.Length(str1));

		 System.out.println("Concat : "+obj.Concat(str1,str2));
		 System.out.println("IsEmpty : "+obj.IsEmpty(obj.Length(str1)));
		 System.out.println("StrtoUpper : "+obj.StrtoUpperCase(str1));
		 System.out.println("StrtoLower :"+obj.StrtoLowerCase(str1));
		 System.out.println("Compare : "+obj.Compare(str1, str2));
		 System.out.println("ObjectToString : "+obj.ObjectToString());
		 System.out.println("StartWith : "+obj.StartWith(word,prefix));
		 System.out.println("endsWith : "+obj.endsWith(word,suffix));
		 System.out.println("Replace : "+obj.Replace(str1,ch,ch2));
		 System.out.println("StrIndexOf : "+obj.StrIndexOf(str1,ch,obj.Length(str1)));
		
	}

}
