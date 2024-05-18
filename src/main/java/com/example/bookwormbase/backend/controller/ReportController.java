package com.example.bookwormbase.backend.controller;

import com.example.bookwormbase.backend.models.Report;
import com.example.bookwormbase.backend.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping("/monthly")
    public Report generateMonthlyReport() {
        return reportService.generateMonthlyReport();
    }
}
