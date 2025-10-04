package baekjoon.Day04;

import java.util.*;
import java.io.*;

public class boj_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (words.contains(str))
                continue;

            words.add(str);
        }

        Collections.sort(words, (o1, o2) -> o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length());

        for (String s : words) {
            System.out.println(s);
        }

        br.close();
    }
}
