package string_11.string_11_2;

public class Utils {
    public void splitFilename(String filename){
        int index = filename.indexOf('.');
        String name = filename.substring(0, index);
        String extension = filename.substring(index+1);
        System.out.println(name);
        System.out.println(extension);
    }
}
