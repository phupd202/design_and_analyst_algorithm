
import random
import matplotlib.pyplot as mp

# Cách 1
def case_1(file_sizes):
    n = len(file_sizes)
    tmp = file_sizes[0]
    complexity = 0
    
    for i in range(1, n):
        tmp = tmp + file_sizes[i]
        complexity = complexity + tmp
    return complexity

# Cách 3
def case_3(file_sizes):
    # sort
    file_sizes.sort()

    n = len(file_sizes)
    tmp = file_sizes[0]
    complexity = 0
    
    for i in range(1, n):
        tmp = tmp + file_sizes[i]
        complexity = complexity + tmp
    return complexity

# Cách 2
def case_2(arr):
    
    costs = []
    i = 0
    n = len(arr)
    while i < n - 1:
        cost = arr[i] + arr[i+1]
        arr.append(cost)
        costs.append(cost)
        n += 1
        i += 2
    return sum(costs)

# Vẽ đồ thị
sizes = []
compForSequence = []
compForPair = []
compForSorted = []

for size in range(1, 1000):
    input = []
    for i in range(0, size):
        input.append(random.randint(1000, 100000))
        

    # sequence
    comp_sequence = case_1(input)
    compForSequence.append(comp_sequence)

    # pair
    comp_pair = case_2(input)
    compForPair.append(comp_pair)

    # sorted
    comp_sorted = case_3(input)
    compForSorted.append(comp_sorted)

    sizes.append(size)

    
mp.xlabel('Size of input')
mp.ylabel('Time complexity')
mp.plot(sizes, compForSequence, label="Cách 1")
mp.plot(sizes, compForPair, label="Cách 2")
mp.plot(sizes, compForSorted, label="Cách 3")
mp.legend()
mp.show()
