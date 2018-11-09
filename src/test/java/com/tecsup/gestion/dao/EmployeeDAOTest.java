package com.tecsup.gestion.dao;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Employee;
import com.tecsup.gestion.repository.EmployeeDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
@WebAppConfiguration
public class EmployeeDAOTest {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOTest.class);

	@Autowired
	private EmployeeDAO employeeDAO;

	@Test
	public void testFindEmployeeById() {

		try {
			//
			Employee emp = employeeDAO.findEmployee(100);
			logger.info(emp.toString());
		} catch (EmptyResultException e) {
			e.printStackTrace();
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}

	}
}
