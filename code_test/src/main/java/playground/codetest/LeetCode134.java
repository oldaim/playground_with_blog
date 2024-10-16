package playground.codetest;

public class LeetCode134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        /*
            gas[i]: 해당 주유소에서 충전할수 있는 가스의 양
            cost[i]: 다음 i + 1 번째 (cost.length - 1 이라면 0 번째) 로 갈때 소요되는 cost의 값

            1. 일단 gas 전체의 합이 cost 보다 작으면 false (-1) 반환
            2. 아니라면 후보군을 선정해서 모두 돌려보면

            3 + 3 -2 -2 -2 = 0
        */

        int total = 0;
        int margin = 0;
        int start = 0;



        for(int i = 0; i < gas.length; i++){

            total += gas[i] - cost[i];
            margin += gas[i] - cost[i];

            if(margin < 0 ){
                margin = 0;
                start = i + 1;
            }
        }

        return total < 0 ? -1:start;
    }
}
