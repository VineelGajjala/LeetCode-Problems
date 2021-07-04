class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        List<Character> vowel =Arrays.asList('a' ,'e','i','o','u' ,'A','E','I','O', 'U');
        char[] arr= s.toCharArray();
        
        while (left < right) {
            if (vowel.contains(arr[left]) && vowel.contains(arr[right])) {
                char curr = arr[left];
                arr[left] = arr[right];
                arr[right] = curr;
                
                
                left++;
                right--;
                
            } else if (!vowel.contains(arr[left])) {
                left++;
            } else if (!vowel.contains(arr[right])) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}