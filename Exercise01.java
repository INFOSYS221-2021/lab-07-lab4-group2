public class ExerciseOne {
    public static void main(String args[]) {
      ExerciseOne ex01 = new ExerciseOne();
      
      String word = "redorangeyellowgreen";

      System.out.println(word + " to uppercase is " + ex01.stringToUppercase(word));
      System.out.println("The length of " + word + " is " + ex01.wordLength(word));
      System.out.println("The index of yellow in " + word + " is " + ex01.stringIndexOf("yellow", word));
      System.out.println("The word combo is " + ex01.wordCombo(word));
      System.out.println("The number of \'e\' in " + word + " is " + ex01.freqOfLetterInString('e', word));
      
    }
    
    // Complete this method to return the word in all uppercase
    private String stringToUppercase(String word) {
        int ll = word.length();
        int i = 0;
        String zzz ="";
        while(i < ll){
            char ch = word.charAt(i);
            if(ch <= 122 && ch >= 97){  
            ch -= 32;
            zzz += ch;
        }
        i ++;
        }
        return zzz;
    }
    
    // Complete this method to return the length of the word
    private int wordLength(String word) {
        int k = word.length();
        return k;
    }
    
    // Complete this method to return the index of 
    // the specified substring in the given word
    private int stringIndexOf(String subStr, String word) {
        
        return word.indexOf(subStr);
    }
    
    // Complete this method to return a combination of 
    // the first three letters and the last four letters of the given word.
    // E.g. given the word "redorangeyellowgreen", "redgreen" should be returned
    private String wordCombo(String word) {
        String rrr = "";
        rrr += word.substring(0, 3);
        rrr += word.substring(word.length()-5);
        return rrr;
    }
    
    // Complete this method to return the frequencey of 
    // the specified letter in the given word. If the specified letter is not 
    // in the given word, then return -1.
    // E.g. given the word "redorangeyellowgreen",
    // the frequency of 'e' in the word is 5
    private int freqOfLetterInString(char letter, String word) {
        int freq = 0;
        
        // go throuch each character in word
        // if the character is the same as the given letter,
        // then add 1 to freq
        if (word.contains(letter)) {
            for(int iii = 0; iii < word.length(); iii++){
                String aaa = word.charAt(iii);
                if(aaa = letter){
                    freq++;
                } else{
                return -1;
                    }
                }}

        return freq;    }}
