class Solution {
    public:
    int maxArea(vector<int>& height) {
        int left = 0;
        int right = height.size()-1;
        int maxWater = 0;
        int oneHeight= 0;
        int oneWater=0;
        while(left<right){
            int width = right-left;
            if (height[left] < height[right]) {
                oneHeight=height[left];
                left++;
            } else {
                oneHeight=height[right];
                right--;
            }
            oneWater = width*oneHeight;
            if(oneWater>maxWater){
                maxWater=oneWater;
            }
        }
        return maxWater;
    }
};