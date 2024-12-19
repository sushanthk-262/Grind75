class Solution {
    public int longestPalindrome(String s) {
        int p = 0;
        boolean indiv = false;
        if(s.length() == 1) return 1;

        int[] freq = new int[58];

        for(int i =0; i < s.length(); i++){
            freq[s.charAt(i) - 'A']++;
            if(freq[s.charAt(i) - 'A'] != 0 && freq[s.charAt(i) - 'A'] % 2 == 0){
                p++;
            }
        }

        for(int i = 0; i < 58; i++){
            if(freq[i] % 2 == 1){
                indiv = true;
                break;
            }
        }

        if(indiv) return 2*p + 1;
        
        return 2*p;
    }
}