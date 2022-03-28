import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Pavel �eda (154208)
 *
 */
public class UpdateQueries {

    public UpdateQueries() {}

    /**
     * Template metoda, do kter� se d� vkl�dat libovoln� SQL UPDATE p��kaz.
     *
     * POZN: nen� vhodn� implementovat sv� metody t�mto zp�sobem, daleko vhodn�j�� je implementovat
     * konkr�tn� metody (nap�. updateUserById() pomoc� PreparedStatements, do kter�ch vkl�d�me
     * konkr�tn� parametry)
     *
     * @param updateQuery �et�zec p�edstavuj�c� p��kaz UPDATE
     */
    public void performUpdateQuery(String updateQuery) {
        if (updateQuery == null) {
            throw new NullPointerException("query must not be null!");
        } else if (updateQuery.isEmpty()) {
            throw new IllegalArgumentException("query must not be empty!");
        }
        Connection conn = DBConnection.getDBConnection();
        try (PreparedStatement prStmt = conn.prepareStatement(updateQuery);) {
            int rowsUpdated = prStmt.executeUpdate();
            // System.out.println(rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Dopl�te p��kaz update20PercentOfSalary, tak abyste p�idali dan�mu zam�stnanci 20% jeho platu
     *
     * POZN: Op�t napi�t� SQL p��kaz tak, abyste vyu�ili PreparedStatements (=> p��kaz mus� obsahovat
     * WHERE email = ?)
     *
     * @param email vstupn� parametr, kter� je p�i vol�n� nastaven na hodnotu:
     *        myname@stud.feec.vutbr.cz (jde pouze o uk�zkov� p��klad u u�ivatele, kter� je zanesen v
     *        DB a m� uveden plat)
     */
    public void increase20PercentOfSalary(String email) {
        if (email == null) {
            throw new NullPointerException("email must not be null!");
        } else if (email.isEmpty()) {
            throw new IllegalArgumentException("email must not be empty!");
        }

        SelectQueries sq = new SelectQueries();
        int salary = sq.getUserSalary(email);
        salary = salary+ (salary / 100) * 20;
        Connection conn = DBConnection.getDBConnection();

        String update20PercentOfSalary = "UPDATE user " + "SET salary = " + salary + " WHERE email = ?";

        try (PreparedStatement prStmt = conn.prepareStatement(update20PercentOfSalary);) {
            prStmt.setString(1, email);
            int rowsUpdated = prStmt.executeUpdate();
            // System.out.println(rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}