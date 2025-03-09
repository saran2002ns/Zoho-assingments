public class Test{
    static long max=0;
    public static void main(String[] args) {
        int[] nums={3, 30, 34, 5, 9};
        boolean []bool= new boolean[nums.length];
        new Test().helper(0,"",nums,bool);

        System.out.println(max);

    }
    private void helper(int n,String sum,int[] nums,boolean []bool ){
        if(n==nums.length){
            max=Math.max(max,Integer.valueOf(sum));
            return;
        }
        
        
        for(int i=0;i<nums.length;i++){
            if(!bool[n]){
                bool[n]=true;
                helper(n+1,sum+nums[n],nums,bool);
                bool[n]=false;
                helper(n+1,sum,nums,bool);
            }
        }
        
    }
}

