import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Book> list = new ArrayList<>();

    public static void main(String[] args) {
        readData();
        Scanner scanner = new Scanner(System.in);
//        1.设计页面

        while (true) {
            System.out.println("+++++++++++++++++图书馆数据+++++++++++++++++");
            System.out.println("1 插入数据");
            System.out.println("2 修改数据");
            System.out.println("3 查询数据");
            System.out.println("4 删除数据");
            System.out.println("其它任意键退出系统");
            String str  = scanner.nextLine();
//            2.设计功能
            switch (str){
                case "1":
                    insertBook(scanner);
                    break;
                case "2":
                    modifyBook(scanner);
                    break;
                case "3":
                    showBook();
                    break;
                case "4":
                    deleteBook( scanner);
                    break;
                default:
                    scanner.close();
                    saveDat();
                    return;
            }
        }
    }

//    3.设计插入功能，插入具体信息
    private static void insertBook(Scanner scanner){
        Book book  =new Book();
        book
                .name(scanner.nextLine())
                .author(scanner.nextLine())
                .price(scanner.nextDouble());
        scanner.nextLine();
//          4.图书需要列表专门存放信息容器，List
        list.add(book);
//        list.add(new Book().name(scanner.nextLine()).author(scanner.nextLine()).price(scanner.nextDouble());
    }
    //5.查询 列表方法
    private static  void showBook(){
        list.forEach((k)->{
            int i = 0;
            System.out.println(i+"."+k);});//println会调用Book类中的toString方法。需要在BOok中重写此方法

    }
    //6.删除书籍
    public static void deleteBook(Scanner scanner){
        int i =0;
        for (Book book:list){
            System.out.println(i+"."+book);
            i++;
        }
        int index = scanner.nextInt();
        if (index >=list.size()) System.out.println("错误序号");
        else list.remove(index);
        scanner.nextLine();
    }
    //7、修改信息
    public static void modifyBook(Scanner scanner){
        int i =0;
        for (Book book:list){
            System.out.println(i+"."+book);
            i++;
        }
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index >=list.size()) System.out.println("错误序号");
        else {
            list
                    .get(index)
                    .name(scanner.nextLine())
                    .author(scanner.nextLine())
                    .price(scanner.nextDouble());}
        scanner.nextLine();
    }
    //8.保存数据
    public static void saveDat(){
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("data"));) {
            outputStream.writeObject(list);//保存对象需要实现序列化接口
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readData(){
        File fie = new File("data");
        if (fie.exists()){
            try(ObjectInputStream outputStream = new ObjectInputStream(new FileInputStream("data"));) {
                list = (List<Book>) outputStream.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }else list  = new ArrayList<>();


    }
    //构造输入的书本信息
    private static class Book implements Serializable{
        String name;
        String author;
        transient double price;

/*    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }//正常写法，还可以用链式写法来写入相关信息*/
        public Book name(String name){
            this.name = name;
            return this;
        }
        public Book author(String author){
            this.author = author;
            return this;
        }
        public Book price(double price){
            this.price = price;
            return this;
        }

        @Override
        public String toString() {
            return "书籍{" +
                    "名称='" + name + '\'' +
                    ", 作者='" + author + '\'' +
                    ", 价格=" + price +
                    '}';
        }
    }
}