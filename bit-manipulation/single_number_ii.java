  public class single_number_ii {  
        public int singleNumber(int[] nums) {  
           int p = 0;  
           int q = 0;  
           for(int i = 0; i<nums.length; i++){  
              p = q & (p ^ nums[i]);  
              q = p | (q ^ nums[i]);  
           }  
           return q;  
        }  
    }