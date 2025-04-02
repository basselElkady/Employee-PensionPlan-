package org.example.modules;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class PensionPlan {

    private String planReferenceNumber;
    private LocalDate enrollmentDate;
    private BigDecimal monthlyContribution;
    private Employee employee;

    public PensionPlan(String planReferenceNumber,LocalDate enrollmentDate, BigDecimal monthlyContribution, Employee employee) {
        this.planReferenceNumber=planReferenceNumber;
        this.enrollmentDate = enrollmentDate;
        this.monthlyContribution = monthlyContribution;
        this.employee = employee;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public BigDecimal getMonthlyContribution() {
        return monthlyContribution;
    }

    public Employee getEmployee() {
        return employee;
    }
}
