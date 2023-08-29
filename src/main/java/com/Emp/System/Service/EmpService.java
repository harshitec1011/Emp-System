package com.Emp.System.Service;

import com.Emp.System.Entity.Employee;
import com.Emp.System.Repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    private EmpRepo repo;

    public void addEmp(Employee e){
        repo.save(e);
    }

    public List<Employee> getAllEmp(){
       return repo.findAll();
    }
    public Employee getEmpById(int id){
        Optional<Employee> e=repo.findById(id);
        if(e.isPresent()){
            return e.get();
        }
        return null;
    }
    public void deleteEmp(int id){
        repo.deleteById(id);
    }
}
