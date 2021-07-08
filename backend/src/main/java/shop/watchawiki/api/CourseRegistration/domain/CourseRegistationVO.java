package shop.watchawiki.api.CourseRegistration.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseRegistationVO {
        private String subCrriculum; // 교과구분
        private String subCode; // 과목코드
        private String subName; // 강의 명
        private int subCredit; // 이수학점
        private String subTime; // 강의 교시
        private String profName; // 교수 이름
        public static int nowCredit; // 현재 수강 학점

        public static void CourseRegistrationVO(String subCrriculum,String subCode,String subName,int subCredit,String subTime,String profName) {
            this.subCrriculum = subCrriculum;
            this.subCode = subCode;
            this.subName = subName;
            this.subCredit = subCredit;
            this.subTime = subTime;
            this.profName = profName;
        }


}
