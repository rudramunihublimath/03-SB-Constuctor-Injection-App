package com.io.SBConstuctorInjectionApp.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDao {
    public ReportDao() {
        System.out.println("Report Constructor..");
    }
}
