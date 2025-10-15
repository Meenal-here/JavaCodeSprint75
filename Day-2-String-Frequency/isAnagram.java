//leetcode 242 isAnagram
//https://leetcode.com/problems/valid-anagram/
//time complexity O(nlogn) space complexity O(1)
//sort both the strings and compare if they are same or not
//brute force approach using character array and sorting
class isAnagram {
    public boolean isAnagram(String s, String t) {
    if(s.length()==t.length()){ //length of both the string must be same
      int n = t.length();
      int count=0;
      char[] copyS = s.toCharArray();   //make character array of both the strings
      char[] copyT = t.toCharArray();

      Arrays.sort(copyS);   //sort both the arrays
      Arrays.sort(copyT);


      for(int i=0;i<n;i++){
        if(copyT[i]==copyS[i])  //both the elements of the arrays are sorted they'll be same only if it is anagram
        {
            count++;
        }
      }

      if(count==n)  //if count of the matching characters are same as length then it's an anagram
      {
        return true;    //is anagram
      }
      else{
        return false;   //not an anagram
      }



    }
    else{
        return false;
    }
   }
}