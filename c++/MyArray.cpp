//C++ Array Declaration --> dataType arrayName[arraySize];
int x[6];
int x[6] = {19, 10, 8, 17, 9, 15};
int x[] = {19, 10, 8, 17, 9, 15};

//access
array[index];

//push (cannot push and pop as it has c++ has static arrays anyhow we can use vectors)
#include <iostream>
#include <vector>
std::vector< int > arr;
arr.push_back(1);
arr.push_back(2);
arr.push_back(3);
//1,2,3 are pushed into the array

//pop (cannot push and pop as it has c++ has static arrays anyhow we can use vectors)
#include <vector>
vector<int> myvector{ 1, 2, 3, 4, 5 };
myvector.pop_back();
//array becomes 1,2,3,4

//insert
#include <stdio.h>
int main()
{
    int arr[100];
    int i, item, pos, size=7;
 
    printf("Enter 7 elements: ");
    // reading array
    for (i = 0; i < size; i++)
        scanf("%d",&arr[i]);
 
    // print the original array
    printf("Array before insertion: ");
    
    for (i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
 
    // read element to be inserted
    printf("Enter the element to be inserted: ");
    scanf("%d",&item);
    
    // read position at which element is to be inserted
    printf("Enter the position at which the element is to be inserted: ");
    scanf("%d",&pos);
 
    // increase the size
    size++;
 
    // shift elements forward
    for (i = size-1; i >= pos; i--)
        arr[i] = arr[i - 1];
 
    // insert item at position
    arr[pos - 1] = item;
 
    // print the updated array
    printf("Array after insertion: ");
    
    for (i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
 
    return 0;
}

//delete
#include<stdio.h>
int main()
{
    
    int key, i, pos = -1, size=5;
    int arr[5] = {1, 20, 5, 78, 30};
    printf("Array before deletion: ");
    
    for (i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
    
    printf("Enter element to delete: ");
    scanf("%d",&key);
    // traverse the array
    // if any element matches the key, store its position
    for(i = 0; i < size; i++)
    {
        if(arr[i] == key)
        {
            pos = i;
            break;
        }
    }
    if(pos != -1)
    {
        //shift elements backwards by one position
        for(i = pos; i < size - 1; i++)
            arr[i] = arr[i+1];
        printf("Array after deletion: ");
        for(i = 0; i < size - 1; i++)
            printf("%d ",arr[i]);
    }
    else
        printf("Element Not Found\n");
    return 0;
}
