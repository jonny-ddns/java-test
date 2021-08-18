package _dataStructure_algorighm.pack02.priorityQueue;

//�켱���� ť�� heap ������ ������
public class Test01 {
    public int[] array;
    public int count;       //����� ����
    public int capacity;    //���� ũ��
    public int heap_type;   //�ּ������� �ִ�������

    //������
    public Test01(int capacity, int heap_type){
        this.heap_type = heap_type;
        this.capacity = capacity;
        this.array = new int[capacity];
        this.count = 0;
    }
    //����� �θ�
    public int Parent(int i){
        if(i<=0 || i>=this.count){
            return -1;
        }
        return (i-1)/2;
    }
    //��� �ڽĵ�
    //�ڽ� - left
    public int leftChild(int i){
        int left = 2*i+1;
        if(left >= this.count){
            return -1;
        }
        return left;
    }
    //�ڽ� - right
    public int rightChild(int i){
        int right = 2*i+2;
        if(right >= this.count){
            return -1;
        }
        return right;
    }
    //�ִ��׸� ���ϱ�
    public int getMaximum(int i){
        if(this.count == 0){
            return -1;
        }
        return this.array[0];
    }

    //�׸��� ������ �����
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

    //�׸� �����ϱ�
    int deleteMax(){
        if(this.count == 0){
            return -1;
        }
        int data = this.array[0];
        this.array[0] = this.array[this.count -1];
        this.count--;   //�� ũ�� ���̱�

        return data;
    }
    
    //�׸� �����ϱ�
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

    //�� �����ϱ�
    void destroyHeap(){
        this.count = 0;
        this.array = null;
    }

    //�迭�� ������ �����
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

    //�� �����ϱ�
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