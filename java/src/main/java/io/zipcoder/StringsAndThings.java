package io.zipcoder;

public class StringsAndThings {
        public static void main(String[] args) {}

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it.
     */
    public Integer countYZ(String input) {
        input = input.toLowerCase();
        int count = 0;
        
        
        if ((input == null) || input.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < input.length(); i++) {
            char Char = input.charAt(i);
            if (Char == 'y' || Char == 'z') {
                if (i==input.length() - 1 || !Character.isLetter(input.charAt(i + 1))) {
                    count++;
                }
            }
        }
        return count;
    }



  /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). Remove only non-overlapping instances.
     */
    public String removeString(String base, String remove) {
        String lowBase = base.toLowerCase();
        String lowerRemove = remove.toLowerCase();
        StringBuilder result = new StringBuilder();


        if (base == null || remove == null || remove.isEmpty()) {
            return base;
        }

        
        int i = 0 ; 
        while (i < base.length()) {
            if (i <= base.length() - remove.length() &&
                lowBase.substring(i, i + remove.length()).equals(lowerRemove)) {
                i += remove.length(); 
            } else {
                result.append(base.charAt(i));
                i++;
            }
        }
        return result.toString();
    }



     /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     */
     public Boolean containsEqualNumberOfIsAndNot(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }

        int countIs = 0;
        for (int i = 0; i <= input.length() - 2; i++) {
            if (input.substring(i, i + 2).equals("is")) {
                countIs++;
            }
        }

        int countNot = 0;
        for (int i = 0; i <= input.length() - 3; i++) {
            if (input.substring(i, i + 3).equals("not")) {
                countNot++;
            }
        }
        return countIs == countNot;
     }



   /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     */
   public Boolean gIsHappy(String input) {
    if (input == null || input.isEmpty()) {
        return true;
    }

    for (int i = 0; i < input.length(); i++) {
        if (input.charAt(i) == 'g') {
            boolean left = (i > 0 && input.charAt(i - 1) == 'g');
            boolean right = (i < input.length() - 1 && input.charAt(i + 1) == 'g');
            

            if (!left && !right) {
                return false;
            }
        }
    }
    return true;
}



    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     */
    public Integer countTriple(String input) {
        if (input == null || input.length() < 3) {
            return 0;
        }


        int count = 0;
        for (int i = 0; i < input.length() - 2; i++) {
            char c = input.charAt(i);
            if (c == input.charAt(i + 1) && c == input.charAt(i + 2)) {
                count++;
            }
        }
        return count;
    }

}


