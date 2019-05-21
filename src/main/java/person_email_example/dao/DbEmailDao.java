package person_email_example.dao;

import person_email_example.entity.Email;

public class DbEmailDao extends DbDao<Email> implements EmailDao {
    @Override
    protected String generateInsertQuery(Email email) {
        return null;
    }

    @Override
    protected String generateUpdateQuery(Email email) {
        return null;
    }

}
