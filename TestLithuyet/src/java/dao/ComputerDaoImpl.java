/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Computer;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Lab06
 */
public class ComputerDaoImpl implements ComputerDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Computer> GetAll() {

        Session session = sessionFactory.openSession();

        List list = session.createQuery("from Computer").list();

        return list;
    }

    @Override
    public Computer GetComById(int id) {

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("from Computer where ComId=:comid");
        query.setParameter("comid", id);
        Computer computer = (Computer) query.uniqueResult();
        return computer;
    }

}
