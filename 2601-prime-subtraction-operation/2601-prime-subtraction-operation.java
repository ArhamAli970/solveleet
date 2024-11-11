class Solution {
    public boolean primeSubOperation(int[] nums) {
        
        boolean nprime[]=new boolean[1001];
        int pr=nprime.length;
        
        for(int i=2;i<=Math.sqrt(pr);i++){
            if(!nprime[i]){
                for(int j=i*i;j<pr;j+=i){
                    nprime[j]=true;
                }
            }
        }
        
        nprime[0]=true;nprime[1]=true;
        
        
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>=nums[i+1]){
                for(int j=2;j<nums[i];j++){
                    if(!nprime[j] && nums[i]-j<nums[i+1]){
                        nums[i]-=j;
                        break;
                    }
                }
                
                if(nums[i]>=nums[i+1]){return false;}
            }
        }
        
        return true;
        
    }
}