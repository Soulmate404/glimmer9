import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Song>songList=Song.getSongs();


//用oos类实现串行化
        try  (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("666.ser"))){


            oos.writeObject(songList);//把songlist串行化写入666.ser
            System.out.println("Serialization complete.");
        } catch (IOException e) {
            e.printStackTrace();
        }
//用ois类实现反串行化
       List<Song>song=new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("666.ser"))) {
            song = (List<Song>) ois.readObject();//一个发生了类型转换的写入，ide帮我改的，至少能跑？

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }System.out.println("Deserialization complete.");

        // 打印反序列化后的数据，以验证其状态
        if (song != null) {

            song.forEach(System.out::println);
        }
    }
    }
