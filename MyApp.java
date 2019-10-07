import java.util.*;
import java.io.*;

/**
 * 여기에 aaaa 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(new FileReader("c:\\Temp\\inputData20191007"));
        }
        catch(IOException e){
            System.out.println("오류"); 
        }
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        // while(scanner.hasNext()){

        Set<String> keys = h.keySet();
        Iterator<String> it = keys.iterator();
        
        int sum = 0;
        while(it.hasNext()){
            String key = it.next();
            sum = sum + h.get(key);
        }
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + (sum/h.size()));
    }
}
