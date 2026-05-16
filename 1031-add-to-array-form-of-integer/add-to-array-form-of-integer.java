class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {


        List<Integer> ls=new ArrayList<>();
        while(k>0){

            ls.add(0,k%10);
            k=k/10;
        }
        List<Integer> result=new ArrayList<>();

        int i=num.length-1;
        int j=ls.size()-1;

        int carry=0;

        while(i>=0||j>=0||carry>0){
            int sum=carry;


            if(i>=0){
            sum+=num[i];
            i--;
            }

            if(j>=0){
                sum+=ls.get(j);
                j--;
            }


            result.add(0,sum%10);
            carry=sum/10;
        }

        return result;
    }
}