package com.kodtodya.practice.regEx;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegExDemo {

    public static void main(String...args){

        // 1. Typical Pattern-Matcher class example
        Pattern pattern = Pattern.compile("[*aa*]");
        Matcher matcher = pattern.matcher("AaaBbb");

        System.out.println("Typical Pattern-Matcher class example result: " + matcher.matches());

        // 2. String.matches() example for hour,minutes and hh sample data
        // hour
        System.out.println("\"1:11\".matches(\"[0-2]?\\d:[0-5]\\d\") : " + "1:11".matches("[0-2]?\\d:[0-5]\\d"));

        // minute
        System.out.println("\"1:00\".matches(\"[0-2]?\\d:[0-5]\\d\") : " + "1:00".matches("[0-2]?\\d:[0-5]\\d"));

        // hh
        System.out.println("\"00:00\".matches(\"[0-2]?\\d:[0-5]\\d\") : " + "00:00".matches("[0-2]?\\d:[0-5]\\d"));

        // 3. String split()
        var cityContainer = "Pune--|--Mumbai--|--Chennai--|--Delhi--|--Kolkata";
        String[] cities = cityContainer.split("--\\|--");
        System.out.println("\nString split() demo:");

        for (String city : cities)
            System.out.println(city);

        // 4. String split("regex", limit)
        String[] citiesSplitLimit = cityContainer.split("--\\|--",3);
        System.out.println("\nString split() limit demo:");

        for (String city : citiesSplitLimit)
            System.out.println(city);


        // 5. String replaceAll("regex", replacement)
        String transformed = cityContainer.replaceAll("--\\|--", "|");

        System.out.println("String replaceAll(\"--\\|--\",\"|\") with regular expression result: " + transformed);

        // 6. String replaceFirst("regex", replacement)
        transformed = cityContainer.replaceFirst("--\\|--", "|");

        System.out.println("String replaceFirst(\"--\\\\|--\", \"|\") : " + transformed);

        // 7. Pattern emails
        var emailPattern = Pattern.compile("[_.\\w]+@([\\w]+\\.)+[\\w]{2,20}");
        System.out.println("\n\nPattern validating emails with the help of emailPattern.asMatchPredicate(): ");
        List<String> emails = new ArrayList<>();

        try (var reader = Files.newBufferedReader(Path.of("emails.txt"))) {
            emails = reader.lines()
                    .filter(emailPattern.asMatchPredicate())
                    .collect(Collectors.toList());
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        emails.forEach(System.out::println);

        System.out.println("\n\n");

        // 8. Capturing groups
        System.out.println("\"gogogogo regex\".matches(\"(go)+\\\\sregex\") : " + "gogogogo regex".matches("(go)+\\sregex"));

        // 9. Word boundary end
        var txt = "catmania thiscat thiscatmania";

        String replaced = txt.replaceAll("cat\\b", "-");

        System.out.println("\"catmania this- thiscatmania\".equals(replaced) : "+"catmania this- thiscatmania".equals(replaced));


        // 10. word boundary beginning
        replaced = txt.replaceAll("\\bcat", "-");

        System.out.println("\"-mania thiscat thiscatmania\" : "+"-mania thiscat thiscatmania".equals(replaced));

        // 11. non word boundary-not beginning
        replaced = txt.replaceAll("\\Bcat", "-");

        System.out.println("\"catmania this- this-mania\" :"+"catmania this- this-mania".equals(replaced));

        // 12. Non word boundary not end
        replaced = txt.replaceAll("cat\\B", "-");

        System.out.println("\"-mania thiscat this-mania\" : " + "-mania thiscat this-mania".equals(replaced));

        // 13. non word boundary neither beginning nor end
        replaced = txt.replaceAll("\\Bcat\\B", "-");

        System.out.println("\"catmania thiscat this-mania\" : " + "catmania thiscat this-mania".equals(replaced));

        // 14. Multiline
        var pattern1 = Pattern.compile("^Michal$");
        var pattern2 = Pattern.compile("\\AMichal\\z");
        var pattern_multiline1 = Pattern.compile("^Michal$", Pattern.MULTILINE);
        var pattern_multiline2 = Pattern.compile("\\AMichal\\z", Pattern.MULTILINE);

        txt = "Michal\nMarcin\nAnia";

        // matches
        System.out.println("pattern1.matcher(txt).matches() :" + pattern1.matcher(txt).matches());
        System.out.println("pattern2.matcher(txt).matches() : "+ pattern2.matcher(txt).matches());
        System.out.println("pattern_multiline1.matcher(txt).matches(): " + pattern_multiline1.matcher(txt).matches());
        System.out.println("pattern_multiline2.matcher(txt).matches() : " + pattern_multiline2.matcher(txt).matches());

        // find
        System.out.println("pattern1.matcher(txt).find(): " + pattern1.matcher(txt).find());
        System.out.println("pattern2.matcher(txt).find(): " + pattern2.matcher(txt).find());
        System.out.println("pattern_multiline1.matcher(txt).find() : " + pattern_multiline1.matcher(txt).find());
        System.out.println("pattern_multiline2.matcher(txt).find() : "+ pattern_multiline2.matcher(txt).find());

    }
}
