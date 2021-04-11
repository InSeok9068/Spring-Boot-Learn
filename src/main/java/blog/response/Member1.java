package blog.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
public class Member1 extends CommonRes{
    private String name;

    private int age;
}
