public class Main {
    public static void main(String[] args) {
      ComputerScienceDictionary dictionary = new ComputerScienceDictionary();
      
      dictionary.addWord("algorithm", "A set of rules to be followed in calculations or other problem-solving operations.");
      dictionary.addWord("binary", "A system of numerical notation to the base 2 used in computers.");
      
      System.out.println("Definition of algorithm: " + dictionary.getDefinition("algorithm"));
      System.out.println("Definition of binary: " + dictionary.getDefinition("binary"));
  }
  }