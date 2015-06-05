package arrays;

public class ArrayDriver {
	
	public static void main(String args[]){
		/*NoOfWays noOfWays=new NoOfWays();
		noOfWays.N=8;
		noOfWays.CountNoOfWays(1, 8, 2);
		System.out.println(NoOfWays.count);*/
		HHashMap hashMap=new HHashMap();
		hashMap.put("Harsh", "Gajab");
		hashMap.put("Harsh", "Bhukka");
		hashMap.put("Nikul", "Gajab");
		System.out.println(hashMap.get("Harsh"));
		System.out.println(hashMap.get("Nikul"));
	}

}
