package Exception;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileIOException {

    public static void main(String[] args) {
        FileIOException ioException = new FileIOException();

        String toWrite = "Hello World";
        byte[] bData = toWrite.getBytes(StandardCharsets.UTF_8);

        ioException.writeByte(bData);
        ioException.writeByteTryWithResources(bData);
    }

    // Sample file write
    private void writeByte(byte[] b) {
        // get current path
        String path = System.getProperty("user.dir");

        FileOutputStream out = null;
        File file = new File(path.toString()+"/writeBeforeJDK1_7.txt");
        try{
            out = new FileOutputStream(file, true);
            out.write(b); // Write byte[] in here - (1)
            out.close();  // Close File in here

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        finally {
            // Check whether outputStream is closed or not. - (2)
            if (out !=null){
                try{
                    out.close();
                }
                catch (Exception e ){
                    // Handle Exception
                    e.printStackTrace();
                }
            }
        }

    }

    private void writeByteTryWithResources(byte[] toWrite){
        // get current path
        String path = System.getProperty("user.dir");

        File file = new File(path.toString()+"/writeAfterJDK1_7.txt");
        try(FileOutputStream out = new FileOutputStream(file, true)){
            out.write(toWrite);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }



}
