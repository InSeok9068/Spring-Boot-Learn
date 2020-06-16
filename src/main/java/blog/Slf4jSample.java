package blog;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Slf4jSample {
	
	public static void main(String[] args) {
		
		String value1 = "1번값";
		String value2 = "2번값";
		
		if(log.isDebugEnabled()){
			log.info("---------- Log 테스트 ---------");
			log.info("1번의 값은 : "+value1 + " 2번의 값은 : "+value2);
			log.info("1번의 값은 : {} 2번의 값은 : {}", value1, value2);
		}
	}
}
