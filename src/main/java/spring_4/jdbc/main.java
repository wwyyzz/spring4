package spring_4.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-jdbc.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate)ctx.getBean("jdbcTemplate");

//        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
//        System.out.println(dataSource.getConnection());

        //UPDATE
        String sql1 = "UPDATE employees SET last_name = ? WHERE id = ?";
        jdbcTemplate.update(sql1, "Jack", 4);

        //batchUPDATE
        String sql2 = "INSERT INTO employees(last_name, email, dept_id) VALUES(?,?,?)";
        List<Object[]> batchArgs = new ArrayList<Object[]>();

        batchArgs.add(new Object[]{"AA", "aa@163.com", 1});
        batchArgs.add(new Object[]{"BB", "bb@163.com", 2 });
        batchArgs.add(new Object[]{"CC", "cc@163.com", 3});
        jdbcTemplate.batchUpdate(sql2, batchArgs);

        //SELECT
        String sql3 = "SELECT id, last_name last_Name, email , dept_id as 'department.id' FROM employees WHERE id = ?";

        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
        Employee employee = jdbcTemplate.queryForObject(sql3, rowMapper,1);

        System.out.println(employee);

        //

        String sql4 = "SELECT id, last_name last_Name, email , dept_id as 'department.id' FROM employees WHERE id > ?";

        RowMapper<Employee> rowMapper2 = new BeanPropertyRowMapper<Employee>(Employee.class);
        List<Employee> employee2 = jdbcTemplate.query(sql4, rowMapper2,5);

        System.out.println(employee2);

        //count()
        String sql5 = "SELECT COUNT(id) FROM employees";
        long count = jdbcTemplate.queryForObject(sql5, Long.class);

        System.out.println("count =" + count);


        //
        NamedParameterJdbcTemplate namedParameterJdbcTemplate =
                (NamedParameterJdbcTemplate)ctx.getBean("namedParameterJdbcTemplate");

        String sql6 = "INSERT INTO employees(last_name, email, dept_id) VALUES(:ln,:email,:deptid)";
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("ln", "FF");
        paramMap.put("email", "ff@163.com");
        paramMap.put("deptid", "2");

        namedParameterJdbcTemplate.update(sql6, paramMap);

        //
        String sql7 =
                "INSERT INTO employees(last_name, email) VALUES(:lastName,:email)";
        Employee employee1 = new Employee();
        employee1.setLastName("XYZ");
        employee1.setEmail("xyz@163.com");

        SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(employee1);
        namedParameterJdbcTemplate.update(sql7, parameterSource);

    }
}
