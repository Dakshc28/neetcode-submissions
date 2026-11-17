class Solution {
    public boolean isAnagram(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        s= s.toLowerCase();
        t= t.toLowerCase();
        int[] charcount=new int[26];
        if(l1!=l2)
        {
            return false;
        }
        for(int i=0;i<l1;i++)
        {
            charcount[s.charAt(i)-'a']++;
            charcount[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(charcount[i]!=0)
            {
               return false;
            }
        }
        return true;
    }
}
