package 贪心;

public class CanCompleteCircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0; //当前累计的剩余油量
        int totalSum = 0; //总剩余油量
        int start = 0;   //起始位置
        for (int i = 0; i< gas.length; i++){
            curSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            if (curSum < 0){ //如果当前累计的剩余油量小于0，说明当前环路无法完成
                curSum = 0;
                start = i + 1;
                curSum = 0; //重新计算当前累计的剩余油量
            }

        }
        if (totalSum < 0){
            return -1; //如果总剩余油量小于0，说明无法完成环路
        }else{
            return start;
        }
    }


}
