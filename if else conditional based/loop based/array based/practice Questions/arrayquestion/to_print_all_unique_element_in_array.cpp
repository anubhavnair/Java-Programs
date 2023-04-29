#include <iostream>

using namespace std;

int main()
{
    int arr[100];
    int i, j, k, n;
    int count = 0;

    cout << "enter how many no. Have to check" << endl;
    cin >> n;

    for (int i = 0; i < n; i++)
    {
        cout << "enter " << i << " "
             << "element" << endl;
        cin >> arr[i];
        count = 0;
        for (j = 0; j < i - 1; j++)
        {

            if (arr[i] == arr[j])
            {
                count++;
            }
        }
        for (k = i + 1; k < n; k++)
        {
            if (arr[i] == arr[k])
            {
                count++;
            }
        }

        if (count == 0)
        {
            cout << arr[i];
        }
    }
}