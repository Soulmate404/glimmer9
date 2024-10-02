import java.util.List;

import java.lang.String;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
        List<Song>songs=Song.getSongs();//拉一个list导入song
        List<Song> rockSongs = songs.stream()//得到一个流
                .filter(song -> song.getGenre().equalsIgnoreCase("rock"))//用过滤String中的equal方法比对过滤
                .collect(Collectors.toList());//重新获得list


    rockSongs.forEach(System.out::println);//用foreach遍历
    }

}