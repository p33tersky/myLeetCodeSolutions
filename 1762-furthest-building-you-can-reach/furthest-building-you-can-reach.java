class Solution {
    
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> heightsQueue = new PriorityQueue<>();
        for (int i = 0; i < heights.length - 1; i++) {
            int height = heights[i + 1] - heights[i];
            if (height > 0) {
                heightsQueue.add(height);
                if (heightsQueue.size() > ladders) {
                    bricks -= heightsQueue.poll();
                    if (bricks < 0)
                        return i;
                }
            }
        }
        return heights.length - 1;
    }
}