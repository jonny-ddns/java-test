package _dataStructure_algorighm.pack02.priorityQueue;

//우선순위 큐는 heap 구조를 가진다
public class Test01 {
    public int[] array;
    public int count;       //요소의 개수
    public int capacity;    //힙의 크기
    public int heap_type;   //최소힙인지 최대힙인지

    //생성자
    public Test01(int capacity, int heap_type){
        this.heap_type = heap_type;
        this.capacity = capacity;
        this.array = new int[capacity];
        this.count = 0;
    }
    //노드의 부모
    public int Parent(int i){
        if(i<=0 || i>=this.count){
            return -1;
        }
        return (i-1)/2;
    }
    //노드 자식들
    //자식 - left
    public int leftChild(int i){
        int left = 2*i+1;
        if(left >= this.count){
            return -1;
        }
        return left;
    }
    //자식 - right
    public int rightChild(int i){
        int right = 2*i+2;
        if(right >= this.count){
            return -1;
        }
        return right;
    }
    //최대항목 구하기
    public int getMaximum(int i){
        if(this.count == 0){
            return -1;
        }
        return this.array[0];
    }

    //항목을 힙으로 만들기
    public void percolateDown(int i){
        int l, r, max, temp;
        l = leftChild(i);
        r = rightChild(i);
        if(l != -1 && this.array[l]>this.array[i]){
            max = 1;
        } else{
            max = i;
        }
    }

    //항목 삭제하기
    int deleteMax(){
        if(this.count == 0){
            return -1;
        }
        int data = this.array[0];
        this.array[0] = this.array[this.count -1];
        this.count--;   //힙 크기 줄이기

        return data;
    }
    
    //항목 삽입하기
    void insert(int data){
        int i;
        if(this.count == this.capacity){
            resizeHeap();
        }
        this.count++;
        i = this.count -1;
        while( i>=0 && data>this.array[(i-1)/2]){
            i=(i-1)/2;
        }
        this.array[i] = data;
    }

    void resizeHeap(){
        int[] array_old = new int[this.capacity];
//        System.arraycopy(this.array, 0, array_old, this.count-1);
        this.array = new int[this.capacity *2];
        if(this.array == null){
            System.out.println("memory error");
            return;
        }
        for(int i=0; i<this.capacity; i++){
            this.array[i] = array_old[i];
        }
        array_old = null;
    }

    //힙 제거하기
    void destroyHeap(){
        this.count = 0;
        this.array = null;
    }

    //배열을 힙으로 만들기
    void buildHeap(Test01 h, int[] A, int n){
        if(h == null){
            return;
        }
        while(n>this.capacity){
            h.resizeHeap();
        }
        for(int i=0; i<n; i++){
            h.array[i] = A[i];
        }
        this.count = n;
        for(int i=(n-1)/2; i>=0; i--){
            h.percolateDown(i);
        }
    }

    //힙 정렬하기
    void heapSort(int A[], int n){
        Test01 h = new Test01(n, 0);
        int old_size;
        int i;
        int temp;
        buildHeap(h, A, n);
        old_size = h.count;
        for(i=-1; i>0; i--){
            temp = h.array[0];
            h.array[0] = h.array[h.count -1];
            h.array[0] = temp;
            h.count--;
            h.percolateDown(i);
        }
        h.count = old_size;
    }
}