package csvProjects.read.exe3;

import csvProjects.read.exe3.repository.QsDAO;
import csvProjects.read.exe3.repository.imp.QsDAOImpl;

import java.text.ParseException;

public class MainCountry {
    public static void main(String[] args) throws ParseException {

        int loadQsSafeTc40InCup = 0;
        QsDAO qsDAO = new QsDAOImpl();
        loadQsSafeTc40InCup = qsDAO.loadQsSafeTc40InCup();

    }
}
