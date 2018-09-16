package csvProjects.read.exe3.model;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class QsSafeTc40InFirstStep {
    private String SOURCE_FILE;
    private int numRow;
    //DATA_INS= sourceDate in DB
    private LocalDate sourceDate;
    private String ESERCENTE ;
    private String CITTA;
    private String MCC ;
    private String TIPO_FRODE;
    private double AMOUNT;
    private String ICA;
    private String ISSUER_BIN;
    private Date DATA_MOVI;
    private String PAN;
    // Ther is no in qs_safe_tc40_in below
    private String seqnum;
    private String FILM;
    private String POS_ENTRY_MODE;
    private String SECUR_CODE;
    private String CARD_PRESENT_IND;
    private String CH_PRESENT;
    private String POS_TYPE;
    private String TERM_CAT;
    private String COD_ESER;
    private BigDecimal COD_SCARTO;
    private BigDecimal ELABORATO;
    private LocalDate DATA_ABB;
    private String USER_ABB;

    public String getSOURCE_FILE() {
        return SOURCE_FILE;
    }

    public void setSOURCE_FILE(String SOURCE_FILE) {
        this.SOURCE_FILE = SOURCE_FILE;
    }

    public int getNumRow() {
        return numRow;
    }

    public void setNumRow(int numRow) {
        this.numRow = numRow;
    }

    public LocalDate getSourceDate() {
        return sourceDate;
    }

    public void setSourceDate(LocalDate sourceDate) {
        this.sourceDate = sourceDate;
    }

    public String getESERCENTE() {
        return ESERCENTE;
    }

    public void setESERCENTE(String ESERCENTE) {
        this.ESERCENTE = ESERCENTE;
    }

    public String getCITTA() {
        return CITTA;
    }

    public void setCITTA(String CITTA) {
        this.CITTA = CITTA;
    }

    public String getMCC() {
        return MCC;
    }

    public void setMCC(String MCC) {
        this.MCC = MCC;
    }

    public String getTIPO_FRODE() {
        return TIPO_FRODE;
    }

    public void setTIPO_FRODE(String TIPO_FRODE) {
        this.TIPO_FRODE = TIPO_FRODE;
    }

    public double getAMOUNT() {
        return AMOUNT;
    }

    public void setAMOUNT(double AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    public String getICA() {
        return ICA;
    }

    public void setICA(String ICA) {
        this.ICA = ICA;
    }

    public String getISSUER_BIN() {
        return ISSUER_BIN;
    }

    public void setISSUER_BIN(String ISSUER_BIN) {
        this.ISSUER_BIN = ISSUER_BIN;
    }

    public Date getDATA_MOVI() {
        return DATA_MOVI;
    }

    public void setDATA_MOVI(Date DATA_MOVI) {
        this.DATA_MOVI = DATA_MOVI;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }

    public String getSeqnum() {
        return seqnum;
    }

    public void setSeqnum(String seqnum) {
        this.seqnum = seqnum;
    }

    public String getFILM() {
        return FILM;
    }

    public void setFILM(String FILM) {
        this.FILM = FILM;
    }

    public String getPOS_ENTRY_MODE() {
        return POS_ENTRY_MODE;
    }

    public void setPOS_ENTRY_MODE(String POS_ENTRY_MODE) {
        this.POS_ENTRY_MODE = POS_ENTRY_MODE;
    }

    public String getSECUR_CODE() {
        return SECUR_CODE;
    }

    public void setSECUR_CODE(String SECUR_CODE) {
        this.SECUR_CODE = SECUR_CODE;
    }

    public String getCARD_PRESENT_IND() {
        return CARD_PRESENT_IND;
    }

    public void setCARD_PRESENT_IND(String CARD_PRESENT_IND) {
        this.CARD_PRESENT_IND = CARD_PRESENT_IND;
    }

    public String getCH_PRESENT() {
        return CH_PRESENT;
    }

    public void setCH_PRESENT(String CH_PRESENT) {
        this.CH_PRESENT = CH_PRESENT;
    }

    public String getPOS_TYPE() {
        return POS_TYPE;
    }

    public void setPOS_TYPE(String POS_TYPE) {
        this.POS_TYPE = POS_TYPE;
    }

    public String getTERM_CAT() {
        return TERM_CAT;
    }

    public void setTERM_CAT(String TERM_CAT) {
        this.TERM_CAT = TERM_CAT;
    }

    public String getCOD_ESER() {
        return COD_ESER;
    }

    public void setCOD_ESER(String COD_ESER) {
        this.COD_ESER = COD_ESER;
    }

    public BigDecimal getCOD_SCARTO() {
        return COD_SCARTO;
    }

    public void setCOD_SCARTO(BigDecimal COD_SCARTO) {
        this.COD_SCARTO = COD_SCARTO;
    }

    public BigDecimal getELABORATO() {
        return ELABORATO;
    }

    public void setELABORATO(BigDecimal ELABORATO) {
        this.ELABORATO = ELABORATO;
    }

    public LocalDate getDATA_ABB() {
        return DATA_ABB;
    }

    public void setDATA_ABB(LocalDate DATA_ABB) {
        this.DATA_ABB = DATA_ABB;
    }

    public String getUSER_ABB() {
        return USER_ABB;
    }

    public void setUSER_ABB(String USER_ABB) {
        this.USER_ABB = USER_ABB;
    }
}
