package 斗地主初级;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> pokeBox = new ArrayList<>();

        ArrayList<String> color = new ArrayList<>();
        color.add("♠");
        color.add("♥");
        color.add("♣");
        color.add("♦");

        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("A");
        numbers.add("K");
        numbers.add("Q");
        numbers.add("J");
        for (int i = 2; i <= 10;i++) {
            numbers.add(i+"");
        }
        pokeBox.add("大王");
        pokeBox.add("小王");

        for (String number : numbers) {
            for (String c : color) {
                String pai = c+number;
                pokeBox.add(pai);
            }
        }

        Collections.shuffle(pokeBox);

        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < pokeBox.size(); i++) {
            String pai = pokeBox.get(i);
            if(i>=51){
                dipai.add(pai);
            }else if(i%3==0){
                play1.add(pai);
            }else if(i%3==1){
                play2.add(pai);
            }else {
                play3.add(pai);
            }

        }
        System.out.println("玩家1："+play1);
        System.out.println("玩家2："+play2);
        System.out.println("玩家3："+play3);
        System.out.println("底牌:"+dipai);
    }
}
