import java.util.Arrays;
class Solution {
  public static void main(String[] args){
    System.out.println(firstUniqChar("loveleetcode"));
  }
  public static int firstUniqChar(String s) {
    if(s.length() == 0 ) return -1;
    if(s.length() == 1) return 0;
    char[] x = s.toCharArray();
    Arrays.sort(x);
    if(x[0] != x[1]){
      System.out.println(x[0] + ", " + x[1]);
      return 0;
    }
    for(int i = 1; i < x.length-1; i++){
      if(x[i] != x[i-1] && x[i] != x[i+1]) return i;
    }
    if(x[x.length-1] != x[x.length-2]) return x.length-1;
    return -1;
  }
}