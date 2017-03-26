package com.shop.ecommerce;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationCore.class)
public class ApplicationCoreTest {
	@Autowired
	DataSource dataSource;
	
	@Test
	public void testDummy() throws SQLException{
		String schema = dataSource.getConnection().getCatalog();
		assertEquals("shop", schema);
	}
}
