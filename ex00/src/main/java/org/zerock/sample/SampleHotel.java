package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

// 필드 주입 / 세터 주입 / 생성자 주입
@Component
@ToString
//@AllArgsConstructor		// 단일 생성자 주입
@RequiredArgsConstructor	// final 생성자 주입
public class SampleHotel {

//	private Chef chef;
	private final Chef chef;	// final 생성자 주입

// 생성자 주입
//	public SampleHotel(Chef chef) {
//		super();
//		this.chef = chef;
//	}	
	
}
