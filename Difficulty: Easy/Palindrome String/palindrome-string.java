class Solution {
    boolean isPalindrome(String s) {
       
      int start = 0 ;
      int end = s.length()-1;
      
    char[] ch = new char[s.length()];
    
    for(int i = 0 ; i<s.length() ; i++){
        ch[i] = s.charAt(i);
    }
   
    
   while(start < end ){
       if(ch[start] != ch[end]){
           return false ;
           
       }
       start++;
           end--;
       
   }
   return  true ;
        
        
    }
    
        
    }
