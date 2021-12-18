package Encap2;

public class Encaps {
    private int data;
    private String Data;
    private String data2;
    public void  setValue(int a,String Data){
        data = a;
        this.Data = Data;
    }
    public int getData(){
        return data;
    }
    public String GetData(){
        return Data;
    }
    public static void main(String []args){
        Encaps show = new Encaps();
        show.setValue(200,"User is Coder");
        System.out.println(show.getData());
        System.out.println(show.GetData());
    }
}
