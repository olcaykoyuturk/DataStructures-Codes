package withArray;

public class Stack {
    private int array[];
    private int size;
    private int indis;

    public Stack(int size){
        this.size = size;
        array = new int[size];
        this.indis = -1;
    }

    public void push(int data){
        if(indis == size-1){
            System.out.println("Liste dolu, eleman eklenemedi!");
        }else{
            array[++indis] = data;
            System.out.println("Stack'e yeni eleman eklendi => " + data);
        }
    }

    public void pop(){
        if (indis == -1){
            System.out.println("Liste zaten boş!");
        }else{
            System.out.println("Eleman çıkarıldı => " + array[indis--]);
        }
    }

    public void print() {
        if (indis == -1) {
            System.out.println("Stack bos!");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= indis; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.println();
        }
    }

}
