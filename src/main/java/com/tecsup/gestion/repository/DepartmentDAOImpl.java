package com.tecsup.gestion.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Department;
import com.tecsup.gestion.util.mapper.DepartmentMapper;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO{
	private static final Logger logger = LoggerFactory.getLogger(DepartmentDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Department findDepartment(int department_id) throws DAOException, EmptyResultException {

		String query = "SELECT department_id, name, description, city "
				+ " FROM departments WHERE department_id = ?";

		Object[] params = new Object[] { department_id };

		try {

			Department emp = (Department) jdbcTemplate.queryForObject(query, params, new DepartmentMapper());
			//
			return emp;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	
	public Department createDepartment(int department_id, String name, String description, String city) throws DAOException, EmptyResultException {

		String query = "INSERT INTO departments VALUES (?,?,?,?)";

		Object[] params = new Object[] { department_id, name, description, city };

		try {

			jdbcTemplate.update("INSERT INTO departments VALUES (?,?,?,?)", department_id,name,description,city);
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	
	}
