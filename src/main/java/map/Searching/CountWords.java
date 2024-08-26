package main.java.map.Searching;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    Map<String, Integer> wordCounter;

    public CountWords(){
        wordCounter = new HashMap<>();
    }

    public void addWord(String word){
        if(wordCounter.containsKey(word)){
            int quantity = wordCounter.get(word);
            wordCounter.put(word, quantity + 1);
        }else wordCounter.put(word, 1);
    }

    public void removeWord(String word){
        if(!wordCounter.isEmpty()) wordCounter.remove(word);
        else System.out.println("The word '" + word + "' is not in the list");
    }

    public void showWordsCount(){
        System.out.println(wordCounter);
    }

    public String getMostFrequentWord(){
        String mostFrequentWord = null;

        int quantity = 0;

        for(Map.Entry<String, Integer> entry: wordCounter.entrySet()){
            if(entry.getValue() > quantity){
                quantity = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        return mostFrequentWord;
    }

    public Map<String, Integer> getWordCounter() {
        return wordCounter;
    }

    public void setWordCounter(Map<String, Integer> wordCounter) {
        this.wordCounter = wordCounter;
    }
}
