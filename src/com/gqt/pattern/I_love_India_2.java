package com.gqt.pattern;

import java.util.Scanner;

public class I_love_India_2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(i==0 && j<=n/2
					|| i==n-1 && j<=n/2
					|| j==n/4 )
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.print("	");
		//Symbol love	
			for(int j=0;j<=n-1;j++) {
				if(i-j==n/2 && i>n/2 
					||i+j==n-1+n/2 && i>n/2
					||j==0 && i<n/2 && i!=0
					||j==n-1 && i<n/2 && i!=0
					||i==j && i<=n/2 && i!=0
					||i+j==n-1 &&i<=n/2 && i!=0
					)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.print("	");
			//logic for I
			for(int j=0;j<=n-1;j++) {
				if(i==0 && j<=n/2
					|| i==n-1 && j<=n/2
					|| j==n/4 )
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}	
			System.out.print("	");
		//logic for N	
			for(int j=0;j<=n-1;j++) {
				if(j==0 
					|| j==n-1
					|| i==j )
					    
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}	
			System.out.print("		");
		//logic for D	
			for(int j=0;j<=n-1;j++) {
				if( j==0
					||i==0&&j<n/2
					||i==n-1&&j<n/2
					||j==n/2 && i!=0 && i!=n-1)
						
						{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.print("	");
			
			//logic for I
			for(int j=0;j<=n-1;j++) {
				if(i==0 && j<=n/2
					|| i==n-1 && j<=n/2
					|| j==n/4 )
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}	
			
			System.out.print("	");
			//logic for A
			
			for(int j=0;j<=n-1;j++) {
				if(j==0||(j==n/2)||(i==0 && j<=(n/2))||(i==n/2 && j<=n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			
			System.out.println();
			
			
		}
	}

}

//Output:-
//Enter the number
//11
//* * * * * *           	                      	* * * * * *           	#                   # 		# # # # #             	* * * * * *           	# # # # # #           
//    *                 	* *               * * 	    *                 	# #                 # 		#         #           	    *                 	#         #           
//    *                 	*   *           *   * 	    *                 	#   #               # 		#         #           	    *                 	#         #           
//    *                 	*     *       *     * 	    *                 	#     #             # 		#         #           	    *                 	#         #           
//    *                 	*       *   *       * 	    *                 	#       #           # 		#         #           	    *                 	#         #           
//    *                 	          *           	    *                 	#         #         # 		#         #           	    *                 	# # # # # #           
//    *                 	  *               *   	    *                 	#           #       # 		#         #           	    *                 	#         #           
//    *                 	    *           *     	    *                 	#             #     # 		#         #           	    *                 	#         #           
//    *                 	      *       *       	    *                 	#               #   # 		#         #           	    *                 	#         #           
//    *                 	        *   *         	    *                 	#                 # # 		#         #           	    *                 	#         #           
//* * * * * *           	          *           	* * * * * *           	#                   # 		# # # # #             	* * * * * *           	#         #           

