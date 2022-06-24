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

