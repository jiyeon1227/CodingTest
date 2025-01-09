class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(int i= 0; i<babbling.length; i++) {
            if(check(babbling[i])){
                answer ++;
            }
        }
        
        return answer;
    }

    public boolean check (String word){
        
        String[] check = {"aya", "ye", "woo", "ma"};
        String prev = "";
        
        while (!word.isEmpty()) {
            boolean matched = false;
            
            for (String c : check) {
                if (word.startsWith(c) && !c.equals(prev)) {
                    word = word.substring(c.length());
                    prev = c;
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                return false;
            }
        }
        return true;
    }
}