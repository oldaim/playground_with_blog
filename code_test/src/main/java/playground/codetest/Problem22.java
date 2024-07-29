package playground.codetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Problem22 {

    /*
    *  user_id 와 bannned_id
    *  헤결 방법 전체 user_id 를 순회 하면서 각각의 banned_id
    *  응모 아이디가 중복해서 제제 아이디 목록에 들어 가는 경우는 없다.
    * */
    public static void main(String[] args) {
        String[] user_id = {"frodo","fradi","crodo","abc123","frodoc"};
        String[] banned_id = {"fr*d*","*rodo","******","******"};

        System.out.println(solution(user_id, banned_id));
    }

    public static int solution(String[] user_id, String[] banned_id) {

        HashSet<HashSet<String>> setList = new HashSet<>();
        HashSet<String> set = new HashSet<>();
        boolean[] user_id_used = new boolean[user_id.length];
        boolean[] banned_id_used = new boolean[banned_id.length];

        checkingId(user_id, banned_id,user_id_used,banned_id_used, setList, set);

        return new HashSet<>(setList).size();
    }

    public static void checkingId(String[] user_id, String[] banned_id,boolean[] u_used, boolean[] v_used, HashSet<HashSet<String>> list, HashSet<String> set) {


            for (int i = 0; i < user_id.length; i++) {
                if (u_used[i]) continue;
                for (int j = 0; j < banned_id.length; j++) {
                    if(v_used[j]) continue;
                    if (checkIdProcess(user_id[i], banned_id[j])) {

                        HashSet<String> newSet = new HashSet<>(set);
                        newSet.add(user_id[i]);
                        u_used[i] = true;
                        v_used[j] = true;
                        checkingId(user_id, banned_id,u_used, v_used, list, newSet);
                        u_used[i] = false;
                        v_used[j] = false;
                    }

                }
            }

            if (set.size() == banned_id.length) list.add(set);

    }


    //검증 과정
    public static boolean checkIdProcess(String checkingId, String banned_id){

        if (banned_id.length() != checkingId.length()) return false;

        banned_id = banned_id.replace('*','.');

        return checkingId.matches(banned_id);
    }

}
