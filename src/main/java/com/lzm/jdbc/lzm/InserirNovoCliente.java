package com.lzm.jdbc.lzm;

import com.lzm.jdbc.lzm.configuration.DB;
import com.lzm.jdbc.lzm.dao.ClienteDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class InserirNovoCliente {
    public static void main(String[] args) throws SQLException{
        try(Connection connection = DB.getConnection()) {
            ClienteDAO clienteDAO = new ClienteDAO (connection);
            clienteDAO.inserirNovoCliente("Leonardo");
        }
    }
}
