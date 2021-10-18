package Integracion;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.AssertJUnit;

import entidades.Conexion;

public class BaseDeDatosTest {
	Conexion a = new Conexion();
	String sql;
	Connection conn;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		try {
			conn = a.getConexion();
			AssertJUnit.assertTrue(true);
			conn.getClientInfo();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			AssertJUnit.assertTrue(false);
			fail(e.getMessage());
		}
	}

}
