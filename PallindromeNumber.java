class Solution {
    public boolean isPalindrome(int x) {
        int original =x;
      if(x<0){
          return false;
      }else{
          int rev =0;
      while(x!=0){
          int digit = x%10;
          rev=(rev*10)+ digit; 
          x=x/10;
      }
        if(original==rev){
          return true;
      }else{
          return false;
      }

      }
      
    }
}
