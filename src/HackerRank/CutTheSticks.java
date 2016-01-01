package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}
		Collections.sort(list);
		while(list.size()>0){
			System.out.println(list.size());
			int min=list.get(0);
			List<Integer> rlist=new ArrayList<Integer>();
			for(int j:list){
				int ele=j-min;
				if(ele>0){
					rlist.add(ele);
				}
			}
			list=rlist;
		}
		scanner.close();	
	}
}
