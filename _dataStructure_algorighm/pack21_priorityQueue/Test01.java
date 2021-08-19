package _dataStructure_algorighm.pack21_priorityQueue;

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
    //�θ� ����� ��ġ �ľ��ϱ�
    //�ش� �ȵǸ� -1 ����
    public int Parent(int i){
        if(i<=0 || i>=this.count){
            return -1;
        }
        return (i-1)/2;
    }

    //��� �ڽĵ�
    //���� �ڽ� ����� ��ġ
    public int leftChild(int i){
        int left = 2*i+1;
        if(left >= this.count){
            return -1;
        }
        return left;
    }
    //������ �ڽ� ����� ��ġ
    public int rightChild(int i){
        int right = 2*i+2;
        if(right >= this.count){
            return -1;
        }
        return right;
    }

    //�Ѹ�, �� �ִ�(Ȥ�� �ּڰ�) ���ϱ�
    //�Ѹ��� ���� �ֻ�ܿ� ��ġ�ϹǷ� ù���� ���� �ش��
    public int getMaximum(int i){
        if(this.count == 0){
            return -1;
        }
        return this.array[0];
    }

    //������ ����� -> heapifying
    //�׸��� �߰��Ǵ� ���
    //�� �ȿ��� ����� ��ġ�� �����Ͽ� �� ������ �����ϵ��� �����Ѵ�
    //��� : �ڽ� ��� �� �ִ밪�� �ڸ� �ٲٱ�(������ ������ �ݺ�)
    //������ ����� ������ �귯������ �Ͱ� ����� percolateDown �̶�� ��
    public void percolateDown(int i){
        int l = leftChild(i);
        int r = rightChild(i);
        int max;
        int temp;

        //max ���� ��ġ�� ã�Ƽ� �θ���� �ڽĳ�� ��ġ �ٲٱ�
        if(l != -1 && this.array[l] > this.array[i]){
            max = l;
        } else {
            max = i;
        }

        if(r != -1 && this.array[r] > this.array[max]){
            max = r;
        } else {
            temp = this.array[i];
            this.array[i] = this.array[max];
            this.array[i] = temp;
        }
        //max ��°���� ���ȣ��
        percolateDown(max);
    }

    //�׸� �����ϱ�
    int deleteMax(){
        if(this.count == 0){
            return -1;
        }
        int data = this.array[0];
        this.array[0] = this.array[this.count-1];
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