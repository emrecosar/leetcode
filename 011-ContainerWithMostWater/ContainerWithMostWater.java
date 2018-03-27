public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            int area = (r - l) * Integer.min(height[l], height[r]);
            if (area > maxArea)
                maxArea = area;
            if (height[l] >= height[r])
                r--;
            else
                l++;
        }
        return maxArea;
    }
}