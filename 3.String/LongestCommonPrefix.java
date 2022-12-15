public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) 
    {

    		int LCSLength = Integer.MAX_VALUE;
    		String LCS = "";
    		// find the smallest element in the string array
    		for (int i = 0;i< strs.length;i++)
    		{
    			if(LCSLength > strs[i].length())
    			{
    				LCSLength = strs[i].length();
    				LCS = strs[i];
    			}
    		}
    		
    		//Compare the smallest element with all other elements in the array. If only part of 
    		// LCS match then, reassign the newLCS to LCS. 
    		for (int i = 0;i< strs.length;i++)
    		{
    			StringBuffer newLCS = new StringBuffer();
    			for (int j = 0;j<LCSLength;j++)
    			{
    				if (LCS.charAt(j) == strs[i].charAt(j))
    				{
    					char c = LCS.charAt(j);
    					newLCS.append(c);
    				}
    				else
    				{
    					break;
    				}
    				
    			}
		LCS = newLCS.toString();
		LCSLength = LCS.length();
    		}
    		return LCS;
    		
    
}
}
