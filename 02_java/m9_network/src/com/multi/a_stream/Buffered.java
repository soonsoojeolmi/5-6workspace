package com.multi.a_stream;

import java.io.*;

public class Buffered {
    /* java.io 패키지의 입출력 스트림은 기본 스트림과 필터 스트림으로 분류할 수 있다.
     * 기본 스트림은 외부 데이터에 직접 연결되는 스트림이고
     * 필터스트림은 외부 데이터에 직접 연결하는 것이 아니라 기본 스트림에 추가로 사용할 수 있는 스트림이다.
     * 주로 성능을 향상시키는 목적으로 사용되며 생성자를 보면 구분이 가능하다.
     * 생성자쪽에 매개변수로 다른 스트림을 이용하는 클래스는 필터스트림이라고 볼 수 있다.
     *  */

    /* 버퍼를 이용해서 성능 향상을 시키는 보조스트림
     * BufferedWriter/BufferedReader */
//1. 기반스트림 생성 (어떤 외부매체와 데이터를 주고받을 것이냐를 선택해주는 메인(기반) 스트림이 반드시 필요.
//2. 보조스트림생성(위에서 만들어진 기반스트림의 성능 좀 더 향상시키고자 함) ,매개변수로 기반스트림을 사용

    public void fileSave(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("buffer.txt"))){
            bw.write("안녕하세요");
            bw.newLine();
            bw.write("안녕하세요 \n");


            bw.write("안녕하세요");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void fileOpen(){
        try(BufferedReader bw = new BufferedReader(new FileReader("buffer.txt"))){
            System.out.println(bw.readLine());
            System.out.println(bw.readLine());
            System.out.println(bw.readLine());
            System.out.println(bw.readLine());

            String temp;
            while((temp=bw.readLine())!=null){
                System.out.println(temp);
            }

        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
