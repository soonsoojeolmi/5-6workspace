package com.multi.a_stream;

public class Run {
    public static void main(String[] args) {
//        Buffered bf = new Buffered();
//        bf.fileSave();
//        bf.fileOpen();

//        DataStream ds = new DataStream();
//        ds.fileSaveOpen();

//        ObjectStream os = new ObjectStream();
//        os.fileSave();
//        os.fileOpen();

        ObjectsStream os = new ObjectsStream();
        os.fileSave();
        os.fileOpen();
    }
}
