package arrays;

import java.util.List;

public class ArrayDriver {

    public static void main(String args[]) {
        // NoOfWays noOfWays=new NoOfWays();
        // noOfWays.N=8;
        // noOfWays.CountNoOfWays(1, 8, 2);
        // System.out.println(NoOfWays.count);

        // Hashmap implementation

   /*     HHashMap<String> hashMap = new HHashMap<String>();
        hashMap.put("Harsh", "Gajab");
        hashMap.put("Harsh", "Bhukka");
        hashMap.put("Nikul", "Gajab");
        System.out.println(hashMap.get("Harsh"));
        System.out.println(hashMap.get("Nikul")); // merge sorted arrays
        MergeSortedArrays meArrays = new MergeSortedArrays();
        int[] a = { 1, 7, 21, 36 };
        int[] b = { 2, 9, 15, 42 };
        int[] c = meArrays.mergeSortedArrays(a, b);
        for (int i : c) {
            System.out.print(i + ",");
        }
        System.out.println("\n");
        // partition array
        int[] d = { 52, 43, 37, 87, 46, 60, 36, 35, 24, 90, 27, 72 };
        PartitionArray partitionArray = new PartitionArray();
        int[] arr = partitionArray.partitionArray(d, 4);
        for (int i : arr) {
            System.out.print(i + ",");
        }

        System.out.println("\n");
        QuickSort quickSort = new QuickSort();
        int[] q = quickSort.sort(d, 0, d.length - 1);
        for (int i : q) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        KthSmallest kthsmallest = new KthSmallest();
        int k = kthsmallest.kthsmallest(d, 0);
        System.out.println(k);
        RatMaze ratMaze = new RatMaze(4);
        int[][] maze = { { 1, 1, 1, 1 }, { 1, 1, 0, 1 }, { 0, 1, 0, 1 }, { 0, 1, 0, 1 } };
        ratMaze.solveMaze(maze);
        int[] e = { 10, -8, -2, 5, -3, 4, -5, 8, 24, 90, 27, 72 };
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(e);
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> list = threeSum.threeSum(e);
        for (List<Integer> l : list) {
            System.out.println(l.toString());
        }

        int[][] spiral = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        PrintSpiral printSpiral = new PrintSpiral();
        printSpiral.printSpiralOrder(spiral);

        int[][] setZeros = { { 0, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 56, 16 } };
        SetZeros sZeros = new SetZeros();
        sZeros.setZeros(setZeros);

        MergeSorted1 meSorted1 = new MergeSorted1();
        int[] ab = { 8, 9, 10, -1, -1, -1 };
        int[] ba = { 1, 3, 4 };
        meSorted1.MergeSortedBuffer(ab, ba, 3, 3);

        int[] aa = { 12, 14, 18, 21, 3, 6, 9 };
        CircularSorted cSorted = new CircularSorted();
        int result = cSorted.searchCircularSorted(aa, 3, 0, aa.length - 1);
        System.out.println(result);

        String[] s = { "at", "", "", "", "ball", "", "", "cat", "", "", "dad", "", "" };
        FindSortedString fString = new FindSortedString();
        int r = fString.searchString(s, "ball", 0, s.length - 1);
        System.out.println(r);

        int[] aaa = { 8, 11, 12, 2, 3, 5 };
        FindRotationCount fiCount = new FindRotationCount();
        System.out.println(fiCount.getRotationcount(aaa));*/
        int[] cele={5, 4, 2, 7, 3, 6};
        ConsecutiveElements cElements=new ConsecutiveElements();
        System.out.println(cElements.isConsecutiveElements(cele,cele.length));
    }

}
