package csvProjects.read.exe3.model;
import java.sql.Timestamp;

public class QsSafeTc40StepLog {
    private String nameStep;
    private String userCod;
    private Timestamp dataLastInsert;

    public String getNameStep() {
        return nameStep;
    }

    public void setNameStep(String nameStep) {
        this.nameStep = nameStep;
    }

    public String getUserCod() {
        return userCod;
    }

    public void setUserCod(String userCod) {
        this.userCod = userCod;
    }

    public Timestamp getDataLastInsert() {
        return dataLastInsert;
    }

    public void setDataLastInsert(Timestamp dataLastInsert) {
        this.dataLastInsert = dataLastInsert;
    }
}
