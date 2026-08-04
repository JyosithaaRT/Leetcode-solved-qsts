class Solution {
    public int largestAltitude(int[] gain) {
     int currentalti=0;
     int maxalti=0;
     for(int i=0;i<gain.length;i++){
        currentalti+=gain[i];
        if(currentalti>maxalti){
            maxalti=currentalti;
        }
     }   
     return maxalti;
    }
}