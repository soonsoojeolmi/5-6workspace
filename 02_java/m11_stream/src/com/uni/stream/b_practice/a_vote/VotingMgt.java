package com.uni.stream.b_practice.a_vote;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
class VotingMgt {
    private final List<Candidate> candidates;  // 후보 목록 리스트
    private final Scanner scanner;

    public VotingMgt(ArrayList<String> candidateNames) {
        // 주어진 이름을 가진 후보들을 리스트로 초기화
        candidates = candidateNames.stream()
                .map(Candidate::new)
                .collect(Collectors.toList());
        scanner = new Scanner(System.in);
    }

    // 투표를 시작하는 메서드
    public void startVoting() {
        boolean running = true;

        while (running) {
            System.out.println("투표할 후보 이름을 입력하세요 (" +
                    candidates.stream()
                            .map(Candidate::getName)
                            .collect(Collectors.joining(", ")) +
                    ") 또는 '그만'을 입력해 종료:");
            String input = scanner.nextLine();

            if (input.equals("그만")) {
                running = false;  // '그만'을 입력하면 투표 종료
            } else {
                processVote(input);
            }
        }

        // 투표 결과 출력
        printResults();
    }

    // 투표 처리 메서드
    private void processVote(String input) {
        // 입력된 이름에 해당하는 후보에게 투표
         candidates.stream()
                .filter(candidate -> candidate.getName().equals(input))
                .findFirst()
                 .ifPresentOrElse(candidate -> {
                     candidate.addVote();
                     System.out.println(candidate.getName() + "에게 투표했습니다!");
                 }, () -> System.out.println("잘못된 입력입니다. 다시 입력해주세요."));
    }

    // 투표 결과를 출력하는 메서드
    private void printResults() {
        System.out.println("\n최종 득표 결과:");

        // 후보들을 득표수 기준으로 정렬
        List<Candidate> sortedCandidates = candidates.stream()
                .sorted(Comparator.comparingInt(Candidate::getVotes).reversed())
                .toList();

        int totalVotes = sortedCandidates.stream()
                .mapToInt(Candidate::getVotes)
                .sum();

        // 득표 결과 출력
        int rank = 1;
        for (Candidate candidate : sortedCandidates) {
            System.out.println(rank + "등: " + candidate.getName() + " - 득표수: " + candidate.getVotes());
            rank++;
        }

        System.out.println("총 득표수: " + totalVotes + "표");

        // 최다 득표자 출력
        if (totalVotes > 0) {
            int maxVotes = sortedCandidates.get(0).getVotes();
            List<String> topCandidates = sortedCandidates.stream()
                    .filter(candidate -> candidate.getVotes() == maxVotes)
                    .map(Candidate::getName)
                    .collect(Collectors.toList());

            if (topCandidates.size() == 1) {
                System.out.println("가장 많은 표를 받은 후보: " + topCandidates.get(0));
            } else {
                System.out.println("가장 많은 표를 받은 후보들: " + String.join(", ", topCandidates));
            }
        } else {
            System.out.println("투표가 이루어지지 않았습니다.");
        }
    }
}
