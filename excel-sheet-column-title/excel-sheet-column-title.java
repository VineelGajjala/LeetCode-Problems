class Solution {
    public String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String title="";
    
    public String convertToTitle(int columnNumber) {
        if(columnNumber <= 26){
			 return Character.toString(alphabet.charAt(columnNumber-1));
		}
		else{
			int rem =columnNumber%26;
			int qu =columnNumber/26;
			if(rem==0){
				title = convertToTitle(qu-1).concat(convertToTitle(26));
			}
			else{
				 title = convertToTitle(qu).concat(convertToTitle(rem));
			}
		}
		return title;
    }
}