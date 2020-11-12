def MAX(a, b):
	if(a > b):
		return a
	else:
		return b
		
def opt_coupon_collect(coupons, N, K, curr_stall, results_cache):
	
	if(curr_stall >= N):
		return 0
		
	if(results_cache[curr_stall] != -1):
		return results_cache[curr_stall]
		
	prize_if_picked = coupons[curr_stall] + opt_coupon_collect(coupons, N, K, curr_stall + K + 1,results_cache)
	prize_if_not_picked = opt_coupon_collect(coupons, N, K, curr_stall + 1,results_cache)
		
	results_cache[curr_stall] = MAX(prize_if_picked, prize_if_not_picked)
	return results_cache[curr_stall]
	
def opt_coupon_collect_wrapper(coupons, N, K):

	results_cache = []
	for i in range(N):
		results_cache.append(-1)
	return opt_coupon_collect(coupons, N, K, 0, results_cache)
	
N, K = map(int, input().split(',')) 
coupons = []
for i in range(N):
	e = int(input())
	coupons.append(e)
			
print(opt_coupon_collect_wrapper(coupons, N, K));