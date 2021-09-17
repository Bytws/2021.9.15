package 斗地主加强版;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<Integer,String> pokemap = new HashMap<>();

        ArrayList<String> color = new ArrayList<>();

        Collections.addAll(color,"♠","♥","♣","♦");
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(numbers,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
        int id = 0;
        pokemap.put(id++,"大王"); //先用再加
        pokemap.put(id++,"小王");

        for (String number : numbers) {
            for (String s : color) {
                String pai = s+number;
                pokemap.put(id++,pai);
            }
        }
        System.out.println(pokemap);
        System.out.println(pokemap.size());

        Set<Integer> set = pokemap.keySet();
        //打乱牌序，也就是打乱map集合键的顺序。用Collections.shuffle方法，但是它只支持list集合，转换为list
        ArrayList<Integer> pokeid = new ArrayList<>();
        pokeid.addAll(set); // 把set集合中所有元素添加到ArrayList集合中
        Collections.shuffle(pokeid);
        System.out.println(pokeid);

        TreeSet<Integer> play1ID = new TreeSet<>();
        TreeSet<Integer> play2ID = new TreeSet<>();
        TreeSet<Integer> play3ID = new TreeSet<>();
        TreeSet<Integer> dipaiID = new TreeSet<>();

        for (int i = 0; i < pokeid.size(); i++) {
            Integer paiid = pokeid.get(i);

            if(i >= 51){
                dipaiID.add(paiid);
            }else if(i%3==0){
                play1ID.add(paiid);
            }else if(i%3==1){
                play2ID.add(paiid);
            }else {
                play3ID.add(paiid);
            }
        }

        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (Integer paiid1 : play1ID) {
            String s = pokemap.get(paiid1);
            play1.add(s);
        }

        for (Integer paiid2 : play2ID) {
            String s = pokemap.get(paiid2);
            play2.add(s);
        }

        for (Integer paiid3 : play3ID) {
            String s = pokemap.get(paiid3);
            play3.add(s);
        }

        for (Integer paiid4 : dipaiID) {
            String s = pokemap.get(paiid4);
            dipai.add(s);
        }
        System.out.println("玩家1:"+play1);
        System.out.println("玩家2:"+play2);
        System.out.println("玩家3:"+play3);
        System.out.println("dipai:"+dipai);
    }
}
