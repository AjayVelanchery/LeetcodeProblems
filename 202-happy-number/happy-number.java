class Solution {
    public boolean isHappy(int n) {

ArrayList<Integer> seen=new ArrayList<>();
int sum=0;
while(sum!=1){
sum=square(n);
System.out.print(sum);
System.out.print(seen);
     
      n=sum;
      if(seen.contains(sum)){
        return false;
      }
       seen.add(sum);
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