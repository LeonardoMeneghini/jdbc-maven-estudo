package com.lzm.jdbc.lzm;

import com.lzm.jdbc.lzm.configuration.DB;
import com.lzm.jdbc.lzm.dao.ClienteDAO;
import com.lzm.jdbc.lzm.entity.Cliente;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BuscarTodosClientes {
    public static void main(String[] args) throws SQLException{
        try(Connection connection = DB.getConnection()) {
            ClienteDAO clienteDAO = new ClienteDAO(connection);
            List<Cliente> clientes = clienteDAO.buscarTodosClientes();
            System.out.println(clientes);
        }
    }
}
