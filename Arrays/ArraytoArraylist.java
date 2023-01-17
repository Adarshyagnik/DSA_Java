package Arrays;

import java.util.Arrays;
import java.util.List;

public class ArraytoArraylist {

	public static void main(String[] args) {
		
		int[] a1= {1,2,5,4};
		List<Integer> list=Arrays.stream(a1).boxed().toList();
		System.out.println( ((Object)list).getClass().getSimpleName());
	}
}
