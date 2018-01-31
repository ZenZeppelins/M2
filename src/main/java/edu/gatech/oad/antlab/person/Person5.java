 
package edu.gatech.oad.antlab.person;

/*
 *  @version 1.1
 */
public class Person5 {
    /** Holds the persons real name */
    private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
    public Person5(String pname) {
        name = pname;
    }
    /**
     * This method should take the string
     * input and return its characters rotated
     * 2 positions.
     * given "gtg123b" it should return
     * "g123bgt".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private static String calc(String input) {
        String newString = "";
        for (int i = 2; i < input.length(); i++) {
            newString += input.charAt(i);
        }
        for (int j = 0; j < 2; j++) {
            newString += input.charAt(j);
        }
        return newString;
    }

    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the
     *         object
     */
    public String toString(String input) {
        return name + calc(input);
    }
}
