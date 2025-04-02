package org.example.modules;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Employee {

    private Long employeeId;
    private String firstName;
    private String lastName;
    private LocalDate employmentDate;
    private BigDecimal yearlySalary;
    private PensionPlan pensionPlan;



    public Employee(Long employeeId, String firstName, String lastName, LocalDate employmentDate, BigDecimal yearlySalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.yearlySalary = yearlySalary;
        this.pensionPlan=null;
    }

    public Employee(Long employeeId, String firstName, String lastName, LocalDate employmentDate, BigDecimal yearlySalary,String planReferenceNumber,LocalDate enrollmentDate, BigDecimal monthlyContribution) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.yearlySalary = yearlySalary;
        this.pensionPlan = new PensionPlan(planReferenceNumber,enrollmentDate,monthlyContribution,this);
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public BigDecimal getYearlySalary() {
        return yearlySalary;
    }

    public PensionPlan getPensionPlan(){
        return pensionPlan;
    }

    public void printJson(Employee e){
        StringBuilder sb=new StringBuilder();
        sb.append("{ \n");
        sb.append("firstName : "+ e.getFirstName()+"\n");
        sb.append("lastName : "+e.getLastName()+"\n");
        sb.append("emplyeeDate : "+e.getEmploymentDate()+"\n");
        sb.append("yearlySalary : "+e.getYearlySalary()+"\n");
        if(e.getPensionPlan()!= null){
        sb.append("enrollmentDate : "+ e.getPensionPlan().getEnrollmentDate()+"\n");
        sb.append("monthlyContribution : "+e.getPensionPlan().getMonthlyContribution() +"\n");}
        else{
            sb.append("enrollmentDate : null \n");
            sb.append("monthlyContribution : null \n");
        }
        sb.append("}\n");
        System.out.println(sb.toString());
    }



}
