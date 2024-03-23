INSERT INTO andress (country,city,street,number) VALUES ('USA','Los angeles', 'One Street',1111)
INSERT INTO client (last_name,name,andress_id) VALUES ('Etienne','Fernandez', 1);
INSERT INTO company (fiscal_number,name) VALUES (1111,'prueba');
INSERT INTO products (name, description, price) VALUES ('Teclado Mecanico RGB', 'Teclado Mecanico con luces RGB switches cherry red', 1000);
 
INSERT INTO products (name, description, price) VALUES ('Samsung Smart TV 55', 'Color optimizado para una imagen vibrante y realista gracias al potente Crystal Processor 4K', 3000);
 
INSERT INTO products (name, description, price) VALUES ('Audifono Bluetooth Sony', 'Audifono Bluetooth para smartphone', 770);
 
INSERT INTO products (name, description, price) VALUES ('Memoria Corsair 16GB DDR5', 'Memoria RAM optimizada para Juegos', 3700);
 
INSERT INTO products (name, description, price) VALUES ('Asus Nvidia RTX 4080TI', 'Tarjeta Grafica para juegos en 4k', 5000);
 
INSERT INTO products (name, description, price) VALUES ('CPU Intel Core i7-12700K', 'Alder Lake de 12 cores optimizados para multitareas', 5000);

INSERT INTO client (last_name,name,andress_id) VALUES ('Etienne','Fernandez', 1);

INSERT INTO factura (name,total,total_Items, client_Id, company_Id) VALUES ('Pc components',2000, 10,1,1);
INSERT INTO factura_producto (factura_id,product_id,quantity) VALUES (1,1,2),(1,2,3);

