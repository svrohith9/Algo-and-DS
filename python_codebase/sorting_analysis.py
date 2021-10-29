import sys
import time
import random


def quick_sort(array):

    left = []
    equal = []
    right = []

    if len(array) > 1:
        pivot = array[0]
        for x in array:
            if x < pivot:
                left.append(x)
            elif x == pivot:
                equal.append(x)
            elif x > pivot:
                right.append(x)

        # recursive calling of the sort() function
        return quick_sort(left) + equal + quick_sort(right)

    else:  # return the array, when it contains only 1 element
        return array


def insertion_sort(arr):
    for step in range(1, len(arr)):
        key = arr[step]
        j = step - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j = j - 1

        arr[j + 1] = key


def selection_sort(arr):
    for i in range(len(arr)):
        min_index = i
        for j in range(i+1, len(arr)):
            if arr[j] < arr[min_index]:
                min_index = j
        arr[i], arr[min_index] = arr[min_index], arr[i]


def main():
    try:
        arg1 = sys.argv[1]
        arg2 = int(sys.argv[2])
        arg3 = sys.argv[3]

        if(arg1 not in ["q", "i", "s"] or arg2 < 0 or arg3 not in ["s", "c", "r"]):
            raise Exception("Wrong input")
        arr = []

        sys.setrecursionlimit(max(sys.getrecursionlimit(), len(arr)+1))

        if arg3 == "s":
            arr = [i for i in range(0, arg2)]
        elif arg3 == "c":
            arr = [0]*arg2
        else:
            arr = random.sample(range(arg2), arg2)

        # print(arr)
        start_time = time.time()

        if arg1 == "q":
            quick_sort(arr)
        elif arg1 == "i":
            insertion_sort(arr)
        else:
            selection_sort(arr)

        # print(arr)
        print("Time Taken --- %s seconds ---" % (time.time() - start_time))

    except Exception as exp:
        print(exp)


if __name__ == "__main__":
    sys.setrecursionlimit(999999999)
    main()
    print('---end---')
