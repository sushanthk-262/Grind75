class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> updatedList = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        while (i < n && intervals[i][1] < newInterval[0]) {
            updatedList.add(intervals[i]);
            i++;
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        updatedList.add(newInterval);
        while (i < n) {
            updatedList.add(intervals[i]);
            i++;
        }
        return updatedList.toArray(new int[updatedList.size()][]);
    }
}
