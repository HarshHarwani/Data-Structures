package arrays;

import java.util.*;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (numRows <= 0)
			return result;
		for (int line = 0; line < numRows; line++) {
			ArrayList<Integer> cRow = new ArrayList<Integer>();
			for (int j = 0; j <= line; j++) {
				if (j == 0)
					cRow.add(1);
				else if (j < line) {
					int num = result.get(line - 1).get(j - 1) + result.get(line - 1).get(j);
					cRow.add(num);
				} else if (j == line)
					cRow.add(1);
			}
			result.add(cRow);
		}
		return result;
	}

public List<Integer> getRow(int rowIndex) {
        if(rowIndex<0)
            return new ArrayList<Integer>();
        List<Integer> result=null;
        List<Integer> prev=new ArrayList<Integer>();
        for(int line=0;line<=rowIndex;line++){
            result=new ArrayList<Integer>();
             for(int j=0;j<=line;j++){
                 if(j==0){
                     result.add(1);
                 }
                 else if(j<line){
                     int num=prev.get(j-1)+prev.get(j);
                     result.add(num);
                 }
                 else if(j==line){
                     result.add(1);
                 }
             }
             prev=result;
        }
        return result;
    }

	public static void main(String[] args) {
		PascalTriangle pTriangle = new PascalTriangle();
		/*List<List<Integer>> result = pTriangle.generate(5);
		for (List<Integer> list : result) {
			System.out.println(list.toString());
		}*/
		System.out.println("============================");
		List<Integer> result1 = pTriangle.getRow(3);
		System.out.println(result1.toString());
	}
}
