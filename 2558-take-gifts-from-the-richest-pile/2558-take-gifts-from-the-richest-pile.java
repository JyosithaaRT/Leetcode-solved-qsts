class Solution {
    public long pickGifts(int[] gifts, int k) {
      for(int j=0;j<k;j++){
        int max=0;
        for(int i=1;i<gifts.length;i++){
            if(gifts[i]>gifts[max]){
                max=i;
            }
        }
         gifts[max]=(int) Math.sqrt(gifts[max]);
        }
        long sum=0;
        for(int g:gifts){
            sum+=g;
        }
        return sum;
    }
}