class Solution {
public:
int jump(vector<int>& nums) {
            if (nums.size() == 1)
    {
        return 0;
    }
           if (nums[0] == 0)
    {
        return 0;
    }
    int maxsteps = nums[0];
    int steps = nums[0];
        int jumps=1;
    for (int i = 1; i < nums.size() -1; i++)
    {
        maxsteps = max(maxsteps, i + nums[i]);
        steps--;
        
        if (steps == 0)
        {
            jumps++;
            if (i >= maxsteps)
            {
                return 0;
            }

            steps = maxsteps - i;
        }
    }
    return jumps;
    }
};
