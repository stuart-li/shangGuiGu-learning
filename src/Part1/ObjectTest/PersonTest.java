package Part1.ObjectTest;

/**
 * һ������࣬��ʵ���������ĳ�Ա
 *      ����=��Ա����=field=���ֶ�
 *      ����=��Ա����=����=method
 *
 *      ������Ķ���=���ʵ����=ʵ������
 *
 * ������Ͷ����ʹ�ã��������˼����ص�ʵ��
 *  1�������ࡢ�����ĳ�Ա��
 *  2��������Ķ���
 *  3��ͨ��������.���ԡ����ߡ�����.���������ö���Ľṹ
 *
 * */
//������
public class PersonTest {
    public static void main(String[] args) {
        //����Person��Ķ���
        Person person=new Person();

        //���ö���Ľṹ�����ԡ�����
        //���ö�������ԣ�����.����
        person.name="Tom";
        System.out.println(person.name);


//        Scanner scanner=new Scanner(System.in);
//        System.out.print("������һ�����֣�");
//        int bc=scanner.nextInt();
        //���ö���ķ���������.����
        person.run(8);
        person.eat();
    }
}

    //Person��
    class Person{

        //����
        String name;
        int age=19;
        boolean isMale;

        //����
        public void eat(){
            System.out.println("��϶���һ����Ի�");
        }

        public void run(int bc){
            if (bc>10){
                System.out.println("ţƤ");
            }else{
                System.out.println("������");
            }

            System.out.println(age+"\t"+bc);
            return ;
        }

    }


