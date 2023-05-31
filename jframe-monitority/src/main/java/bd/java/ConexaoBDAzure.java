/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd.java;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.Connection;

/**
 *
 * @author Gabriel Kohatu
 */
public class ConexaoBDAzure {
    
    private JdbcTemplate conexaoDoBanco;
    
    public ConexaoBDAzure() {

        BasicDataSource dataSource = new BasicDataSource();

        dataSource​.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");


        dataSource​.setUrl("jdbc:sqlserver://svr-projeto-monitority.database.windows.net:1433;database=bd-projeto-monitority;encryp\n" +
"t=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;");

        dataSource​.setUsername("admin-projeto-monitority");

        dataSource​.setPassword("#Gfgrupo9");

        this.conexaoDoBanco = new JdbcTemplate(dataSource);

    }

    public JdbcTemplate getConexaoDoBancoAzure() {

        return conexaoDoBanco;

    }
}
