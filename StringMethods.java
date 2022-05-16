import java.util.*;


  public class StringMethods 
  {
    
    //1.string  length return total length  
    public int Length(String str){
  	int i = 0;
  	for(char c: str.toCharArray()) 
  	{
     i++;
	  }
  	 //System.out.println("Length of the given string : "+i);
  	 return i;
  }
  
  //2.String concat of the two String
  public String Concat(String str1,String str2) 
  {
      String concat =(str1+str2);
  		  return concat;
	}
	
	//3.String isempty return Boolean(true or false)
  public boolean IsEmpty(int strlen)
  {
      Boolean b = true;
  		if(strlen == 0)
  		{
  			return b;
  		}
  		else
  		{
  		  b = false;
  		  return b;
  	  }
  }
	  
	  //4.String Upper Case() return lower case to Upper Case
  public String StrtoUpperCase(String str1)
  {
      char strArr[] = str1.toCharArray();
      for (int i = 0; i < strArr.length; i++) 
      {
        // here is the actual logic
        if (strArr[i] >= 'a' && strArr[i] <= 'z') 
        {
          strArr[i] = (char) ((int) strArr[i] - 32);
        }
      }
      String str = new String(strArr);
        return str;
  }
	  
 //5.String Lower Case() return Upper Case to lower case 	  
  public String StrtoLowerCase(String str1)
  {
    char strArr[] = str1.toCharArray();
    for (int i = 0; i < strArr.length; i++) 
    {
      // here is the actual logic
      if (strArr[i] >= 'A' && strArr[i] <= 'Z') 
      {
        strArr[i] = (char) ((int) strArr[i] + 32);      
      }
    }
    String str = new String(strArr);
      return str;
  }
	  
	 //6.String Compare return boolean
  public boolean Compare(String str1, String str2)
  {
  	if(str1==null || str2==null)
  	{
  	  return false;
  	}
  	//compare lengths
  	if(str1.length()!=str2.length())
  	  return false;
  	//compare all characters
  	for (int i = 0; i <str1.length() ; i++) 
  	{
  	  if(str1.charAt(i)!=str2.charAt(i))
  		  return false;
  	}
  	//if here, means both strings are equal
  	return true;
  }

  //7.String ObjectToString return String
  public String ObjectToString() 
  {
      StringMethods obj = new StringMethods();  
  		return ((obj == null)? null : obj.toString()); 
	 }
	 
	 //8.String StartWith return boolean
	  public boolean StartWith(String str,String prefix) 
	  {
    	int len =str.length();
  		char[] ch1 = str.toCharArray();
  		char[] ch2 = prefix.toCharArray();
  		int start,i = 0;
  		int last = prefix.length();
  		if((i<0)||(i>len-last))
  		{
  			return false;
  		}
  		while(--last>=0)
  		{
  			if(ch1[i++]!=ch2[last--])
  			{
  				return false;
  			}
  		}
  		return true;
	}
 
  //9. String endsWith return boolean
  public static boolean endsWith(String str, String suffix)
  {  
      return (str.lastIndexOf(suffix) == str.length() - suffix.length()); 
  }


  //10.String Replace return replaced String
  public String Replace(String str,char ch1, char ch2) 
  {
    		char[] arr = str.toCharArray();
    		int len =str.length();
    		for(int i=0;i<len;i++)
    		{
    			if(arr[i]==ch1){
    				arr[i] = ch2;
    			}
    		}
    		String str2 = new String(arr);
            return str2;
	}


  //11.String index return position
  public int StrIndexOf(String str,char ch,int len) 
  {
    		char[] arr =  str.toCharArray();
    		for(int index =0;index<len;index++)
    		{
    			if(ch== arr[index]){
    				return index;
    			}
    		}
    		return -1;
    	}
}