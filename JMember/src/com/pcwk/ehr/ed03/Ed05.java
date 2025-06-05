/**
 * 파일명:Ed05.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class Ed05 {

	public static void main(String[] args) {
		String  data = "1,Alice,80,90,95|2,Bob,80,90,95|3,Charlie,80,90,95";
		
		String [] student = data.split("\\|");
		String[][] studentArray = new String[student.length][];
		for (int i = 0; i < student.length; i++) {
        
            studentArray[i] = student[i].split(",");
        }
		try (Writer  writer  = new FileWriter("student_array.txt");) {

			for (String[] s : studentArray) {
                writer.write(Arrays.toString(s) + "\n");
            }
		

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (BufferedReader reader =  new BufferedReader(new FileReader("student_array.txt"));){
			String line;
			while((line= reader.readLine())!=null) {
				//System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		int Ktotal = 0; //국어 총점
		int etotal = 0; //영어 총점
		int stotal = 0; //수학 총점
		
		System.out.println("번호    이름        국어      영어     수학    총점      평균");
		System.out.println("======================================================");
		
		for (int i = 0; i < studentArray.length; i++) {
			int subTotal = 0; // 개인별 총점
			double subAvg = 0.0d;// 개인별 평균
			
			int no = Integer.parseInt(studentArray[i][0]);
			String name = studentArray[i][1];
			int kor = Integer.parseInt(studentArray[i][2]);
            int eng = Integer.parseInt(studentArray[i][3]);
            int math = Integer.parseInt(studentArray[i][4]);
		
            subTotal = kor + eng + math;
            subAvg = subTotal / 3.0;
			
            Ktotal += kor;
            etotal += eng;
            stotal += math;
            
            System.out.printf("%-6d %-7s %5d %7d %7d %7d %8.1f%n", no, name, kor, eng, math, subTotal, subAvg);
		}
		
		
		
	}

}
