package blog.response;

import lombok.Data;

@Data
public class CommonGenericRes<T> {
	private int resCode;

	private String resMsg;
	
	private T resObj;
}
