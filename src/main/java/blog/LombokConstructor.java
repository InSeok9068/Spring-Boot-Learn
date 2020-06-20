package blog;

import javax.validation.constraints.NotNull;

public class LombokConstructor {
	
	@NotNull
	private String var1;
	
	private String var2;
	
	private String var3;
	
	// @NoArgsConstructor
	public LombokConstructor() {
		
	}
	
	// @RequiredArgsConstructor
	public LombokConstructor(String var1, String var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	
	// @AllArgsConstructor
	public LombokConstructor(String var1, String var2, String var3) {
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}
}
