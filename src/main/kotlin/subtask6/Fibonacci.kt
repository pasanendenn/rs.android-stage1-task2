package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        val arr = arrayListOf(0,1)
        var a = 0
        var b = 0
        while (a<n){
            a=arr[b]*arr[b+1]
            arr.add(arr[b]+arr[b+1])
            b+=1
        }

        val newArray1 = intArrayOf(arr[b-1], arr[b], 1)
        val newArray2 = intArrayOf(arr[b-1], arr[b], 0)

        return if (a==n){
            newArray1
        } else {
            newArray2
        }

    }
}
