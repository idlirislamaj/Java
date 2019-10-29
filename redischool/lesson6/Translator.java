package redischool.lesson6;

import java.util.HashMap;
import java.util.Map;

public class Translator {
    Map<String, String> translationMap = new HashMap<>();

   public Translator(){
        translationMap.put("Happy","Felice");
        translationMap.put("World","Mondo");
        translationMap.put("Sky","Cielo");
        translationMap.put("Sea","Mare");
        translationMap.put("Sun","Sole");
    }

    public void addTranslation(String word, String translation){
        translationMap.put(word,translation);
    }

    String translate(String word){
       String translatedword ="";

        for (String keyWord: translationMap.keySet()) {
            if (word.equalsIgnoreCase(keyWord)){
                translatedword = translationMap.get(keyWord);
            }
        }
        return translatedword;
    }

}
