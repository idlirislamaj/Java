package redischool.lesson6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Translator {
    Map<String, Set<String>> translationMap = new HashMap<>();


    public void addTranslation(String word, String translation){
       Set<String> translations= translationMap.getOrDefault(word.toLowerCase(), new HashSet<>());
       translations.add(translation.toLowerCase());
       translationMap.put(word, translations);
    }

    Set<String> translate(String word) {
       return translationMap.getOrDefault(word.toLowerCase(), null);
    }


    void removeTranslation(String word, String translation) {
        Set<String> translations = translationMap.get(word);
        if (translations != null) {
            translations.remove(translation);
        }
    }


}
