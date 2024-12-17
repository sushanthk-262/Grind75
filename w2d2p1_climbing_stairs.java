class Solution {
    public int getWays(int n, HashMap<Integer, Integer> ways){
        if(n == 0) return 0;

        if(!ways.containsKey(n-1)){
            ways.put(n-1, getWays(n-1, ways));
        }

        if(!ways.containsKey(n-2)){
            ways.put(n-2, getWays(n-2, ways));
        }
        return ways.get(n-1) + ways.get(n-2);
    }
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        HashMap<Integer, Integer> ways = new HashMap<>();
        ways.put(1, 1);
        ways.put(2, 2);
        return getWays(n, ways);
    }
}