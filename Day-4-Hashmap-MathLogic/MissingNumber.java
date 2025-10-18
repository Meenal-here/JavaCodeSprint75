class MissingNumber{
    public int missingNumber(int[] nums) {
        int allXOR=0; //as place for missing value is filled by 0 
        //Xor of a number with itself is always 0
        //i.e- 2^2==0

        for(int i=0;i<=nums.length;i++){
            allXOR=allXOR^i; //xor each element from 0 to length
                             
        }
        for(int num:nums){
            allXOR=allXOR^num;  //allXor will get the missing element as it contains xor result of the numbers in the series
        }
        return allXOR;
    }
}
