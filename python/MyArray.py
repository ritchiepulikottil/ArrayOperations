array = [ 'bird', 'apple', 'sun', 'god']
           #0       #1      #2     #3
           

#access
print("access operation--> ", array[3]) #O(1)

#push
array.append("alien")
print("push operation--> ",array) #O(1)

#pop
array.pop()
print("pop operation--> ",array) #O(1)

#popleft
array.pop(0)
print("popleft operation--> ",array) #O(n)

#pushleft
array.insert(0,"dsa")
print("pushleft operation--> ",array) #O(n)

#insert
array.insert(2,"college")
print("insert operation--> ",array) #O(n)

#delete
array.remove("sun")
print("delete operation--> ",array) #O(n)

#Array native python methods :-
#append()	Adds an element at the end of the list
#clear()	Removes all the elements from the list
#copy()	Returns a copy of the list
#count()	Returns the number of elements with the specified value
#extend()	Add the elements of a list (or any iterable), to the end of the current list
#index()	Returns the index of the first element with the specified value
#insert()	Adds an element at the specified position
#pop()	Removes the element at the specified position
#remove()	Removes the first item with the specified value
#reverse()	Reverses the order of the list
#ort()	Sorts the list

#List objects are implemented as arrays. 
#They are optimized for fast fixed-length operations and incur O(n) memory movement costs for pop(0) and insert(0, v) 
#operations which change both the size and position of the underlying data representation.

#For in depth information on arrays 
#https://docs.python.org/3/tutorial/datastructures.html

#to implement arrays as a stack 
#https://docs.python.org/3/library/collections.html#collections.deque
