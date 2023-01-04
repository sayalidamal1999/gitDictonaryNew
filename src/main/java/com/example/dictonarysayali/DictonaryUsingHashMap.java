package com.example.dictonarysayali;

import java.util.HashMap;

public class DictonaryUsingHashMap {
   private HashMap<String, String> dictonary;

    public DictonaryUsingHashMap() {
        this.dictonary = new HashMap<>();
       addWordList();

    }

    public boolean addWord(String word, String meaning){
        try{
            dictonary.put(word,meaning);
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public String getMeaning(String word){
        if(dictonary.containsKey(word)){
            return dictonary.get(word);
        }
        else{
            return"Word does not exists in dictonary!";
        }
    }
    private void addWordList() {
        addWord("ability","capacity,power");
        addWord("absence"," The lack or unavailability of something or someone.");
        addWord("acknowledgement","acceptance of the truth");
        addWord("attention","Noticing or recognizing something of interest");
        addWord("awesome","extremely impressive");
        addWord("beautiful","pretty");
        addWord("care","extra responsibility and attention");
        addWord("concern","something that interests you because it is important");
        addWord("copelled","force to do something");
        addWord("dialogue","A conversation between two or more people");
        addWord("edible"," something suitable to be eaten");
        addWord(" generate","bring into existence");
        addWord("goal","to achieve something");
        addWord(" grant","allow to have");
        addWord("hi","greeting");
        addWord("honesty","loyal");
        addWord(" issue","some situation or event that is thought about");
        addWord("job","a task or piece of work");
        addWord("obligation","responsibility");
        addWord(" policy","a plan of action adopted by an individual or social group");
        addWord("shubh","Auspicious");
        addWord("start","to begin something");
        addWord("stop","to no longer continue");
        addWord("territory","the geographical area under the jurisdiction of a state");
        addWord("undertaking","any piece of work that is attempted");


    }






}
