def canCompleteCircuit(self, gas, cost):
        n=len(gas)
        sum=gas[0]-cost[0]
        start=0
        min=sum
        for i in range(1,n):
            temp=gas[i]-cost[i]
            sum+=temp
            if(sum<min):
                min=sum
                start=i
        return (start+1)%n if sum>=0 else -1
