import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// CodeCamp.java - CS314 Assignment 1 - Tester class

/*
 * Student information for assignment:
 * Name: Tiana Thomas
 * email address: tianathomas@utexas.edu
 * UTEID: tt27847
 * Section 5 digit ID: 52650
 * Grader name:
 * Number of slip days used on this assignment: 0
 */

/*
 * 45 is the average number of pairs of people with shared birthdays in 1,000,000 experiments with
 * 365 days per year and 182 people per experiment.
 * 23 people are required in order to have a 50% chance of there being at least 1 shared
 * birthday, given a 365 day year. My prediction for this was 30 people.

Num of people: 2, number of experiments with one or more shared birthday: 130, percentage: 0.26
Num of people: 3, number of experiments with one or more shared birthday: 410, percentage: 0.82
Num of people: 4, number of experiments with one or more shared birthday: 788, percentage: 1.58
Num of people: 5, number of experiments with one or more shared birthday: 1361, percentage: 2.72
Num of people: 6, number of experiments with one or more shared birthday: 2067, percentage: 4.13
Num of people: 7, number of experiments with one or more shared birthday: 2759, percentage: 5.52
Num of people: 8, number of experiments with one or more shared birthday: 3701, percentage: 7.40
Num of people: 9, number of experiments with one or more shared birthday: 4633, percentage: 9.27
Num of people: 10, number of experiments with one or more shared birthday: 5990, percentage: 11.98
Num of people: 11, number of experiments with one or more shared birthday: 7059, percentage: 14.12
Num of people: 12, number of experiments with one or more shared birthday: 8353, percentage: 16.71
Num of people: 13, number of experiments with one or more shared birthday: 9604, percentage: 19.21
Num of people: 14, number of experiments with one or more shared birthday: 10965, percentage: 21.93
Num of people: 15, number of experiments with one or more shared birthday: 12767, percentage: 25.53
Num of people: 16, number of experiments with one or more shared birthday: 14209, percentage: 28.42
Num of people: 17, number of experiments with one or more shared birthday: 15768, percentage: 31.54
Num of people: 18, number of experiments with one or more shared birthday: 17317, percentage: 34.63
Num of people: 19, number of experiments with one or more shared birthday: 18907, percentage: 37.81
Num of people: 20, number of experiments with one or more shared birthday: 20550, percentage: 41.10
Num of people: 21, number of experiments with one or more shared birthday: 22255, percentage: 44.51
Num of people: 22, number of experiments with one or more shared birthday: 23565, percentage: 47.13
Num of people: 23, number of experiments with one or more shared birthday: 25337, percentage: 50.67
Num of people: 24, number of experiments with one or more shared birthday: 26947, percentage: 53.89
Num of people: 25, number of experiments with one or more shared birthday: 28328, percentage: 56.66
Num of people: 26, number of experiments with one or more shared birthday: 29829, percentage: 59.66
Num of people: 27, number of experiments with one or more shared birthday: 31169, percentage: 62.34
Num of people: 28, number of experiments with one or more shared birthday: 32811, percentage: 65.62
Num of people: 29, number of experiments with one or more shared birthday: 34067, percentage: 68.13
Num of people: 30, number of experiments with one or more shared birthday: 35349, percentage: 70.70
Num of people: 31, number of experiments with one or more shared birthday: 36462, percentage: 72.92
Num of people: 32, number of experiments with one or more shared birthday: 37713, percentage: 75.43
Num of people: 33, number of experiments with one or more shared birthday: 38797, percentage: 77.59
Num of people: 34, number of experiments with one or more shared birthday: 39685, percentage: 79.37
Num of people: 35, number of experiments with one or more shared birthday: 40725, percentage: 81.45
Num of people: 36, number of experiments with one or more shared birthday: 41627, percentage: 83.25
Num of people: 37, number of experiments with one or more shared birthday: 42405, percentage: 84.81
Num of people: 38, number of experiments with one or more shared birthday: 43135, percentage: 86.27
Num of people: 39, number of experiments with one or more shared birthday: 43959, percentage: 87.92
Num of people: 40, number of experiments with one or more shared birthday: 44527, percentage: 89.05
Num of people: 41, number of experiments with one or more shared birthday: 45082, percentage: 90.16
Num of people: 42, number of experiments with one or more shared birthday: 45775, percentage: 91.55
Num of people: 43, number of experiments with one or more shared birthday: 46213, percentage: 92.43
Num of people: 44, number of experiments with one or more shared birthday: 46631, percentage: 93.26
Num of people: 45, number of experiments with one or more shared birthday: 47079, percentage: 94.16
Num of people: 46, number of experiments with one or more shared birthday: 47426, percentage: 94.85
Num of people: 47, number of experiments with one or more shared birthday: 47708, percentage: 95.42
Num of people: 48, number of experiments with one or more shared birthday: 48033, percentage: 96.07
Num of people: 49, number of experiments with one or more shared birthday: 48281, percentage: 96.56
Num of people: 50, number of experiments with one or more shared birthday: 48502, percentage: 97.00
Num of people: 51, number of experiments with one or more shared birthday: 48710, percentage: 97.42
Num of people: 52, number of experiments with one or more shared birthday: 48949, percentage: 97.90
Num of people: 53, number of experiments with one or more shared birthday: 49069, percentage: 98.14
Num of people: 54, number of experiments with one or more shared birthday: 49187, percentage: 98.37
Num of people: 55, number of experiments with one or more shared birthday: 49320, percentage: 98.64
Num of people: 56, number of experiments with one or more shared birthday: 49410, percentage: 98.82
Num of people: 57, number of experiments with one or more shared birthday: 49494, percentage: 98.99
Num of people: 58, number of experiments with one or more shared birthday: 49547, percentage: 99.09
Num of people: 59, number of experiments with one or more shared birthday: 49668, percentage: 99.34
Num of people: 60, number of experiments with one or more shared birthday: 49713, percentage: 99.43
Num of people: 61, number of experiments with one or more shared birthday: 49761, percentage: 99.52
Num of people: 62, number of experiments with one or more shared birthday: 49817, percentage: 99.63
Num of people: 63, number of experiments with one or more shared birthday: 49845, percentage: 99.69
Num of people: 64, number of experiments with one or more shared birthday: 49861, percentage: 99.72
Num of people: 65, number of experiments with one or more shared birthday: 49884, percentage: 99.77
Num of people: 66, number of experiments with one or more shared birthday: 49903, percentage: 99.81
Num of people: 67, number of experiments with one or more shared birthday: 49912, percentage: 99.82
Num of people: 68, number of experiments with one or more shared birthday: 49931, percentage: 99.86
Num of people: 69, number of experiments with one or more shared birthday: 49955, percentage: 99.91
Num of people: 70, number of experiments with one or more shared birthday: 49957, percentage: 99.91
Num of people: 71, number of experiments with one or more shared birthday: 49953, percentage: 99.91
Num of people: 72, number of experiments with one or more shared birthday: 49972, percentage: 99.94
Num of people: 73, number of experiments with one or more shared birthday: 49980, percentage: 99.96
Num of people: 74, number of experiments with one or more shared birthday: 49982, percentage: 99.96
Num of people: 75, number of experiments with one or more shared birthday: 49987, percentage: 99.97
Num of people: 76, number of experiments with one or more shared birthday: 49991, percentage: 99.98
Num of people: 77, number of experiments with one or more shared birthday: 49990, percentage: 99.98
Num of people: 78, number of experiments with one or more shared birthday: 49996, percentage: 99.99
Num of people: 79, number of experiments with one or more shared birthday: 49997, percentage: 99.99
Num of people: 80, number of experiments with one or more shared birthday: 49997, percentage: 99.99
Num of people: 81, number of experiments with one or more shared birthday: 49998, percentage: 100.00
Num of people: 82, number of experiments with one or more shared birthday: 49998, percentage: 100.00
Num of people: 83, number of experiments with one or more shared birthday: 50000, percentage: 100.00
Num of people: 84, number of experiments with one or more shared birthday: 49999, percentage: 100.00
Num of people: 85, number of experiments with one or more shared birthday: 49999, percentage: 100.00
Num of people: 86, number of experiments with one or more shared birthday: 49999, percentage: 100.00
Num of people: 87, number of experiments with one or more shared birthday: 49996, percentage: 99.99
Num of people: 88, number of experiments with one or more shared birthday: 50000, percentage: 100.00
Num of people: 89, number of experiments with one or more shared birthday: 49999, percentage: 100.00
Num of people: 90, number of experiments with one or more shared birthday: 50000, percentage: 100.00
Num of people: 91, number of experiments with one or more shared birthday: 50000, percentage: 100.00
Num of people: 92, number of experiments with one or more shared birthday: 49999, percentage: 100.00
Num of people: 93, number of experiments with one or more shared birthday: 50000, percentage: 100.00
Num of people: 94, number of experiments with one or more shared birthday: 50000, percentage: 100.00
Num of people: 95, number of experiments with one or more shared birthday: 50000, percentage: 100.00
Num of people: 96, number of experiments with one or more shared birthday: 50000, percentage: 100.00
Num of people: 97, number of experiments with one or more shared birthday: 50000, percentage: 100.00
Num of people: 98, number of experiments with one or more shared birthday: 50000, percentage: 100.00
Num of people: 99, number of experiments with one or more shared birthday: 50000, percentage: 100.00
Num of people: 100, number of experiments with one or more shared birthday: 50000, percentage: 100.00
 */
public class CodeCampTester {
    public static void main(String[] args) {
        final String newline = System.getProperty("line.separator");

        // test 1, hamming distance
        int[] h1 = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        int[] h2 = { 1, 2, 10, 4, 5, 4, 3, -10, 1 };
        int expected = 2;
        int actual = CodeCamp.hammingDistance(h1, h2);
        System.out.println("Test 1 hamming distance: expected value: " + expected
                + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 1, hamming distance");
        } else {
            System.out.println(" ***** FAILED ***** test 1, hamming distance");
        }
        // test 2, hamming distance
        h1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        h2 = new int[] { -6, -6, -6, -6, -6, -6, -6, -6, -6, -6 };
        expected = 10;
        actual = CodeCamp.hammingDistance(h1, h2);
        System.out.println(newline + "Test 2 hamming distance: expected value: " + expected
                + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 2, hamming distance");
        } else {
            System.out.println(" ***** FAILED ***** test 2, hamming distance");
        }
        // test 3, hamming distance
        h1 = new int[500000];
        h2 = new int[500000];
        expected = 0;
        actual = CodeCamp.hammingDistance(h1, h2);
        System.out.println(newline + "Test 3 hamming distance: expected value: " + expected
                + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 3, hamming distance");
        } else {
            System.out.println(" ***** FAILED ***** test 3, hamming distance");
        }

        // test 4, isPermutation
        int[] a = { 1, 2, 3 };
        int[] b = { 2, 1, 3 };
        boolean expectedBool = true;
        boolean actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(newline + "Test 4 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 4, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 4, isPermutation");
        }
        // test 5, is Permutation
        b = new int[] { 2, 1, 3, 3 };
        expectedBool = false;
        actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(newline + "Test 5 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 5, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 5, isPermutation");
        }
        // test 6, is Permutation
        a = new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE, 0, 100000, Integer.MAX_VALUE / 2 };
        b = new int[] { 100000, Integer.MAX_VALUE, Integer.MAX_VALUE / 2, 0, Integer.MIN_VALUE };
        expectedBool = true;
        actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(newline + "Test 6 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 6, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 6, isPermutation");
        }
        // test 7, is Permutation
        a = new int[] { -180997325, 1320698025, 888999820, -829322186, -1307183500, 1361152474,
                -1392440054, -214873900, -1855376901, -1960300168, -1953730082, 425360258,
                1058753183, -677178196, 1984530148, -1942949307, -1635374961, 343505368, 95408596,
                858251297, -1364562317, -582163733, -1883628785, -1285527161, -997097776, 675098870,
                1137740700, -855636981, 889189296, 1637018879, -349690004, -1168073383, -1612354431,
                -2088449515, -1121376283, 2124922217, -815737283, -1660242780, 1619131037,
                1081153522, 1073648075, -956169462, -274405274, -2029240037, 1380457636, -16016534,
                1992992906, -325813896, 487792570, 751182527, 846488663, 1076151604, 1182271636,
                1972603187, -334762275, 1222230665, -46755651, 1178240944, 1189688565, 796259192,
                -1747921057, 1168761527, -17815162, -795578698, -670306006, -231963023, -479546877,
                -677303323, -753986951, -2017800189, 1626756919, -225616125, -431441993, 470194214,
                1553317444, -760637657, 1909682175, -1868246283, -462279192, 527864937, -1333121534,
                512809225, 1088005122, 1205405986, 2123776813, 762490306, 1841971028, -64243115,
                524249355, -707602713, 857997706, -2089897108, -1402438425, -1661232783, 1806052731,
                1988722982, 1135202741, -2064601181, -1855076946, 1367451599 };

        b = new int[] { -17815162, 762490306, 524249355, -2064601181, -670306006, -1285527161,
                2123776813, 1619131037, -2029240037, -2017800189, 527864937, 1073648075,
                -1942949307, 857997706, 796259192, -431441993, 1909682175, -956169462, 751182527,
                -1168073383, -462279192, -760637657, -334762275, -582163733, -1635374961,
                -1612354431, 1168761527, -1953730082, -479546877, -2088449515, -677303323,
                -1660242780, -677178196, -64243115, 1361152474, 1076151604, 675098870, -815737283,
                -180997325, 1135202741, 1222230665, -1121376283, 1189688565, 512809225, -349690004,
                1553317444, 1972603187, -1307183500, 1182271636, -46755651, -1883628785,
                -1661232783, -829322186, 1984530148, 1626756919, 889189296, -855636981, 1992992906,
                1137740700, -1960300168, 1806052731, 343505368, 1367451599, -1402438425, 1178240944,
                -231963023, -795578698, -2089897108, 95408596, 1205405986, -1855376901, 470194214,
                -997097776, -1364562317, 888999820, -325813896, 1637018879, -1855076946, 1081153522,
                1320698025, -16016534, -274405274, 487792570, -1392440054, 1841971028, -1747921057,
                1058753183, 1380457636, 858251297, -214873900, -225616125, 425360258, 1088005122,
                -707602713, 2124922217, -1868246283, -1333121534, 1988722982, 846488663,
                -753986951 };
        expectedBool = true;
        actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(newline + "Test 7 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 7, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 7, isPermutation");
        }
        // test 8, is Permutation
        a = new int[1000];
        b = new int[1000];
        expectedBool = true;
        actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(newline + "Test 8 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 8, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 8, isPermutation");
        }
        // test 9, is Permutation
        a = new int[1000];
        b = new int[1001];
        expectedBool = false;
        actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(newline + "Test 9 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 9, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 9, isPermutation");
        }
        // test 10, is Permutation
        a = new int[1000];
        b = new int[1000];
        expectedBool = true;
        actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(newline + "Test 10 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 10, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 10, isPermutation");
        }
        // test 11, is Permutation
        a = new int[10000];
        b = new int[10000];
        expectedBool = true;
        actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(newline + "Test 11 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 11, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 11, isPermutation");
        }
        // test 12, is Permutation
        a = new int[1000000];
        b = new int[1000001];
        expectedBool = false;
        System.out.println("This test should complete very quickly.");
        actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(newline + "Test 12 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 12, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 12, isPermutation");
        }
        // test 13, is Permutation
        a = new int[] { 2, 2, 2, 3, 3 };
        b = new int[] { 0, -2, 0, 0, 14 };
        expectedBool = false;
        actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(newline + "Test 13 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 13, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 13, isPermutation");
        }
        // test 14, is Permutation
        final int NUM_ELEMENTS = 10000;
        ArrayList<Integer> temp = new ArrayList<>(NUM_ELEMENTS);
        Random r = new Random();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            temp.add(r.nextInt());
        }

        a = intListToArray(temp);
        Collections.shuffle(temp);
        b = intListToArray(temp);

        expectedBool = true;
        actualBool = CodeCamp.isPermutation(a, b);
        System.out.println(newline + "Test 14 isPermutation: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 14, isPermutation");
        } else {
            System.out.println(" ***** FAILED ***** test 14, isPermutation");
        }

        // test 15, mostVowels
        String[] arrayOfStrings = { "aaaaaaa", "aieou" };
        int expectedResult = 0;
        int actualResult = CodeCamp.mostVowels(arrayOfStrings);
        System.out.println(newline + "Test 15 mostVowels: expected result: " + expectedResult
                + ", actual result: " + actualResult);
        if (actualResult == expectedResult) {
            System.out.println("passed test 15, mostVowels");
        } else {
            System.out.println("***** FAILED ***** test 15, mostVowels");
        }
        // test 16, mostVowels
        arrayOfStrings = new String[] { "Staying", null, "", "moo", "SEqUOIA NAtIOnAl FOrEst",
                "!!!!>>+_)(*&^%$#@!>)))???\\///\n\n/n" };
        expectedResult = 4;
        actualResult = CodeCamp.mostVowels(arrayOfStrings);
        System.out.println(newline + "Test 16 mostVowels: expected result: " + expectedResult
                + ", actual result: " + actualResult);
        if (actualResult == expectedResult) {
            System.out.println("passed test 16, mostVowels");
        } else {
            System.out.println("***** FAILED ***** test 16, mostVowels");
        }
        // test 17, mostVowels
        arrayOfStrings = new String[] { null, null, "100,000,000", "XXX", "",
                "!!!!>>+_)(*&^%$#@!>)))???\\///\n\n/n", null };
        expectedResult = 2;
        actualResult = CodeCamp.mostVowels(arrayOfStrings);
        System.out.println(newline + "Test 17 mostVowels: expected result: " + expectedResult
                + ", actual result: " + actualResult);
        if (actualResult == expectedResult) {
            System.out.println("passed test 17, mostVowels");
        } else {
            System.out.println("***** FAILED ***** test 17, mostVowels");
        }
        // test 18 mostVowels
        arrayOfStrings = new String[] { null, null, null, null, "", "", null };
        expectedResult = 4;
        actualResult = CodeCamp.mostVowels(arrayOfStrings);
        System.out.println(newline + "Test 18 mostVowels: expected result: " + expectedResult
                + ", actual result: " + actualResult);
        if (actualResult == expectedResult) {
            System.out.println("passed test 18, mostVowels");
        } else {
            System.out.println("***** FAILED ***** test 18, mostVowels");
        }
        // test 19 mostVowels
        arrayOfStrings = new String[] { "" };
        expectedResult = 0;
        actualResult = CodeCamp.mostVowels(arrayOfStrings);
        System.out.println(newline + "Test 19 mostVowels: expected result: " + expectedResult
                + ", actual result: " + actualResult);
        if (actualResult == expectedResult) {
            System.out.println("passed test 19, mostVowels");
        } else {
            System.out.println("***** FAILED ***** test 19, mostVowels");
        }
        // test 20 mostVowels
        arrayOfStrings = new String[] { null, "AIBA", "" };
        expectedResult = 1;
        actualResult = CodeCamp.mostVowels(arrayOfStrings);
        System.out.println(newline + "Test 20 mostVowels: expected result: " + expectedResult
                + ", actual result: " + actualResult);
        if (actualResult == expectedResult) {
            System.out.println("passed test 20, mostVowels");
        } else {
            System.out.println("***** FAILED ***** test 20, mostVowels");
        }

        // test 21, sharedBirthdays, simple test
        int pairs = CodeCamp.sharedBirthdays(1, 365);
        System.out.println(newline + "Test 21 shared birthdays: expected: 0, actual: " + pairs);
        int expectedShared = 0;
        if (pairs == expectedShared) {
            System.out.println("passed test 21, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 21, shared birthdays");
        }
        // test 22, sharedBirthdays, simple test
        pairs = CodeCamp.sharedBirthdays(366, 365);
        System.out.println(newline + "Test 22 shared birthdays: expected: "
                + "a value of 1 or more, actual: " + pairs);
        if (pairs > 0) {
            System.out.println("passed test 22, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 22, shared birthdays");
        }
        // test 23, sharedBirthdays, simple test
        pairs = CodeCamp.sharedBirthdays(2, 1);
        System.out
                .println(newline + "Test 23 shared birthdays: expected: 1" + ", actual: " + pairs);
        if (pairs == 1) {
            System.out.println("passed test 23, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 23, shared birthdays.");
        }
        // test 24, sharedBirthdays, simple test
        pairs = CodeCamp.sharedBirthdays(3, 1);
        System.out
                .println(newline + "Test 24 shared birthdays: expected: 3" + ", actual: " + pairs);
        if (pairs == 3) {
            System.out.println("passed test 24, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 24, shared birthdays. "
                    + "Expected pairs to be 3. Value returned: " + pairs);
        }
        // test 25, sharedBirthdays, simple test
        pairs = CodeCamp.sharedBirthdays(4, 1);
        System.out
                .println(newline + "Test 25 shared birthdays: expected: 6" + ", actual: " + pairs);
        if (pairs == 6) {
            System.out.println("passed test 25, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 25, shared birthdays. "
                    + "Expected pairs to be 6. Value returned: " + pairs);
        }
        // test 26, sharedBirthdays, simple test
        pairs = CodeCamp.sharedBirthdays(5, 1);
        System.out
                .println(newline + "Test 26 shared birthdays: expected: 10" + ", actual: " + pairs);
        if (pairs == 10) {
            System.out.println("passed test 26, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 26, shared birthdays. "
                    + "Expected pairs to be 10. Value returned: " + pairs);
        }
        // test 27, sharedBirthdays, simple test
        pairs = CodeCamp.sharedBirthdays(100, 1);
        System.out.println(
                newline + "Test 27 shared birthdays: expected: 4950" + ", actual: " + pairs);
        if (pairs == 4950) {
            System.out.println("passed test 27, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 27, shared birthdays. "
                    + "Expected pairs to be 4950. Value returned: " + pairs);
        }
        // test 28, sharedBirthdays, stress test
        pairs = CodeCamp.sharedBirthdays(100000, 100);
        System.out.println(
                newline + "Test 28 shared birthdays - stress test. (Is solution slow?) : expected: > 0"
                        + ", actual: " + pairs);
        if (pairs > 0) {
            System.out.println("passed test 28, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 28, shared birthdays. "
                    + "Expected at least 1 pair. Value returned: " + pairs);
        }
        // test 29, sharedBirthdays, stress test
        pairs = CodeCamp.sharedBirthdays(100000, 100000);
        System.out.println(
                newline + "Test 29 shared birthdays - stress test. (Is solution slow?) : expected: > 0"
                        + ", actual: " + pairs);
        if (pairs > 0) {
            System.out.println("passed test 29, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 29, shared birthdays. "
                    + "Expected at least 1 pair. Value returned: " + pairs);
        }

//        System.out.println("Experiment 1 Results: " + CodeCamp.experimentOne());
//        CodeCamp.experimentTwo();

        // test 30, queensAreASafe
        char[][] board = { { '.', '.', '.' },
                { 'q', '.', '.' },
                { '.', '.', 'q' } };

        expectedBool = true;
        actualBool = CodeCamp.queensAreSafe(board);
        System.out.println(newline + "Test 30 queensAreSafe: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 30, queensAreSafe");
        } else {
            System.out.println(" ***** FAILED ***** test 30, queensAreSafe");
        }
        // test 31, queensAreASafe
        board = new char[][] { { '.', '.', '.', 'q' },
                { '.', '.', '.', '.' },
                { '.', '.', '.', '.' },
                { 'q', '.', '.', '.' } };
        expectedBool = false;
        actualBool = CodeCamp.queensAreSafe(board);
        System.out.println(newline + "Test 31 queensAreSafe: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 31, queensAreSafe");
        } else {
            System.out.println(" ***** FAILED ***** test 31, queensAreSafe");
        }
        // test 32, queensAreASafe
        board = new char[][] { { 'q', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', 'q', '.', '.' },
                { '.', 'q', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', 'q', '.' },
                { '.', '.', 'q', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', 'q' },
                { '.', '.', '.', 'q', '.', '.', '.' } };
        expectedBool = true;
        actualBool = CodeCamp.queensAreSafe(board);
        System.out.println(newline + "Test 32 queensAreSafe: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 32, queensAreSafe");
        } else {
            System.out.println(" ***** FAILED ***** test 32, queensAreSafe");
        }
        // test 33, queensAreASafe
        board = new char[][] {
                { 'q', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', 'q', '.', '.', '.', '.', '.' },
                { '.', 'q', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', 'q', '.', '.', '.', '.' },
                { '.', '.', 'q', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', 'q', '.', '.', '.' },
                { '.', '.', '.', 'q', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', 'q', '.' }, };
        expectedBool = false;
        actualBool = CodeCamp.queensAreSafe(board);
        System.out.println(newline + "Test 33 queensAreSafe: expected value: " + expectedBool
                + ", actual value: " + actualBool);
        if (expectedBool == actualBool) {
            System.out.println(" passed test 33, queensAreSafe");
        } else {
            System.out.println(" ***** FAILED ***** test 33, queensAreSafe");
        }

        // test 34, getValueOfMostValuablePlot
        int[][] city = { { 0, -2, -7, 0, -1 },
                { 9, 2, -6, 2, 0 },
                { -4, 1, -4, 1, 0 },
                { -1, 8, 0, -2, 1 },
                { -10, 1, 1, -5, -6 },
                { -15, -1, 1, 5, 4 } };

        expected = 15;
        actual = CodeCamp.getValueOfMostValuablePlot(city);
        System.out.println(newline + "Test 34 getValueOfMostValuablePlot: expected value: "
                + expected + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 34, getValueOfMostValuablePlot");
        } else {
            System.out.println(" ***** FAILED ***** test 34, getValueOfMostValuablePlot");
        }
        // test 35, getValueOfMostValuablePlot
        city[4][1] = 6;
        expected = 17;
        actual = CodeCamp.getValueOfMostValuablePlot(city);
        System.out.println(newline + "Test 35 getValueOfMostValuablePlot: expected value: "
                + expected + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 35, getValueOfMostValuablePlot");
        } else {
            System.out.println(" ***** FAILED ***** test 35, getValueOfMostValuablePlot");
        }
        // test 36, getValueOfMostValuablePlot
        city = new int[][] { { 1 } };
        expected = 1;
        actual = CodeCamp.getValueOfMostValuablePlot(city);
        System.out.println("\nTest 36 getValueOfMostValuablePlot: expected value: " + expected
                + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 36, getValueOfMostValuablePlot");
        } else {
            System.out.println(" ***** FAILED ***** test 36, getValueOfMostValuablePlot");
        }
        // test 37, getValueOfMostValuablePlot
        city = new int[][] { { 1, 2, 3, 4, 5, 6, 7 } };
        expected = 28;
        actual = CodeCamp.getValueOfMostValuablePlot(city);
        System.out.println(newline + "Test 37 getValueOfMostValuablePlot: expected value: "
                + expected + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 37, getValueOfMostValuablePlot");
        } else {
            System.out.println(" ***** FAILED ***** test 37, getValueOfMostValuablePlot");
        }
        // test 38, getValueOfMostValuablePlot
        city = new int[][] { {-10, -10, -10, -5},
                {-15, -15, -10, -10},
                {-5, -10, -20, -5},
                {-5, -5, -10, -20 }};

        expected = -5;
        actual = CodeCamp.getValueOfMostValuablePlot(city);
        System.out.println("\nTest 38 getValueOfMostValuablePlot: expected value: " + expected
                + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 38, getValueOfMostValuablePlot");
        } else {
            System.out.println(" ***** FAILED ***** test 38, getValueOfMostValuablePlot");
        }
        // test 39, getValueOfMostValuablePlot
         city = new int[100][100];
         Random rand = new Random();
         for (int row = 0; row < city.length; row++) {
             for(int col = 0; col < city[row].length; col++) {
                 city[row][col] = rand.nextInt(200) - 100;
             }
         } actual = CodeCamp.getValueOfMostValuablePlot(city);
         System.out.println("\nTest 39 getValueOfMostValuablePlot: expected value: > 0"
                 + ", actual value: " + actual);
         if( actual > 0 ) {
             System.out.println(" passed test 39, getValueOfMostValuablePlot");
         } else {
             System.out.println(" ***** FAILED ***** test 39, getValueOfMostValuablePlot");
         }

        // DELETE THE ABOVE TESTS IN THE VERSION OF THE FILE YOU TURN IN
        // CS314 Students: add tests here.
    }
    // pre: list != null
    private static int[] intListToArray(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("list parameter may not be null.");
        }
        int[] result = new int[list.size()];
        int arrayIndex = 0;
        for (int x : list) {
            result[arrayIndex++] = x;
        }
        return result;
    }
}