package staticmember;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class AppLog {

    private static PrintWriter pw;

    private void openLogFile() throws Exception {
        
        if (pw == null) {
            System.out.println("Otvaram dnevnik");
            FileOutputStream fos = new FileOutputStream("app.log", true);
            pw = new PrintWriter(fos);
        }

    }

    private void closeLogFile() {
        
        if (pw != null) {
            System.out.println("Zatvaram dnevnik");
            pw.close();
        }
    }

    public void write(int errorCode, String errorMessage) throws Exception {
        System.out.println("Upisivanje u dnevnik");
        String record = System.currentTimeMillis() + "\t"
                + String.format("%010d", errorCode)+"\t"
                + errorMessage;

        openLogFile();
        pw.println(record);
        pw.flush();
       // closeLogFile();
    }

}
