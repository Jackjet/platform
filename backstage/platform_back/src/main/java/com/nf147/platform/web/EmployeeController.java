package com.nf147.platform.web;

import com.nf147.platform.dao.EmployeeMapper;
import com.nf147.platform.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/emp")
    public List<Employee> listAll(){
        return employeeMapper.selectAll();
    }
}
