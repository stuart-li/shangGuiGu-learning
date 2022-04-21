package Part1.project1;


public class FamilyAccount {
    public void familyAccountTest(){
        boolean isFlag=true;
        //���ڼ�¼�û������֧��������
        String details="";
        int balance=0;
        while(isFlag){
        System.out.println("-----------------��ͥ��֧�������-------------------");
        System.out.println("                  1����֧��ϸ");
        System.out.println("                  2���Ǽ�����");
        System.out.println("                  3���Ǽ�֧��");
        System.out.println("                  4����   ��");
        System.out.print("                  ��ѡ��<1-4>:");

        //�ṩ�û�����ѡ��
        char selection=Utility.readMenuSelection();

        switch (selection){
                case '1':
                    System.out.println("----------------��ǰ��֧��ϸ��¼--------------");
                    System.out.println("\t��֧\t�˻����\t��֧���\t˵��\n");
                    System.out.println(details);
                    System.out.printf("-----------------------------------------------");

                    break;
            case '2':
                System.out.print("����������:");
                int money=Utility.readNumber();
                System.out.print("��������˵��:");
                String mark=Utility.readString();

                //����balance
                balance+=money;
               //����details
                details+=("����\t"+balance+"\t"+money+"\t"+mark+"\n");

                System.out.println("----------------�Ǽ����-----------------");
                break;
            case '3':
                System.out.print("����������:");
                money=Utility.readNumber();
                System.out.print("��������˵��:");
                mark=Utility.readString();
                if (balance>money){
                balance-=money;
                details+=("֧��\t"+balance+"\t"+money+"\t"+mark+"\n");
                System.out.println("----------------�Ǽ����-----------------");
                }else {
                    System.out.println("�˻����㣬����������");
                }

                break;
            case '4':
                System.out.print("�Ƿ�ȷ���˳�(Y/N):");
                char isExit=Utility.readConfirmSelection();
                if (isExit=='Y'){
                    isFlag=false;
                }
                break;

            }


        }
    }




    public static void main(String[] args) {
        FamilyAccount familyAccount=new FamilyAccount();
        familyAccount.familyAccountTest();

    }
}
