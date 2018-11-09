package com.tecsup.gestion.repository;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Department;

public interface DepartmentDAO {
	Department findDepartment(int id) throws DAOException, EmptyResultException;
	Department createDepartment(int id, String name, String description, String city) throws DAOException, EmptyResultException;
}
