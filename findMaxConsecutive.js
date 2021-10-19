let nums = [1, 1, 0, 1, 1, 1, 0, 1];

function findMax(arr) {
	let max = 0;
	let current = 0;

	for (let i = 0; i < arr.length; i++) {
		if (arr[i] == 1) {
			current++;
		} else {
			max = Math.max(max, current);
			current = 0;
		}
	}

	max = Math.max(max, current);
	return max;
}

console.log(findMax(nums)); // 3
