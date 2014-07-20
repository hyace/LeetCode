/*
 * Problem:Candy of leetcode
 * 
 * http://oj.leetcode.com/problems/candy/
 *
 * There are N children standing in a line, Each child 
 * is assigned a rating value.You are giving candies 
 * to these children subjected to the following requir
 * ements:
 *		Each child must have atleast one candy.
 *		Children with a higher rating get more candies 
 * than their neighbors.
 * What is the minimum candies you must give?
 *
 * author Hyace
 * date:May 6, 2014
 *
 *
 */
public class Solution {

	public int candy(int[] ratings) {
		int sum = 0;
		int len = ratings.length;
		if(len==0)
			return 0;
		int[] candy=new int[len];
		for(int i=0;i<len;i++)
			candy[i]=1;
		for(int i=1;i<len;i++)
			if(ratings[i]>ratings[i-1])
				candy[i]=candy[i-1]+1;
		for(int i=len-1;i>0;i--)
			if(ratings[i-1]>ratings[i]&&candy[i]>=candy[i-1])
				candy[i-1]=candy[i]+1;
		for(int i : candy){
			System.out.print(i+",");
			sum+=i;
		}
		return sum;
	}

	public long candy2(int[] ratings) {
		long sum = 1;
		int len = ratings.length;
		if (len == 0)
			return 0;
		int inc = 1;
		int max = 1;
		int mi = 0;

		for(int i=1;i<len;i++){
			if(ratings[i]>=ratings[i-1]){
				inc=ratings[i]==ratings[i-1]?1:inc+1;//在这里原来返回的是inc，rating相等时会出错
				max=inc;
				mi=i;
				sum+=inc;
			}
			else if(inc>1){
				inc=1;
				sum+=inc;
			}
			else if(max>i-mi){
				inc=i-mi;
				sum+=inc;
				inc=1;
			}
			else{
				inc=i-mi+1;
				sum+=inc;
				inc=1;
			}
		}
		return sum;
	}	
}

