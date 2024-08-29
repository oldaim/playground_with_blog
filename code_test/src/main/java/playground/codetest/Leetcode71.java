package playground.codetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class Leetcode71 {

    public static void main(String[] args) {
        Leetcode71 leetcode71 = new Leetcode71();

        String newPath = leetcode71.simplifyPath("/a/./b/../../c/");

        System.out.println(newPath);
    }

    public String simplifyPath(String path) {

        StringBuilder sb = new StringBuilder();

        String[] splitString = path.split("/+");

        for (int i = 0; i < splitString.length; i++) {

            if (Objects.equals(splitString[i], "..")) {
                if (i > 0) splitString[i - 1] = "";
                splitString[i] = "";
            }

            if (Objects.equals(splitString[i], ".")){
                splitString[i] = "";
            }

        }

        for (String string : splitString) {

            if (!Objects.equals(string, "")) {
                sb.append("/");
                sb.append(string);
            }

        }


        path = sb.toString();

        if (path.isEmpty()){
            path = "/";
        }

        return path;
    }
}
