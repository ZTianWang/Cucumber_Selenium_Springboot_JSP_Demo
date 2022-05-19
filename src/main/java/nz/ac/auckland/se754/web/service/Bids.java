package nz.ac.auckland.se754.web.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nz.ac.auckland.se754.web.model.Item;
import org.springframework.stereotype.Service;

@Service
public class Bids {
    private final List<Item> items;
    private final Map<Item,List<String>> bids2user;
    public Bids(){
        items = new ArrayList<>();
        bids2user = new HashMap<>();
        items.add(new Item(1, "Vincent van Gogh - The Starry Night"));
        items.add(new Item(2, "Leonardo Da Vinci - Monna Lisa"));
        items.add(new Item(3, "Salvator Dali - The persistence of the Memory"));
        bids2user.put(items.get(0), Arrays.asList("user1","user2"));
        bids2user.put(items.get(1), Arrays.asList("user1"));
        bids2user.put(items.get(2), Arrays.asList("user2"));
    }

    public List<Item> retrieveBidItems(String user) {
        List<Item> filteredItems = new ArrayList<>();
        for (Item c : items) {
            if (bids2user.containsKey(c)) {
                if(bids2user.get(c).contains(user))
                filteredItems.add(c);
            }
        }
        return filteredItems;
    }
}