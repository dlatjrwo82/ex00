package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//Setter 주입
//생성자 주입
//필드 주입

@Component
@ToString
//@AllArgsConstructor		// 생성자 주입
@RequiredArgsConstructor	// final 필드 자동 주입
public class Restaurant {
	
//	@Setter(onMethod_ = {@Autowired})		// Setter DI
	
//	@Autowired								// 필드 DI
//	private Chef chef;
	private final Chef chef;

}
