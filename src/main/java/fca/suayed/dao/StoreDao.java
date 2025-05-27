package fca.suayed.dao;


import fca.suayed.dto.ProductDto;
import fca.suayed.dto.ClientDto;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface StoreDao {

    @RegisterBeanMapper(ProductDto.class)
    @SqlQuery("SELECT * FROM productos")
    List<ProductDto> getProducts();

    @SqlUpdate("INSERT INTO productos (nombre, descripcion, precio, cantidad, sku) VALUES(:p.name, :p.description, :p.price, :p.quantity, :p.sku)")
    void addProduct(@BindBean("p") ProductDto productDto);

    @RegisterBeanMapper(ClientDto.class)
    @SqlQuery("SELECT * FROM clientes")
    List<ClientDto> getClients();

    @SqlUpdate("INSERT INTO clientes (nombre, apellido_paterno, apellido_materno, rfc) VALUES(:p.name, :p.paternal_surname, :p.maternal_surname, :p.rfc)")
    void addClient(@BindBean("p") ClientDto clientDto);




}
