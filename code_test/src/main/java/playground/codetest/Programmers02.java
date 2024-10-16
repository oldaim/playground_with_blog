package playground.codetest;

public class Programmers02 {

    public static void main(String[] args) {

        Programmers02 programmers02 = new Programmers02();

        programmers02.solution(4, 5, new int[]{1, 0, 3, 1, 2}, new int[]{0, 3, 0, 4, 0});

    }

    public long solution(int cap, int n, int[] deliveries, int[] pickups) {

        /*
            택배 배달과 수거하기
            1. 배달 및 수거 하는데 걸린 최소 거리
            2. 배달 회수 둘다 뭘 먼저하던 상관 없음
            3. 배달인 경우 cap 과 같거나 끝에 도달한 경우 ( = n )  다시 비워진 상태로 회전
            4. 수거인 경우 cap 을 4로 만들고 - 해서 0 과 같도록 ( 결과가 0보다 작으면 못실고 옴)
         */

        long answer = -1;
        int deliveryCount = 0;
        int pickupCount = 0;
        int returnIndex = 0;

        while (!isEmpty(deliveries, pickups)){

            for (int i = 0; i < deliveries.length; i++) {


                if(deliveryCount + deliveries[i] <= cap) {
                    deliveryCount += deliveries[i];
                    deliveries[i] = 0;
                }
                else {
                    deliveries[i] -= (cap - deliveryCount);
                    returnIndex = i;
                    break;
                }

            }

            for (int i = returnIndex; i >= 0; i--) {

                if (pickupCount + pickups[i] <= cap) {
                    pickupCount += pickups[i];
                    pickups[i] = 0;
                }else {
                    pickups[i] -= (cap - pickupCount);
                }
            }

            answer += returnIndex;

            deliveryCount = 0;
            pickupCount = 0;
            returnIndex = 0;

        }


        return answer;
    }

    public boolean isEmpty(int [] delivers, int[] pickups){

        for (int deliver : delivers) if (deliver != 0) return false;

        for (int pickup : pickups) if (pickup != 0) return false;

        return true;
    }

}

