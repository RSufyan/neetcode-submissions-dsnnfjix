class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> ss = new HashMap<>();
        HashMap<Character, Integer> tt = new HashMap<>();

        for (int i = 0; i<s.length();i++){
            ss.put(s.charAt(i),ss.getOrDefault(s.charAt(i),0)+1);
        }

        for (int j = 0; j<t.length();j++){
            tt.put(t.charAt(j),tt.getOrDefault(t.charAt(j),0)+1);
        }

        if(ss.equals(tt)){
            return true;
        }
        else{
            return false;
        }

    }
}
