package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class LoggerImp implements Logger{

    private static final String FILE_NAME ="Logs.txt";

     public void logString(String string)
    {
        try {

            BufferedWriter out = new BufferedWriter(new FileWriter(FILE_NAME, true));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm");
            out.write(getLongLine(string));
            out.close();
        }
        catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }

    private String getLongLine(String  string){
         return now().toString()+ " " + string + "\n";
    }

    private LocalDateTime now() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm");
        LocalDateTime date = LocalDateTime.now();
        String text = date.format(formatter);
        return LocalDateTime.parse(text, formatter);
    }
}
