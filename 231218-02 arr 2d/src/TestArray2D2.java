public class TestArray2D2 {
	public static void main(String[] args) {
		int[][] arr2d = new int[4][5]; // 4행 5열, 열개수는 비워도 말이됨
//		int[][] arr2d = new int[][] {
//		  				{ 1, 2, 3 }
//						,{ 4, 5, 6 }
//						,{ 7, 8, 9 }
//		};
		
//		int[][] arr2d = new int[][] {
//			{ 1, 2, 3, 4, 5}
//			,{ 6 }
//			,{ 7, 8, 9 }
//		};
//		
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j <arr2d.length; j++) {
				System.out.println(arr2d[i][j]);
			}
		}
	}
}
