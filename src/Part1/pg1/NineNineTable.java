package Part1.pg1;

public class NineNineTable {
    public void nineTable(){
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"   ");
            }
            System.out.println();
        } //九九乘法表
    }


    public static void main(String[] args) {
        NineNineTable nineNineTable=new NineNineTable();
        nineNineTable.nineTable();
    }
}
