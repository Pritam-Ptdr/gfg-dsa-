class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      
      for(int i = 0 ; i<arr.length ; i++){
          if(min > arr[i]){
              min = arr[i];
          }
           if(max < arr[i]){
              max = arr[i];
          }
      }
      ArrayList<Integer> list = new ArrayList<>();
      list.add(min);
      list.add(max);
      
        return  list ;
    }
}
