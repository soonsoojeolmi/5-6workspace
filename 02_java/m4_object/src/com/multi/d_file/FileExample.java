package com.multi.d_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {
	public static void main(String[] args) throws Exception {
		Path path = Paths.get("src/com/multi/d_file/FileExample.java");
		System.out.println("디렉토리 여부: " + Files.isDirectory(path));
		System.out.println("파일 여부: " + Files.isRegularFile(path));
		System.out.println("마지막 수정 시간: " + Files.getLastModifiedTime(path));
		System.out.println("파일 크기: " + Files.size(path));
		System.out.println("소유자: " + Files.getOwner(path).getName());
		System.out.println("숨김 파일 여부: " + Files.isHidden(path));
		System.out.println("읽기 가능 여부: " + Files.isReadable(path));
		System.out.println("쓰기 가능 여부: " + Files.isWritable(path));
		System.out.println("[파일명] " + path.getFileName());
		System.out.println("[부모 디렉토리명]: " + path.getParent().getFileName());
		System.out.println("[중첩 경로수]: " + path.getNameCount());

		System.out.println();
		for(int i=0; i<path.getNameCount(); i++) {
			System.out.println(path.getName(i));
		}
		try {
			//디렉토리 및 파일 생성
			Path path1 = Paths.get("file1.txt");
			if(Files.notExists(path1)) { Files.createFile(path1); }
			path1 = Paths.get("dir1");
			if(Files.notExists(path1)) { Files.createDirectories(path1); }
			path1 = Paths.get("dir1/file2.txt");
			if(Files.notExists(path1)) { Files.createFile(path1); }

		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

