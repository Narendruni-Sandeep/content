
import java.io.*;
public class RandomAccessFileDemo{
    public static void main(String args[]) {

        String data = "NKXGEN Java Code"; 
		 String file="random.txt";

        writeToRandomAccessFile(file, 50, data);
        System.out.println("String written into RandomAccessFile: " + data);

        String fromFile = readFromRandomAccessFile(file, 50);
        System.out.println("String read from RandomAccessFile : " + fromFile);
    }

    public static String readFromRandomAccessFile(String file, int position) {
        String record = null;
        try {
            RandomAccessFile fileStore = new RandomAccessFile(file, "rw");
            // moves file pointer to position specified
            fileStore.seek(position);
            // reading String from RandomAccessFile
            record = fileStore.readUTF();
            fileStore.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return record;
    }
 
    public static void writeToRandomAccessFile(String file, int position, String record) {
        try {
            RandomAccessFile fileStore = new RandomAccessFile(file, "rw");
            // moves file pointer to position specified
            fileStore.seek(position);
            // writing String to RandomAccessFile
            fileStore.writeUTF(record);
            fileStore.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}