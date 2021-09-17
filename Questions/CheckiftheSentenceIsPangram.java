package Questions;

import java.util.HashSet;
import java.util.Set;

public class CheckiftheSentenceIsPangram {
	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		
		System.out.println(sol(sentence));
	}
	
	public static boolean sol(String sentence) {
		Set<Character> set = new HashSet<>();
		
        for(int i=97; i<=122; i++) {
        	set.add((char) i);
        }
        
        for(int i=0; i<sentence.length(); i++) {
        	set.remove(sentence.charAt(i));
        }
        
        return set.size()<=0;
	}
	
	public int firstMissingPositive(int[] nums) {
        
		Set<Integer> set = new HashSet<>();
		
		int max=Integer.MIN_VALUE;
		
		for(int n:nums) {
			set.add(n);
			if(n > max) max=n;
		}
		
		if(max < 1) return 1;
		
		int cnt = 1;
		
		while(cnt <= max) {
			if(!set.contains(cnt)) return cnt;
			cnt++;
		}
		
		return cnt;
    }
}
