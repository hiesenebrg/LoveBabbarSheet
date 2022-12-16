public class RemoveDuplicatesRecursively {
    public String removeConsecutiveCharacter(String S){
        String input = S;
          if (input.length() <= 1)
              return input;
          if (input.charAt(0) == input.charAt(1))
              return removeConsecutiveCharacter(
                  input.substring(1));
          else
              return input.charAt(0)
                  + removeConsecutiveCharacter(
                         input.substring(1));
        
      }
}
