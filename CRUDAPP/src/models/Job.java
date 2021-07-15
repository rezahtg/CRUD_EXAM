/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author haikal
 */
public class Job {
    private String idJob;
    private String titleJob;
    private int job_minSalary;
    private int job_maxSalary;

    public String getIdJob() {
        return idJob;
    }

    public void setIdJob(String idJob) {
        this.idJob = idJob;
    }

    public String getTitleJob() {
        return titleJob;
    }

    public void setTitleJob(String titleJob) {
        this.titleJob = titleJob;
    }

    public int getJob_minSalary() {
        return job_minSalary;
    }

    public void setJob_minSalary(int job_minSalary) {
        this.job_minSalary = job_minSalary;
    }

    public int getJob_maxSalary() {
        return job_maxSalary;
    }

    public void setJob_maxSalary(int job_maxSalary) {
        this.job_maxSalary = job_maxSalary;
    }

    @Override
    public String toString() {
        return "Job{" + "idJob=" + idJob + ", titleJob=" + titleJob + ", job_minSalary=" + job_minSalary + ", job_maxSalary=" + job_maxSalary + '}';
    }
    
    
}
