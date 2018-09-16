package csvProjects.read.exe3;

import csvProjects.read.exe3.repository.QsSafeTc40DAO;
import csvProjects.read.exe3.repository.imp.QsSafeTc40DAOImpl;

import java.text.ParseException;

public class MainCountry {
    public static void main(String[] args) throws ParseException {

        int loadQsSafeTc40InCup = 0;
        QsSafeTc40DAO qsSafeTc40DAO = new QsSafeTc40DAOImpl();
        loadQsSafeTc40InCup = qsSafeTc40DAO.loadQsSafeTc40InCup();

    }
}
