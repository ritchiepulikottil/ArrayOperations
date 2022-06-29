//The following code snippet defines the simplest dynamic array of integer types that do not have a fixed size.
int[] intArray;

//The following code snippet declares an array that can store 5 items only starting from index 0 to 4. 
int[] intArray;
intArray = new int[5];

//The following code snippet declares an array that can store 100 items starting from index 0 to 99. 
int[] intArray;
intArray = new int[100];

//The following code snippet defines arrays of double, char, bool, and string data types. 
double[] doubleArray = new double[5];
char[] charArray = new char[5];
bool[] boolArray = new bool[2];
string[] stringArray = new string[10];

//The following code snippet creates an array of 3 items and values of these items are added when the array is initialized. 
// Initialize a fixed array
int[] staticIntArray = new int[3] {1, 3, 5};

//The following code snippet declares a dynamic array with string values. 
// Initialize a dynamic array items during declaration
string[] strArray = new string[] { "Ritchie", "John", "Chuck"};

//We can access an array item by passing the item index in the array. 
//The following code snippet creates an array of three items and displays those items on the console. 
// Initialize a fixed array one item at a time
int[] staticIntArray = new int[3];
staticIntArray[0] = 1;
staticIntArray[1] = 3;
staticIntArray[2] = 5;
// Read array items one by one
Console.WriteLine(staticIntArray[0]);
Console.WriteLine(staticIntArray[1]);
Console.WriteLine(staticIntArray[2]);

//C# Adding and Removing elements to an array with an existing size
//You can't do that with arrays in C# without allocating a new array. Because arrays are fixed in size.
//If you want to be able to add/remove elements from a container, you could use List<T>. 
//Alternativly you could use an ArrayList but that is not recommended, since in most cases List<T> has a performance advantage.
List<string> food = new List<string> { "Bacon", "Cheese", "Patty", "Crabs" };
food.Add("Milk"); //Will add Milk to the list
food.Remove("Bacon"); //Will remove "Bacon"


