public class KillCilantro {
   public static void main(String[] args) {
      System.out.println(KillCilantro("testcilantrotest"));
      System.out.println(KillCilantro("cilantrotest"));
      System.out.println(KillCilantro("nothinghere"));
      System.out.println(KillCilantro("testcilantro"));
      System.out.println(KillCilantro("cilantrocilantrocilantro"));
   }
   public static String KillCilantro(String input) {
      
      int count = 0;
      String temp = "";
      String toReturn = "";
      
      //testing everything except for the last 7 letters and then replacing them if it is cilantro
      while (count <= input.length() - 8) {
         temp = input.substring(count, count + 8);
     
         if (temp.equals("cilantro")) {
            toReturn += "parsley";
            count += 7; //adds an extra 7 on top of the count++ at the end for a total of 8 to skip the rest of the word
         } else {
            toReturn += input.substring(count, count + 1);
         }
         count ++;
      }
      
      if (count == 0) {
         count++;
      }
      
      //final letters dont need to be run through a checker because cilantro cannot fit
      toReturn += input.substring(count , input.length());
      
      return toReturn;
   }
}