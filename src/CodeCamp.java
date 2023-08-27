//  CodeCamp.java - CS314 Assignment 1

/*  Student information for assignment:
 *
 *  replace <NAME> with your name.
 *
 *  On my honor, Tiana Thomas, this programming assignment is my own work
 *  and I have not provided this code to any other student.
 *
 *  Name: Tiana Thomas
 *  email address: tianathomas@utexas.edu
 *  UTEID: tt27847
 *  Section 5 digit ID: 52650
 *  Grader name:
 *  Number of slip days used on this assignment: 0
 */

import java.util.Random;

public class CodeCamp {
    /**
     * Determine the Hamming distance between two arrays of ints.
     * Neither the parameter <tt>aData</tt> or
     * <tt>bData</tt> are altered as a result of this method.<br>
     *
     * @param aData != null, aData.length == aData.length
     * @param bData != null
     * @return the Hamming Distance between the two arrays of ints.
     */
    public static int hammingDistance(int[] aData, int[] bData) {
        // check preconditions
        if (aData == null || bData == null || aData.length != bData.length) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "hammingDistance. neither parameter may equal null, arrays" +
                    " must be equal length.");
        }

        int distance = 0;
        for (int i = 0; i < aData.length; i++) {
            if (aData[i] != bData[i]) {
                distance++;
            }
        }
        return distance;
    }

    /**
     * Determine if one array of ints is a permutation of another.
     * Neither the parameter <tt>aData</tt> or
     * the parameter <tt>bData</tt> are altered as a result of this method.<br>
     *
     * @param aData != null
     * @param bData != null
     * @return <tt>true</tt> if aData is a permutation of bData,
     * <tt>false</tt> otherwise
     */
    public static boolean isPermutation(int[] aData, int[] bData) {
        // check preconditions
        if (aData == null || bData == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isPermutation. neither parameter may equal null.");
        }

        if (aData.length != bData.length) {
            return false;
        }

        for (int val : aData) {
            if (frequencyOfNumber(val, aData) != frequencyOfNumber(val, bData)) {
                return false;
            }
        }
        return true;
    }
    private static int frequencyOfNumber(int num, int[] array) {
        int frequency = 0;
        for (int val : array) {
            if (val == num) {
                frequency++;
            }
        }
        return frequency;
    }

    /**
     * Determine the index of the String that
     * has the largest number of vowels.
     * Vowels are defined as <tt>'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o',
     * 'U', and 'u'</tt>.
     * The parameter <tt>arrayOfStrings</tt> is not altered as a result of this method.
     * <p>pre: <tt>arrayOfStrings != null</tt>, <tt>arrayOfStrings.length > 0</tt>,
     * there is an least 1 non null element in arrayOfStrings.
     * <p>post: return the index of the non-null element in arrayOfStrings that has the
     * largest number of characters that are vowels.
     * If there is a tie return the index closest to zero.
     * The empty String, "", has zero vowels.
     * It is possible for the maximum number of vowels to be 0.<br>
     *
     * @param arrayOfStrings the array to check
     * @return the index of the non-null element in arrayOfStrings that has
     * the largest number of vowels.
     */
    public static int mostVowels(String[] arrayOfStrings) {
        // check preconditions
        if (arrayOfStrings == null || arrayOfStrings.length == 0
                || !atLeastOneNonNull(arrayOfStrings)) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "mostVowels. parameter may not equal null and must contain " +
                    "at least one none null value.");
        }

        int index = 0;
        //finds the first non-null element
        for (int i = 0; i < arrayOfStrings.length; i++) {
            if (arrayOfStrings[i] != null) {
                index = i;
                i = arrayOfStrings.length;
            }
        }

        for (int i = index + 1; i < arrayOfStrings.length; i++) {
            if (arrayOfStrings[i] == null) {
                //checks if last element is null
                if (arrayOfStrings.length == i + 1) {
                    return index;
                }
                i++; //if element in the middle is null, move to the next String
            }
            if (numOfVowels(arrayOfStrings[i]) > numOfVowels(arrayOfStrings[index])) {
                index = i;
            }
        }
        return index;
    }
    private static int numOfVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String x = s.substring(i, i + 1);
            if (x.equalsIgnoreCase("a") || x.equalsIgnoreCase("e") ||
                    x.equalsIgnoreCase("i") || x.equalsIgnoreCase("o") ||
                    x.equalsIgnoreCase("u")) {
                count++;
            }
        }
        return count;
    }

    /**
     * Perform an experiment simulating the birthday problem.
     * Pick random birthdays for the given number of people.
     * Return the number of pairs of people that share the same birthday.<br>
     *
     * @param numPeople     The number of people in the experiment.
     *                      This value must be > 0
     * @param numDaysInYear The number of days in the year for this experiement.
     *                      This value must be > 0
     * @return The number of pairs of people that share a birthday after running the simulation.
     */
    public static int sharedBirthdays(int numPeople, int numDaysInYear) {
        // check preconditions
        if (numPeople <= 0 || numDaysInYear <= 0) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "sharedBirthdays. both parameters must be greater than 0. " +
                    "numPeople: " + numPeople + ", numDaysInYear: " + numDaysInYear);
        }

        int[] bdays = new int[numPeople];
        for (int i = 0; i < bdays.length; i++) {
            bdays[i] = (int) (Math.random() * numDaysInYear);
        }
        int count = 0;
        for (int i = 0; i < bdays.length; i++) {
            for (int j = i + 1; j < bdays.length; j++) {
                if (bdays[i] == bdays[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Determine if the chess board represented by board is a safe set up.
     * <p>pre: board != null, board.length > 0, board is a square matrix.
     * (In other words all rows in board have board.length columns.),
     * all elements of board == 'q' or '.'. 'q's represent queens, '.'s
     * represent open spaces.<br>
     * <p>post: return true if the configuration of board is safe,
     * that is no queen can attack any other queen on the board.
     * false otherwise.
     * the parameter <tt>board</tt> is not altered as a result of
     * this method.<br>
     *
     * @param board the chessboard
     * @return true if the configuration of board is safe,
     * that is no queen can attack any other queen on the board.
     * false otherwise.
     */
    public static boolean queensAreSafe(char[][] board) {
        char[] validChars = {'q', '.'};
        // check preconditions
        if (board == null || board.length == 0 || !isSquare(board)
                || !onlyContains(board, validChars)) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "queensAreSafe. The board may not be null, must be square, " +
                    "and may only contain 'q's and '.'s");
        }

        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                if(board[row][col] == 'q') {
                    //check row to the right
                    for(int c = col + 1; c < board[0].length; c++) {
                        if(board[row][c] == 'q') {
                            return false;
                        }
                    }
                    //check down the column
                    for(int r = row + 1; r < board.length; r++) {
                        if(board[r][col] == 'q') {
                            return false;
                        }
                    }
                    //check lower left diagonal
                    for (int r = row + 1, c = col - 1; r < board.length && c >= 0; r++, c--) {
                        if (board[r][c] == 'q') {
                            return false;
                        }
                    }
                    //check lower right diagonal
                    for (int r = row + 1, c = col + 1; r < board.length && c < board.length;
                         r++, c++) {
                        if (board[r][c] == 'q') {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /**
     * Given a 2D array of ints return the value of the
     * most valuable contiguous sub rectangle in the 2D array.
     * The sub rectangle must be at least 1 by 1.
     * <p>pre: <tt>mat != null, mat.length > 0, mat[0].length > 0,
     * mat</tt> is a rectangular matrix.
     * <p>post: return the value of the most valuable contiguous sub rectangle
     * in <tt>city</tt>.<br>
     *
     * @param city The 2D array of ints representing the value of
     *             each block in a portion of a city.
     * @return return the value of the most valuable contiguous sub rectangle
     * in <tt>city</tt>.
     */
    public static int getValueOfMostValuablePlot(int[][] city) {
        // check preconditions
        if (city == null || city.length == 0 || city[0].length == 0
                || !isRectangular(city)) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "getValueOfMostValuablePlot. The parameter may not be null," +
                    " must value at least one row and at least" +
                    " one column, and must be rectangular.");
        }

        int max = city[0][0];
        //generates top left corners of subplots
        for (int top = 0; top < city.length; top++) {
            for (int left = 0; left < city[0].length; left++) {
                //generates ending points for each top left corner
                for (int bottom = top; bottom < city.length; bottom++) {
                    for (int right = left; right < city[0].length; right++) {
                        int sum = sumOfSubplot(city, top, left, bottom, right);
                        if (sum > max) {
                            max = sum;
                        }
                    }
                }
            }
        }
        return max;
    }
    private static int sumOfSubplot(int[][] city, int top, int left, int bottom, int right) {
        int sum = 0;
        for (int i = top; i <= bottom; i++) {
            for (int j = left; j <= right; j++) {
                sum += city[i][j];
            }
        }
        return sum;
    }

    // !!!!! ***** !!!!! ***** !!!!! ****** !!!!! ****** !!!!! ****** !!!!!!
    // CS314 STUDENTS: Put your birthday problem experiment code here:
    public static int experimentOne() {
        int numOfPairs = 0;
        for (int i = 0; i < 1000000; i++) {
            numOfPairs += sharedBirthdays(182, 365);
        }
        return numOfPairs / 1000000;
    }
    public static void experimentTwo() {
        for (int people = 2; people < 101; people++) {
            double num = 0;
            for (int runs = 0; runs < 50000; runs++) {
                if (sharedBirthdays(people, 365) >= 1) {
                    num++;
                }
            }
            String percent = String.format("%.2f", (num / 50000) * 100);
            System.out.println("Num of people: " + people + ", number of experiments with one or " +
                    "more shared birthday: " + (int) num + ", percentage: " + percent);
        }
    }

    /*
     * pre: arrayOfStrings != null
     * post: return true if at least one element in arrayOfStrings is
     * not null, otherwise return false.
     */
    private static boolean atLeastOneNonNull(String[] arrayOfStrings) {
        // check precondition
        if (arrayOfStrings == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "atLeastOneNonNull. parameter may not equal null.");
        }
        boolean foundNonNull = false;
        int i = 0;
        while (!foundNonNull && i < arrayOfStrings.length) {
            foundNonNull = arrayOfStrings[i] != null;
            i++;
        }
        return foundNonNull;
    }

    /*
     * pre: mat != null
     * post: return true if mat is a square matrix, false otherwise
     */
    private static boolean isSquare(char[][] mat) {
        if (mat == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isSquare. Parameter may not be null.");
        }
        final int numRows = mat.length;
        int row = 0;
        boolean isSquare = true;
        while (isSquare && row < numRows) {
            isSquare = (mat[row] != null) && (mat[row].length == numRows);
            row++;
        }
        return isSquare;
    }

    /*
     * pre: mat != null, valid != null
     * post: return true if all elements in mat are one of the
     * characters in valid
     */
    private static boolean onlyContains(char[][] mat, char[] valid) {
        // check preconditions
        if (mat == null || valid == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "onlyContains. Parameters may not be null.");
        }
        String validChars = new String(valid);
        int row = 0;
        boolean onlyContainsValidChars = true;
        while (onlyContainsValidChars && row < mat.length) {
            int col = 0;
            while (onlyContainsValidChars && col < mat[row].length) {
                int indexOfChar = validChars.indexOf(mat[row][col]);
                onlyContainsValidChars = indexOfChar != -1;
                col++;
            }
            row++;
        }
        return onlyContainsValidChars;
    }

    /*
     * pre: mat != null, mat.length > 0
     * post: return true if mat is rectangular
     */
    private static boolean isRectangular(int[][] mat) {
        // check preconditions
        if (mat == null || mat.length == 0) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isRectangular. Parameter may not be null and must contain" +
                    " at least one row.");
        }
        boolean correct = mat[0] != null;
        int row = 0;
        while (correct && row < mat.length) {
            correct = (mat[row] != null)
                    && (mat[row].length == mat[0].length);
            row++;
        }
        return correct;
    }

    // make constructor private so no instances of CodeCamp can not be created
    private CodeCamp() {

    }

}
