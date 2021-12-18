package Encaps;

public class DataHide {
    private int a;
    public void setData(int b) {
        a = b;
    }
    public int getData(){
        return a;
    }
    public static void main(String []args){
        DataHide show = new DataHide();
        show.setData(100);
        System.out.println(show.getData());
    }
}

