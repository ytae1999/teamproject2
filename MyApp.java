import java.util.*;
import java.io.*;

/**
 * 여기에 aaaa 클래스 설명을 작성하십시오.
 * 
 * @author (2018315033 태영준, 2018315009 황훈태) 
 * @version (2019.10.07)
 */
public class MyApp
{
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(new FileReader("c:\\Temp\\inputData20191007")); //파일 입력
        }
        catch(IOException e){
            System.out.println("오류"); 
        }
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        
        while(scanner.hasNext()){ //파일의 끝까지 반복한다.
            String key = scanner.nextLine();
            Integer value = scanner.nextLine();
            h.put(key, value);
        }

        Set<String> keys = h.keySet();  //모든 key를 가진 Set컬렉션 리턴
        Iterator<String> it = keys.iterator(); //Set에 있는 모든 key를 순서대로 검색하는 Iterator 리턴


        int sum = 0; // sum 초기화 
        while(it.hasNext()){ 
            String key = it.next(); // //다음 키를 가져온다.
            sum = sum + h.get(key); //sum의 값들을 계속 더해간다
        }
        System.out.println("총점 : " + sum); //총점 출력 
        System.out.println("평균 : " + (sum/h.size())); //평균 출력
    }
}
