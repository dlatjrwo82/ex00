package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

// org.zorock.mapper.TimeMapper.getTime2

public interface TimeMapper {
	
	// sql문 어노테이션 사용 방식
	// 세미콜론(;) 없어야 함
	@Select("select sysdate from dual")
	String getTime();
	
	
	// sql문 xml + 어노테이션 사용 방식
	String getTime2();	
	
}
