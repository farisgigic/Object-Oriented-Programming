package Week6.HashMaps;
import java.util.ArrayList;
import java.util.HashMap;
public class Dictionary {


    public class Dictionaryy {
        private HashMap<String, String> map = new HashMap<>();
        private ArrayList<String> wordList = new ArrayList<>();

        public Dictionaryy() {

        }
        public HashMap<String, String> getMap() {
            return this.map;
        }
        public void setMap(HashMap<String, String> map) {
            this.map = map;
        }

        public void add(String word, String translation) {
            this.map.put(word, translation);
        }

        public String getTranslation(String word) {
            if (this.map.containsKey(word)) {
                return this.map.get(word);
            }
            return null;
        }

        public int getAmountOfWords() {
            return this.map.size();
        }

        public ArrayList<String> translationList() {
            ArrayList<String> list = new ArrayList<>();
            for(String key : this.map.keySet()) {
                list.add(key + " = " + map.get(key));
            }
            return list;
        }
    }
}
