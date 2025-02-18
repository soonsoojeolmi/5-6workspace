package com.uni.stream.b_practice.a_vote;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 후보들의 이름을 리스트로 전달
        ArrayList<String> candidateNames = new ArrayList<>();
        candidateNames.add("제니");
        candidateNames.add("사나");
        candidateNames.add("카리나");
        candidateNames.add("안유진");

        // 투표 시스템 생성 및 시작
        VotingMgt votingMgt = new VotingMgt(candidateNames);
        votingMgt.startVoting();
    }
}
