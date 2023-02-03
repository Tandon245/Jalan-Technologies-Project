import java.util.*;

public class Main
{
     public static List<Integer> findZeroSumElements(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]+arr[j]==0){
                    result.add(arr[i]);
                    result.add(arr[j]);
                }
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        result.add(arr[i]);
                        result.add(arr[j]);
                        result.add(arr[k]);
                        return result;
                    }
                }
            }
        }
        
        
        return result.isEmpty() ? new ArrayList<Integer>(List.of(-1)) : result;
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt();
		   int[] arr =new int[n];
		   for(int i=0;i<n;i++){
		       arr[i]=sc.nextInt();
		   }
        List<Integer> ans = findZeroSumElements(arr);
        if (ans.get(0) == -1) {
            System.out.println("No elements found");
        } else {
            System.out.println(ans);
        }
		
		
	}
}
