/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Job;

/**
 *
 * @author haikal
 */
public class JobDAO {
     private Connection connection;

    public JobDAO(Connection connection) {
        this.connection = connection;
    }
    public boolean insert(Job insertJob) {
        boolean result = false;
        String query = "INSERT INTO JOBS(job_id, job_title, min_salary, max_salary) VALUES(?,?,?,?)  ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, insertJob.getIdJob());
            preparedStatement.setString(2, insertJob.getTitleJob());
            preparedStatement.setInt(3, insertJob.getJob_minSalary());
            preparedStatement.setInt(4, insertJob.getJob_maxSalary());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
}
    public boolean update(Job updateJob) {
        boolean result = false;
        String query = "UPDATE JOBS set job_title=?,  min_salary=?,  max_salary=?  WHERE job_id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, updateJob.getTitleJob());
            preparedStatement.setInt(2, updateJob.getJob_minSalary());
            preparedStatement.setInt(3, updateJob.getJob_maxSalary());
            preparedStatement.setString(4, updateJob.getIdJob());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }  
    public boolean delete(Job deleteJob) {
        boolean result = false;
        String query = "DELETE FROM JOBS WHERE job_id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, deleteJob.getIdJob());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
     public List<Job> getAJobs() {
        List<Job> jobs = new ArrayList<Job>();
        String query = "SELECT * FROM JOBS";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Job j = new Job();
                j.setIdJob(resultSet.getString(1));
                j.setTitleJob(resultSet.getString(2));
                j.setJob_minSalary(resultSet.getInt(3));
                j.setJob_maxSalary(resultSet.getInt(4));
                jobs.add(j);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jobs;
    } 
}
