class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         int indices[] = new int[26];
for(int i = 0; i < indices.length; i++) {
    indices[i] = 0;
}
       
       for (int i = 0; i < magazine.length(); i++) {
			indices[(int)magazine.charAt(i) - (int)'a']++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			indices[(int)ransomNote.charAt(i) - (int)'a']--;
			if(indices[(int)ransomNote.charAt(i) - (int)'a'] < 0){
			 return false;
			}
		}
        return true;
        
    }
}
