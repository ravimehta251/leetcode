/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i=1;
        while(i<=n){
            int mid=(n-i)/2+i;
            if(isBadVersion(mid)){
                n=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }
}