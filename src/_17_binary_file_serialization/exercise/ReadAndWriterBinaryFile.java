package _17_binary_file_serialization.exercise;

import java.io.*;

public class ReadAndWriterBinaryFile {
    public static void writeBinaryFile(String path, Object obj){
        File file = new File(path);
        FileOutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Object readBinaryFile(String path) throws IOException {
        File file = new File(path);
        ObjectInputStream ois = null;
        Object obj = null;
        try (FileInputStream is = new FileInputStream(file)) {
            if (file.exists()){
                ois = new ObjectInputStream(is);
                obj = ois.readObject();
            }else {
                throw new EOFException("File is empty");
            }
            return obj;
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}
