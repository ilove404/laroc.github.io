package BufferedReder_;

public class BufferedReader_ extends Reader_{
    private Reader_ reader_;

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    @Override
    public void read() {
        reader_.read();
    }
/*
    public void readerFile_() {
        reader_.readerFile_();
    }

    public void readerString() {
        reader_.readerString();
    }*/
}
