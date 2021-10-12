#include<iostream>
using namespace std;
int main() {
	int r;

	cout << "Enter number of rows: ";
	cin >> r;

	for (int i = 0; i < r; i++)
	{
		for (int j = 1; j <= r - i; j++) {
			cout << "  ";
			
		}

		int temp = 1;
		for (int k = 0; k <= i; k++)
		{
			if (k == 0 || i == 0) {

				temp = 1;
			}
			else {
				temp = temp * (i - k + 1) / k;
			}
				cout << temp << "   ";

			}

			cout << endl;


	}






	return 0;

}
