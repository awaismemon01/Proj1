package HandsOnPractice;

import java.io.*;

//

public class InputStreamToString {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = new ByteArrayInputStream("HELLO THERE!".getBytes());
        StringBuilder stringBuilder = new StringBuilder();
        String line;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while ((line = bufferedReader.readLine()) != null){
            stringBuilder.append(line);
        }
        bufferedReader.close();

        System.out.println(stringBuilder);



    }
}
