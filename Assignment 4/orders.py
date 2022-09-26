def find_orders(item_list, target):
        dp = {}
        dp[0] = [[]] # base case
        for i in range(len(item_list)): # iterate over list of items
            item = item_list[i] # get item
            for j in range(item, target + 1):
                if (j-item) in dp:
                    if j not in dp:
                        dp[j] = [] # create new sublist
                    for combination in dp[j-item]:
                        dp[j].append(combination + [i+1])
        
        return dp[target] if target in dp else []

        
# Get inputs
input()
item_list = input().split(' ')
item_list = [int(item) for item in item_list]

input()
order_list = input().split(' ')
order_list = [int(order) for order in order_list]

# Print result for each order
for order in order_list:
    result = find_orders(item_list, order)
            
    if len(result)>1:
        print("Ambiguous")
    elif len(result)==0:
        print("Impossible")
    else: # only 1 result in list
        result = ' '.join(map(str,result[0])) # convert to string
        print(result)