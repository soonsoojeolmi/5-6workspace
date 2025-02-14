package com.multi.collection.b_detail.List;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        int size = list.size();
        System.out.println(size);

        Board b2 = list.get(2);
        System.out.println(b2.getSubject() + b2.getContent());

        // for
        for (int i = 0; i < list.size(); i++) {
            Board board = list.get(i);
            System.out.println(board.getSubject() + " | " + board.getContent() + " | " + board.getWriter());
        }

        // foreach
        for (Board board : list) {
            System.out.println(board.getSubject() + " | " + board.getContent() + " | " + board.getWriter());
        }

        // 객체 2개 삭제
        list.remove(2); // 인덱스 2 삭제
        list.remove(3 - 1); // 원소가 삭제되면서 인덱스가 당겨지므로 다시 3이 아니라 2를 삭제해야 함

        Board b3 = list.get(2);
        System.out.println(b2.getSubject() + b3.getContent());
    }
}
