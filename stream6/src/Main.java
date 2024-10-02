import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Song>songList=Song.getSongs();

        try {
            FileWriter writer = new FileWriter("songList.txt");// 如果文件“Foo.txt“不存在，则会自动创建这个文件
            songList.forEach(song -> {
                try {
                    writer.write(song.toString()+System.lineSeparator());//用lambda语法实现写入与换行
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            writer.close();//确保文件关闭
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //用buffredreader读文件，但ide又弄了个try-catch
        BufferedReader reader= null;
        try {
            reader = new BufferedReader(new FileReader("songList.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<String>song=new ArrayList<>();
        //同样的ide给我挂了一个try
        String line;
        try {
            while ((line = reader.readLine()) != null) {//用while循环读每一行并加入到song
                song.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        song.forEach(System.out::println);//遍历song

        }
    }
