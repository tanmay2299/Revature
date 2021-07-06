package remove_duplicates;

public class Demo_1 {
	   public static void main(String[] args) {
	      String str = "aaaabbbcccddddeeeeffg";
	      char[] characters = str.toCharArray();
	      int length = characters.length;
	      System.out.println("String with duplicates : " + str);
	      for (int i = 0; i < length; i++) 
	      {
	         for (int j = i + 1; j < length; j++) 
	         {
	            if (characters[i] == characters[j]) 
	            {
	               int temp = j;
	               for (int k = temp; k < length - 1; k++) 
	               {
	                  characters[k] = characters[k + 1];
	               }
	               j--;
	               length--;
	            }
	         }
	      }
	      
	      String strwd = new String(characters);
	      strwd = strwd.substring(0, length);
	      System.out.println("String after duplicates removed : " +strwd);
	   }
	}