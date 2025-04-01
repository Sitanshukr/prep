package com.content.java8questionaries;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**Collectors.Couting() - counts the no. of occurnaces
 * Function.identity() - Makes word itself the key
 * Collectors.groupingby() - group based on input parametes passed
 * maptoObj () - converts IntStream back to char Stream
 * String.chars() - convers char to IntStrem
 *
 */
public class CountOccuranceInString {

    public void countCharteroccurances(String inputString){

        Map<Character , Long> characterOccurance=  inputString.chars()
                .mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        for (Map.Entry<Character, Long> map: characterOccurance.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }

    }

    public void CountWordoccurance(String inputString){
        Map<String , Long> CountWordoccurance= Arrays.stream(inputString.split("\\s+")).collect
                (Collectors.groupingBy(Function.identity(),Collectors.counting()));

        for (Map.Entry<String, Long> map: CountWordoccurance.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }

    public static void main(String[] args) {
        String input = "hello how are you ? hello how are you";
        CountOccuranceInString countOccuranceInString = new CountOccuranceInString();
        countOccuranceInString.countCharteroccurances(input);
        countOccuranceInString.CountWordoccurance(input);
    }
}
