import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Words{
    private HashMap<String, Boolean> words;
    public Words(String fileName){
        words = new HashMap<String, Boolean>();
        String line = "";
        try{
            Scanner scanner = new Scanner(new FileInputStream(new File(fileName)));
            while (scanner.hasNextLine()){
                line = scanner.nextLine();
                words.put(line, true);
            }
        }
        catch (IOException error){
            System.out.println("Failed to construct Words " + error.getMessage());
        }
    }

    public boolean isWord(String word){
        boolean result = true;
        if (words.get(word) == null){
            result = false;
        }
        return result;
    }

    public int getSize(){
        return words.size();
    }
    public String Correction(String value,String misSpelledWord){
        if(value.equals(misSpelledWord)){
            return value;
        }


    }

    public String getReplaceCorrections(String misSpelledWord){
        int len=misSpelledWord.length;
        // String[] arr=misSpelledWord.split(" ");
        // char first=arr[0];
        // char last=arr[arr.length-1];
        ArrayList<String> arr1=new ArrayList<String>();

        for (words.Entry<String, boolean> entry : words.entrySet()) {
            String boolean = entry.Boolean();
            String value=entry.getValue();
            if(value.length==misSpelledWord.length){
                String correctWord=Correction(value,misSpelledWord);
            }

            System.out.println("Key=" + key + ", Value=" + value);
        }


        for(String a:english){
            arr1.add(a);
        }

        return null;

    }
}