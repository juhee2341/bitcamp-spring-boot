package shop.watchawiki.api.Professor.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfessorVO {


    private int professorId;
    private String professorName;

    public ProfessorVO(int professorId, String professorName) {
        super();
        this.professorId = professorId;
        this.professorName = professorName;
    }
}
