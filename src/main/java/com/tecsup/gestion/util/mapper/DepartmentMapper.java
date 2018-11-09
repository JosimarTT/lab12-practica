package com.tecsup.gestion.util.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.gestion.model.Department;

public class DepartmentMapper implements RowMapper<Department>{
	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		Department emp = new Department();
		emp.setDepartment_id(rs.getInt("department_id"));
		emp.setName(rs.getString("name"));
		emp.setDescription(rs.getString("description"));
		emp.setCity(rs.getString("city"));
		return emp;
	}
}
