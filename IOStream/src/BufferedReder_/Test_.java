package BufferedReder_;

public class Test_ {
    public static void main(String[] args){
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());//调用实现类[动态绑定]
        bufferedReader_.read();
    }
}
