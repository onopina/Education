package io_nio_29_30.io.io_1_8;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 8.	Дан файл со словами (создать вручную). Создать три новых файла, которые содержат (по отдельности):
 * •	Слова, начинающиеся с большой буквы;
 * •	5-символьные слова;
 * •	Слова, которые не содержат цифры и заглавную букву.
 */
public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\io_nio\\io\\io_1_8\\Words.txt"))){
            String line;
            while ((line = br.readLine()) != null) {

                Pattern pattern1 = Pattern.compile("\\b[A-Z]\\w+\\b");
                Matcher matcher1 = pattern1.matcher(line);
                while (matcher1.find()){
                    writeFile(matcher1.group(), "File1");
                }

                Pattern pattern2 = Pattern.compile("\\b\\w{5}\\b");
                Matcher matcher2 = pattern2.matcher(line);
                while (matcher2.find()){
                    writeFile(matcher2.group(), "File2");
                }

                Pattern pattern3 = Pattern.compile("\\b[a-z]+\\b");
                Matcher matcher3 = pattern3.matcher(line);
                while (matcher3.find()){
                    writeFile(matcher3.group(), "File3");
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeFile(String word, String name) throws IOException {
        FileWriter fw = null;

        switch (name) {
            case "File1" ->
                    fw = new FileWriter("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\io_nio\\io\\io_1_8\\File1.txt", true);
            case "File2" ->
                    fw = new FileWriter("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\io_nio\\io\\io_1_8\\File2.txt", true);
            case "File3" ->
                    fw = new FileWriter("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\io_nio\\io\\io_1_8\\File3.txt", true);
            default -> System.out.println("This is an incorrect name of file");
        }

        try (BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(word);
            bw.write(' ');
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
