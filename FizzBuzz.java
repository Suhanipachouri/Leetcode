class Solution {
    public List<String> fizzBuzz(int n) {
      List<String>ans=new ArrayList();
        for(int i=1;i<=n;i++){
            String s=getF(i);
            ans.add(s);
        }
        return ans;
    }
    String getF(int n){
        if(n%3==0 && n%5==0){return "FizzBuzz";}
        else if(n%3==0){return "Fizz";}
        else if(n%5==0){return "Buzz";}
        return Integer.toString(n) ;  
    }
}
