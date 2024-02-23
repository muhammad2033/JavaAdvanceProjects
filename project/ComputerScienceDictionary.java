import java.util.HashMap;

interface Dictionary {
  void addWord(String word, String definition);
  String getDefinition(String word);
}

class ComputerScienceDictionary implements Dictionary {
  private HashMap<String, String> dictionary;
  
  public ComputerScienceDictionary() {
    this.dictionary = new HashMap<>();
  }
  
  @Override
  public void addWord(String word, String definition) {
    this.dictionary.put(word, definition);
  }
  
  @Override
  public String getDefinition(String word) {
    return this.dictionary.get(word);
  }
}
