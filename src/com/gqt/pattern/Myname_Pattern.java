package com.gqt.pattern;

import java.util.Scanner;

public class Myname_Pattern {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		for(int i=0;i<=n-1;i++) {
	//logic for A
			for(int j=0;j<=n-1;j++) {
				if(j==0||(j==n/2)||(i==0 && j<=(n/2))||(i==n/2 && j<=n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
		}
			System.out.print("	");
//				
				
	//logic for M	
				for(int j=0;j<=n-1;j++) {
					if(j==0 
						|| (j==n-1)
						|| (i==j && i<=n/2 && j<=n/2)
						|| (i+j==n-1 && j>=n/2 && i<=n/2)
					           )
					 
					   
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
					System.out.print("	");
			
				
//		//logic for M	
					for(int j=0;j<=n-1;j++) {
						if(j==0 
							|| (j==n-1)
							|| (i==j && i<=n/2 && j<=n/2)
							|| (i+j==n-1 && j>=n/2 && i<=n/2)
						           )
						 
						   
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
								||i==n-1 && j<=n/2
								||j==n/4 )
								
							   
							{
								System.out.print("# ");
							}
							else {
								System.out.print("  ");
							}
						}
							System.out.println();
					
//				
			}
		}
	
		
	}

//Output:-
//Enter value of n
//11
//# # # # # #           	#                   # 	#                   # 	# # # # # #           
//#         #           	# #               # # 	# #               # # 	    #                 
//#         #           	#   #           #   # 	#   #           #   # 	    #                 
//#         #           	#     #       #     # 	#     #       #     # 	    #                 
//#         #           	#       #   #       # 	#       #   #       # 	    #                 
//# # # # # #           	#         #         # 	#         #         # 	    #                 
//#         #           	#                   # 	#                   # 	    #                 
//#         #           	#                   # 	#                   # 	    #                 
//#         #           	#                   # 	#                   # 	    #                 
//#         #           	#                   # 	#                   # 	    #                 
//#         #           	#                   # 	#                   # 	# # # # # #           
