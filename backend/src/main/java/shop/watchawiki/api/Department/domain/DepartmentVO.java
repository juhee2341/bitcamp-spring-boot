package shop.watchawiki.api.Department.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentVO {
    private int majorCode;
    private String majorName;
}
