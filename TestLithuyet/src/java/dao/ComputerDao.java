/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Computer;
import java.util.List;

/**
 *
 * @author Lab06
 */
public interface ComputerDao {
    public List<Computer> GetAll();
    public Computer GetComById(int id);
}
