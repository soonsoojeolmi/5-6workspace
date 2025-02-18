package com.uni.stream.b_practice.a_vote;


class Candidate {
    private final String name;  // 후보 이름
    private int votes;    // 후보의 득표수

    public Candidate(String name) {
        this.name = name;
        this.votes = 0;  // 초기 득표수는 0
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    public void addVote() {
        votes++;
    }
}
