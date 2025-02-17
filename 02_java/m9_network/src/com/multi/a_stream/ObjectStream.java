package com.multi.a_stream;

import java.io.*;

public class ObjectStream {
    //객체 단위로 입출력을 하기 위한 ObjectInputStream/ObjectOutputStream
    //  직렬화(Serialization) & 역직렬화(Deserialization)
//  객체를 바이트 데이터로 변환하고 다시 복원하는 과정
//  객체(Person)
//   ↓ (직렬화: implements Serializable 필요)
//  바이트 스트림 (object.bin)
//   ↓ (역직렬화)
//  객체(Person)


//  바이트 스트림 (person.bin) ↓ (역직렬화시도시 에러 발생가능 )
//
//   ↓ (클래스 수정: 필드 추가/삭제)
//         InvalidClassException 발생 (클래스 버전 불일치)
//
//   ↓ (파일 손상됨)
//         StreamCorruptedException 발생 (파일이 올바른 직렬화 데이터가 아님)
//
//   ↓ (클래스가 없음)
//         ClassNotFoundException 발생 (해당 클래스를 찾을 수 없음)


//  역직렬화(Deserialization) 과정에서 여러 가지 오류가 발생
//  특히 클래스 구조 변경, 파일 손상, serialVersionUID 불일치 등의 이유로 문제가 생김
//  serialVersionUID를 설정하면 클래스 변경 후에도 역직렬화가 가능
//  객체를 파일로 저장하거나, 네트워크를 통해 전송할 때 반드시 implements Serializable을 추가 해야함

    public void fileSave(){
        Phone ph = new Phone("삼성", 2000);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt"))){
            oos.writeObject(ph);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void fileOpen(){
        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream("phone.txt"))){
            Phone ph = (Phone)oos.readObject();

            System.out.println(ph);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
