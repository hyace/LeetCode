/*
 * Problem:Gas Station of leetcode
 * There are N gas stations along a circular route,
 * where the amount of gas at station i is gas[i].
 * You have a car with an unlimited gas tank and it
 * costs cost[i] of gas to travel from station i to 
 * its next station (i+1). You begin the journey 
 * with an empty tank at one of the gas stations.
 * Return the starting gas station’s index if you 
 * can travel around the circuit once, otherwise 
 * return -1.Note: The solution is guaranteed to be unique.
 * 
 * author hyace
 * date May 7,2014
 */
public Gas02{
	public int gas(int[] a, int[] g) {
        int n=a.length;
    	int sum=a[0]-g[0];
		int min=sum;
		int start=0;
		for(int i=1;i<n;i++){
			int temp=a[i]-g[i];
			sum+=temp;
			if(sum<min){
				min=sum;
				start=i;
			}
		}
		return sum>=0?(start+1)%n:-1;
	}
	
}
