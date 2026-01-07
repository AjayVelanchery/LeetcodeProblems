class Solution {
    public boolean isHappy(int n) {

ArrayList<Integer> seen=new ArrayList<>();

while(n!=1){

      if(seen.contains(n)){
        return false;
      }
       seen.add(n);
       n=square(n);
      }
     
return true;
}
public int square(int n){
int sum=0;
while(n>0)
{
    int digit=n%10;
      sum+=digit*digit;
       n=n/10;
}
return sum;
        
    }
}