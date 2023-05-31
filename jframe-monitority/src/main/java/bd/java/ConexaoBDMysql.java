/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd.java;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Gabriel Kohatu
 */
public class ConexaoBDMysql {
     private JdbcTemplate conexaoDoBanco;
    
    public ConexaoBDMysql() {

        BasicDataSource dataSource = new BasicDataSource();

        dataSource​.setDriverClassName("com.mysql.cj.jdbc.Driver");

        dataSource​.setUrl("jdbc:mysql://LocalHost:3306/banco1?useTimezone=true&serverTimezone=UTC");

        dataSource​.setUsername("root");

        dataSource​.setPassword("urubu100");

        this.conexaoDoBanco = new JdbcTemplate(dataSource);

    }

    public JdbcTemplate getConexaoDoBancoMysql() {

        return conexaoDoBanco;

    }
}
