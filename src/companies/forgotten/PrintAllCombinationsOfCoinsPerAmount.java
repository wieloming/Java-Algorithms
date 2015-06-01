package companies.forgotten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class PrintAllCombinationsOfCoinsPerAmount {
    public void count(ArrayList<Integer> coins, int amount) {
        count(coins, amount, new ArrayList<>());
    }

    private void count(ArrayList<Integer> coins, int amount, ArrayList<Integer> coinsUsed) {
        Collections.sort(coins, (x, y) -> y-x);
        if (amount == 0) {
            System.out.println(coinsUsed);
        } else if (amount > 0) {
            for (int coin : coins) {
                ArrayList<Integer> newCoinsUsed = new ArrayList<>();
                newCoinsUsed.addAll(coinsUsed);
                newCoinsUsed.add(coin);
                ArrayList<Integer> newCoins = coins.stream().filter(x -> x <= coin).collect(Collectors.toCollection(ArrayList::new));
                int newAmount = amount - coin;
                count(newCoins, newAmount, newCoinsUsed);
            }
        }
    }

}
