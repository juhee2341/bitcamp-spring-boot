package shop.watchawiki.api.Student.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentVO {

    private int stuNum;
    private String stuName;
    private String stuMajor;
    private int stuMaxCredit;


    public StudentVO() {
    }
}
