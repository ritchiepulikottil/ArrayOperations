//Declaration of Arrays in Java
//Arrays can be declared in the following ways in Java.
//Note that the data type determines the type of data the array elements will hold.
//datatype variable-name[]; (OR) datatype[] variable-name;

//Examples for array declarations
int intArr[]; 
//(OR)
int[] intArr;

float floatArr[];
//(OR) 
float[] floatArr;

double doubleArr[];
//(OR) 
double[] doubleArr[];

char charArr[];
//(OR) 
char[] charArr[];


//Although the above first declaration establishes the fact that intArr is an array variable, the array does not exist actually. 
//It simply instructs the compiler that this (intArr) variable will hold an array of the integer type. 
//For linking intArr (array name) with an actual array of integers,
//we have to allocate using a new variable and then assign it to intArr.
int intArr[]; //This declaration only creates a reference of arrays.

//To allocate memory to arrays, we have to declare the array at first and then allocate memory to it using the new variable.
int intArr[];  //Array Declaration
intArr = new int[10];  //Memory allocation
//The array elements allocated by new will be automatically initialized to zero (for numeric types), null (for reference types), or false (for boolean).
//Creating an array is a two-step process, declaration, and allocation of memory. Thus, arrays are dynamically allocated in java.

//When the array elements are already known, arrays can be declared and defined in this way.
int[] intArr = new int[]{ 2, 3, 5, 7, 11, 13, 17, 19 };

//Multi-Dimensional Array Declaration
int[][] intArr = new int[5][10]; //a 2D array or matrix
int[][][] intArr = new int[5][10][15]; //a 3D array

----------------------------------------------------------------------------------------
//Basic Operations in Arrays

//Traverse − Print all the elements in the array one by one.
// A sample program for array traversal
public class Main {
    public static void main(String[] args) {
        int[] intArr = {2, 3, 5, 7, 11, 13, 17, 19};
        System.out.println("The array elements are ");
        // Print all the array elementsfor (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
    }
}

//Get the First and Last Element of an Array 
int[] array = new int[] { 3, 5, 2, 5, 14, 4 };
int firstItem = array[0];
int lastItem = array[array.length - 1];

//Append a New Item to an Array
int[] newArray = Arrays.copyOf(array, array.length + 1);
newArray[newArray.length - 1] = newItem;
//Optionally, if the ArrayUtils class is accessible in our project, 
//we can make use of its add method (or its addAll alternative) to accomplish our objective in a one-line statement:
int[] newArray = ArrayUtils.add(array, newItem);

//Insert a Value Between Two Values
int[] largerArray = ArrayUtils.insert(2, array, 77);



//Insertion − Adds an element at the given index.
// A sample program for array insertionimport java.util.Scanner;
public class Main{
 public static void main(String[] args) 
 {
 int n = 5, pos, x;
 int intArr[] = new int[n+1];
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the array elements : ");
 for(int i = 0; i < n; i++)
 {
 intArr[i] = sc.nextInt();
 }
 System.out.println("Array elements before insertion : ");
 for(int i = 0 ;i < n ; i++)
 {
 System.out.print(intArr[i] + " ");
 }
 pos = 3;
 x = 24;
 for(int i = (n-1); i >= (pos-1); i--)
 {
 intArr[i+1] = intArr[i];
 }
 intArr[pos-1] = x;
 System.out.println("\nArray elements after insertion:");
 for(int i = 0; i < n; i++)
 {
 System.out.print(intArr[i] + " ");
 }
 System.out.print(intArr[n]);
 }
}

//Deletion − Deletes an element at the given index.
// A sample program for array deletionimport java.util.Scanner;
public class Main{
public static void main(String[] args) 
{
int n = 5, x = 10, flag = 1, loc = 0;
Scanner s = new Scanner(System.in);
int intArr[] = new int[n];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array elements : ");
for(int i = 0; i < n; i++)
{
intArr[i] = sc.nextInt();
}
System.out.println("Array elements before insertion : ");
for(int i = 0 ;i < n ; i++)
{
System.out.print(intArr[i] + " ");
}
for (int i = 0; i < n; i++) 
{
if(intArr[i] == x)
{
flag =1;
loc = i;
break;
}
else
{
flag = 0;
}
}
if(flag == 1)
{
for(int i = loc+1; i < n; i++)
{
intArr[i-1] = intArr[i];
}
System.out.print("\nArray elements after deleting:");
for (int i = 0; i < n-2; i++) 
{
System.out.print(intArr[i]+" ");
}
System.out.print(intArr[n-2]);
}
else
{
System.out.println("Element not found");
}
}
}

//Search − Searches an element in the array using the given index or the value.
// A sample program for searching element in arraysimport java.util.Scanner;
public class Main{
 public static void main(String[] args) 
 {
 int search_ele = 15;
 int n = 5, flag = 0;
 Scanner s = new Scanner(System.in);
 int intArr[] = new int[n];
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the array elements : ");
 for(int i = 0; i < n; i++)
 {
 intArr[i] = sc.nextInt();
 }
 System.out.println("The Array elements are: ");
 for(int i = 0 ;i < n ; i++)
 {
 System.out.print(intArr[i] + " ");
 }
 for(int i = 0; i < 5; i++)
 {
 if(intArr[i] == search_ele)
 {
 flag = 1;
 break;
 }
 }
 if(flag == 1)
 {
 System.out.println("\nElement Found");
 }
 else
 {
 System.out.println("\nElement not found");
 }
 }
}

//Update − Updates an element at the given index.
// A sample program for updationimport java.util.Scanner;
public class Main{
 public static void main(String[] args) 
 {
 int search_ele = 15;
 int n = 5,x;
 Scanner s = new Scanner(System.in);
 int intArr[] = new int[n];
 Scanner sc = new Scanner(System.in);
 System.out.println("\nEnter the array elements : ");
 for(int i = 0; i < n; i++)
 {
 intArr[i] = sc.nextInt();
 }
 System.out.println("\nThe Array elements are: ");
 for(int i = 0 ;i < n ; i++)
 {
 System.out.print(intArr[i] + " ");
 }
 System.out.println("\nEnter the new element : ");
 x = sc.nextInt();
 for(int i = 0; i < 5; i++)
 {
 if(intArr[i] == search_ele)
 {
 intArr[i] = x;
 break;
 }
 }
 System.out.println("Array elements after updating: ");
 for(int i = 0; i < n ; i++)
 {
 System.out.println(intArr[i] + " " );
 }

 }
}
  
