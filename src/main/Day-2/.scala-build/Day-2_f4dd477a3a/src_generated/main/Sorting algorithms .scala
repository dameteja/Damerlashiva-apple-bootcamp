

final class Sorting$u0020algorithms$u0020$_ {
def args = Sorting$u0020algorithms$u0020_sc.args$
def scriptPath = """Sorting algorithms .sc"""
/*<script>*/
//defined function swap 

def swap(arr: Array[Int], i: Int, j: Int): Unit = {
    val temp = arr(i)
    arr(i) = arr(j)
    arr(j) = temp }
    


//bubble sort 

def bubblesort(arr: Array[Int]): Array[Int] = {
    val n: Int = arr.length 
    for(i <- 0 until n-1){
        var swapped:Boolean = false
        for(j <- 0 until n-i-1){
            if(arr(j) > arr(j+1)){
                swap(arr,j+1,j)
                swapped = true
            }
        }
        if(!swapped){
            return arr
        }
    }
    return arr
}
val result: Array[Int] = bubblesort(Array(1,3,4,2,8))
println("BubbleSorted Output: ")
for(i <- result){
    print(s" $i")
    print(" ")
}


//Insert Sorting 

def insertionsort(arr: Array[Int]): Array[Int] = {
    val n: Int = arr.length
    for(i <- 1 until n-1){
        var x = arr(i)
        var j  = i-1
        while(j >= 0 && arr(j)>x){
            arr(j+1) = arr(j)
            j = j-1
        }
        arr(j+1) = x
    }
    return arr
}
val result: Array[Int] = insertionsort(Array(1,3,4,2,8))
println("InsertionSorted Output: ")
for(i <- result){
    print(s" $i")
    print(" ")
}

///quick sort 

def quicksort(arr: Array[Int]): Array[Int] = {  
    val n = arr.length
    if (n <= 1) {
        return arr
    }                
    var i = 0
    var pivot = arr(n-1)
    for(j <- 0 until n-1 ) {
        if(arr(j) < pivot){
            swap(arr,j,i)
            i += 1
        }
    }
    swap(arr, i , n-1)
    val left = quicksort(arr.take(i))
    val rgiht = quicksort(arr.drop(i+1))
    left ++ Array(pivot) ++ rgiht
}
val result: Array[Int] = quicksort(Array(1,3,4,2,8))
println("QuickSorted Output: ")
for(i <- result){
    print(s" $i")
    print(" ")
}


//heap sorting

def heapify(arr:Array[Int],n: Int, i:Int): Unit = {
    var largest = i
    var l = 2*i + 1 
    var r = 2*i + 2
    if(l<n && arr(l)>arr(largest))
        largest = l
    if(r<n && arr(r)>arr(largest))
        largest = r;
    if(largest != i){
        swap(arr,i,largest)
        heapify(arr,n,largest)
    }
}

def heapsort(arr: Array[Int]): Array[Int] = {
    val n = arr.length
    for (i <- (n / 2 - 1) to 0 by -1){
        heapify(arr,n,i)
    }
    for(i <- n-1 to 0 by -1){
        swap(arr,0,i)
        heapify(arr,i,0)
    }
    return arr
}
val result: Array[Int] = heapsort(Array(1,3,4,2,8))
println("HeapSorted Output: ")
for(i <- result){
    print(s" $i")
    print(" ")
}

///Selection sorting 

def selectionsort(arr: Array[Int]): Array[Int] = {
    val n: Int = arr.length
    for(i <- 0 until n){
        var high = i
        for(j <- i+1 until n){
            if(arr(j) < arr(high)){
                high = j
            }
        }
        swap(arr,i,high)
    }
    return arr
}
val result: Array[Int] = selectionsort(Array(1,3,4,2,8))
println("SelectionSorted Output: ")
for(i <- result){
    print(s" $i")
    print(" ")
}


/*</script>*/ /*<generated>*//*</generated>*/
}

object Sorting$u0020algorithms$u0020_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new Sorting$u0020algorithms$u0020$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export Sorting$u0020algorithms$u0020_sc.script as `Sorting algorithms `

