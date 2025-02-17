package com.multi.a_stream;

import java.io.*;

public class DataStream {
    /* 데이터 자료형 별로 처리하는 기능을 추가한 보조스트림을 제공
    byte 단위가 아니고 기본 자료형의 크기로 읽고 쓰기가능
     * DataInputStream/DataOutputStream
     * */

    public void fileSaveOpen() {

        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("a_data.txt"));
                DataInputStream dis = new DataInputStream(new FileInputStream("a_data.txt"))

        ) {
            dos.writeUTF("김원중");
            dos.writeInt(34);
            dos.writeChar('a');
            dos.writeBoolean(true);

            while(true){

                System.out.println(dis.readUTF()+"   "+dis.readInt()+"   "+dis.readChar()+"   "+dis.readBoolean()+"   "+dis.readBoolean());;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch(EOFException e){//파일의 끝을 만났을 때 발생하는 예외
            System.out.println("파일읽기완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

