 // ========================
//       Information
// ========================

// Name: Java Regex 2 - Duplicate Words HackerRank Problem
// Direct Link: https://www.hackerrank.com/challenges/duplicate-word/problem
// Difficulty: Medium
// Max Score: 25
// Cutoff Score: 12.50
// Language: Java 8

// ========================
//         Solution Start
// ========================

// Java Regex 2 - Duplicate Words - Hacker Rank Solution Start

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class main {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        int numSentences = Integer.parseInt(input1);
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}

// Java Regex 2 - Duplicate Words - Hacker Rank Solution END
// MyEduWaves