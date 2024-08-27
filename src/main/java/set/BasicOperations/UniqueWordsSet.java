package main.java.set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsSet {
    Set<String> uniqueWordsSet;

    public UniqueWordsSet(){
        uniqueWordsSet = new HashSet<>();
    }

    public void addWord(String word){
        if(uniqueWordsSet.contains(word)) System.out.println("Word '" + word + "' is already in the set.");
        else uniqueWordsSet.add(word);
    }

    public void removeWord(String word){
        if(!uniqueWordsSet.contains(word)) throw new RuntimeException("There is no word '" + word + "' in the set");
        else uniqueWordsSet.remove(word);
    }

    public void verifyWordsPresence(String word){
        if(!uniqueWordsSet.contains(word)) throw new RuntimeException("The word '" + word + "' in the set");
        else System.out.println("The word '" + word + "' is in the set");
    }

    public void showUniqueWords(){
        System.out.println(uniqueWordsSet);
    }

    public Set<String> getUniqueWordsSet() {
        return uniqueWordsSet;
    }

    public void setUniqueWordsSet(Set<String> uniqueWordsSet) {
        this.uniqueWordsSet = uniqueWordsSet;
    }

    public static void main(String[] args) {
        UniqueWordsSet set = new UniqueWordsSet();

        try {
            set.removeWord("Horse");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        set.addWord("Horse");
        set.addWord("House");
        set.addWord("Home");
        set.addWord("Honey");
        set.addWord("Hell");
        set.addWord("Hint");
        set.addWord("Honk");
        set.addWord("Huge");

        try {
            set.removeWord("Horse");
            set.verifyWordsPresence("Huge");
            set.showUniqueWords();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
