package blog.enumclass;

import lombok.Getter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
public enum FruitEnum {

    APPLE(){
        @Override
        public String toString() {
            return "사과";
        }
    },
    STRAWBERRY("Strawberry","딸기");

    private String en;
    private String ko;

    FruitEnum(String en, String ko) {
        this.en = en;
        this.ko = ko;
    }

    FruitEnum() {

    }
}
