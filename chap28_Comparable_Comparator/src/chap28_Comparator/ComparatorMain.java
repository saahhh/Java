package chap28_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain implements Comparator<String> {

	@Override
	public int compare (String num1, String num2) {
		//길이가 같으면 0 반환
		if(num1.length() == num2.length()) {
			return 0;
		}
		//num1이 num2보다 길면 양수 반환
		else if (num1.length() > num2.length()) {
			return 1;
		}
		//num1이 num2보다 짧으면 음수
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("apple");
		str.add("banana");
		str.add("cherry");
		str.add("add");
		str.add("abcdefg"); //길이 순서대로 출력되서 맨 아래에 출력됨
		str.add("day"); //길이가 같다면 오름차순으로 정렬됨
		str.add("z"); //길이가 짧은 문자열이 제일 먼저 출력됨
		
		//Comparator를 사용해서 문자열을 정렬한다.  =>   1.길이 2.순서 의 규칙으로 정렬된다
		Collections.sort(str, new ComparatorMain());
		//한글 소문자 대문자 의 순서
		
		//정렬된 결과 출력
		for(String s : str) {
			System.out.println(s);
		}
	}
}
