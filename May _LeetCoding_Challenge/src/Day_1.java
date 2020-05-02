/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
    int first = 1;
    int last = n;
        int middle = first + (last-first)/2;
        
    while(first<= last){
        
        if(isBadVersion(middle) == true){
            last = middle - 1;
        }
        else if(isBadVersion(middle) == false){
            first = middle + 1;
        } 
         middle = first + (last-first)/2;
    }
        return middle;
    }
}
