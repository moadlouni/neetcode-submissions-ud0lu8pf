class DynamicArray:
    
    # initialize empty array
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.length = 0
        self.arr = [0] * self.capacity

    # get/return value at i-th index
    def get(self, i: int) -> int:
        return self.arr[i]

    # set n at i-th index
    def set(self, i: int, n: int) -> None:
        self.arr[i] = n

    # insert n in the last position of the array
    def pushback(self, n: int) -> None:
        if self.length == self.capacity:
            self.resize()
        
        #insert value at next empty position
        self.arr[self.length] = n
        self.length += 1

    # remove the last element in the array
    def popback(self) -> int:
        if self.length > 0:
            self.length -= 1

        # return the popped element
        return self.arr[self.length]

    # create new array with previous values and double capacity
    def resize(self) -> None:
        self.capacity = 2 * self.capacity
        new_arr = [0] * self.capacity

        # copy elements to new_arr
        for i in range(self.length):
            new_arr[i] = self.arr[i]
        self.arr = new_arr
    
    def getSize(self) -> int:
        return self.length
        
    def getCapacity(self) -> int:
        return self.capacity