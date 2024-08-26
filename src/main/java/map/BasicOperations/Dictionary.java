package main.java.map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    Map<String, String> dictionary;

    public Dictionary(){
        dictionary = new HashMap<String,String>();
    }

    public void addWord(String word, String definition){
        dictionary.put(word, definition);
    }

    public void removeWord(String word){
        if(!dictionary.containsKey(word)) System.out.println("The word '" + word + "' is not in the dictionary!");
        else dictionary.remove(word);
    }

    public void showWords(){
        System.out.println(dictionary.keySet());
    }

    public void searchByWord(String word){
        if(!dictionary.containsKey(word)) System.out.println("The word '" + word + "' is not in the dictionary!");
        else System.out.println(word + ": " + dictionary.get(word));
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }
}
