package net.javaguides.ems.service;

import net.javaguides.ems.dto.DepartmentDto;
import net.javaguides.ems.dto.EmployeeDto;

import java.util.List;

public interface DepartmentService {
    DepartmentDto createDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentById(Long employeeId);

    List<DepartmentDto> getAllDepartments();
    DepartmentDto updateDepartment(Long employeeId, DepartmentDto updatedDepartment);

    void deleteDepartment(Long departmentId);
}
