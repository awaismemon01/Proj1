import java.io.*;


public class SomeTopics {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        int sum=0;

        System.out.println("Enter a number, 0 to quit: ");
        do {
            str= br.readLine();
            try {
                i= Integer.parseInt(str);
            }
            catch (NumberFormatException e){
                System.out.println("Invalid Format");
                i=0;
            }
            sum+=i;
            System.out.println("Current sum is : "+sum);

        }while (i != 0);
        try {


            Process p1=Runtime.getRuntime().exec("notepad.exe");
            System.out.println(p1.isAlive());



            p1.destroy();
            System.out.println(p1.isAlive());
        }catch (Exception e){
            System.out.println("Exception Occurred");
        }
        long start = System.nanoTime(); // get starting time
        for(long l=0; l < 100000000L; l++) ;
        long end = System.nanoTime(); // get ending time

        System.out.println("Elapsed time : "+(end-start));
    }

}
