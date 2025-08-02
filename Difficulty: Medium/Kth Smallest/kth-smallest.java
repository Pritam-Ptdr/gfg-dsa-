// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        Arrays.sort(arr);
        int  n = arr.length ;
        
        int num  = 0 ;
        for(int i = 0 ; i<n ; i++){
            
            if(k == 1){
               return   num = arr[0];
            }
            
            if(k == n){
                return num =  arr[n-1];
            }
            
        
        if(k ==i && k>1){
        return  arr[i-1] ;
    
        }
        }
        
        return 0;
    }
    
    
}
