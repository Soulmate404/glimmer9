import java.util.Arrays;
import java.util.List;

public class MyTest1 {
    public static void main(String[] args) {
        Integer[] number={12,13,44,5521,23};//随便弄一个列表
        List<Integer> numbers= Arrays.asList(number);
        List<Integer> squaresList = numbers.stream()
                .map(i -> i +1)	//将每一个元素都按照i+1的方式处理
                .sorted((x, y) -> y - x)	//用compare函数比较大小并排序
                .toList();//把流中的元素再次还原为列表
        squaresList.forEach(System.out::println);//用foreach打印





    }

}
