package shop.watchawiki.api.PreSubject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreSubjectVO {

    private int preSubCode; 	// 지난 학기 수강한 과목코드
    private String preSubName;	// 지난 학기 수강한 과목명

    public PreSubjectVO() {}
}
