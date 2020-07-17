package blog;

import com.google.gson.Gson;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DeepCopyTest {
	public static void main(String[] args) {
//		DeepCopy deepCopy1 = new DeepCopy();
//		
//		deepCopy1.setNumber(10);
//		
//		log.info("deepCopy1 : {}", deepCopy1.getNumber());
//		
//		DeepCopy deepCopy2 = new DeepCopy();
//		
//		// 복사
//		deepCopy2 = deepCopy1;
//		
//		deepCopy2.setNumber(20);
//		
//		log.info("deepCopy1 : {}", deepCopy1.getNumber());
//		log.info("deepCopy2 : {}", deepCopy2.getNumber());
		
		DeepCopy deepCopy1 = new DeepCopy();
		
		deepCopy1.setNumber(10);
		
		log.info("deepCopy1 : {}", deepCopy1.getNumber());
		
		// 직렬화 후 역직렬화를 통해 복사
		DeepCopy deepCopy2 = new Gson().fromJson(new Gson().toJson(deepCopy1), DeepCopy.class);
		
		deepCopy2.setNumber(20);
		
		log.info("deepCopy1 : {}", deepCopy1.getNumber());
		log.info("deepCopy2 : {}", deepCopy2.getNumber());
		
	}
}

@Getter
@Setter
class DeepCopy {
	private int number;
}

