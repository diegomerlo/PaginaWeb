package logg;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;
import java.util.Date;

public class InsertarUsuarios {
    public static void insertarUsuario(String gmail, String contrasena, String nombre, String apellido1) {
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        
        if (cx != null) {
            try {
                int id = 0;
                String apellido2 = null;
                String apellido3 = null;
                
                String query = "INSERT INTO Usuarios (ID_U, Gmail, Contraseña, Nombre, Apellido1, Apellido2, Apellido3) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = cx.prepareStatement(query);
                statement.setInt(1, id);
                statement.setString(2, gmail);
                statement.setString(3, contrasena);
                statement.setString(4, nombre);
                statement.setString(5, apellido1);
                statement.setString(6, apellido2);
                statement.setString(7, apellido3);
                
                int filasInsertadas = statement.executeUpdate();
                if (filasInsertadas > 0) {
                    System.out.println("Datos insertados exitosamente.");
                } else {
                    System.out.println("No se pudieron insertar los datos.");
                }
                
                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static boolean verificarCredenciales(String gmail, String contrasena) {
    	Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        
        if (cx != null) {
            try {
                String query = "SELECT COUNT(*) FROM Usuarios WHERE Gmail = ? AND Contraseña = ?";
                PreparedStatement statement = cx.prepareStatement(query);
                statement.setString(1, gmail);
                statement.setString(2, contrasena);
                
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0; // Si hay al menos un registro con esas credenciales, retorna true
                }
                
                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return false;
    }
    
    public String obtenerNombreApellido(String gmail) {
        String nombreApellido = null;
        
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        
        if (cx != null) {
            try {
                String query = "SELECT Nombre FROM Usuarios WHERE Gmail = ?";
                PreparedStatement statement = cx.prepareStatement(query);
                statement.setString(1, gmail);
                
                ResultSet resultSet = statement.executeQuery();
                
                if (resultSet.next()) {
                    nombreApellido = resultSet.getString("Nombre");
                }
                
                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return nombreApellido;
    }
    
    public static void insertarRegistro(int idVehiculo) {
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();

        if (cx != null) {
            try {
            	
                int ID_R=0;
                int Usuario=1;
                idVehiculo=1;
               
             

                String query = "INSERT INTO Registros (ID_R, Usuario, Vehiculo) VALUES (?, ?, ?)";
                PreparedStatement statement = cx.prepareStatement(query);
                
                statement.setInt(1, ID_R);
                statement.setInt(2, Usuario);
                statement.setInt(3, idVehiculo);
                
              
                int filasInsertadas = statement.executeUpdate();
                if (filasInsertadas > 0) {
                    System.out.println("Registro insertado exitosamente.");
                } else {
                    System.out.println("No se pudo insertar el registro.");
                }

                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static int obtenerUltimoIDRegistro() {
        // Implementa aquí la lógica para obtener el último ID de la tabla Registros
        return 0; // Retorna el valor obtenido
    }
    
    
    
    public static int obtenerCantidadLikes(int idVehiculo) {
        Conexion conexion = new Conexion();
        Connection cx = conexion.conectar();
        
        int cantidadLikes = 0;

        if (cx != null) {
            try {
                String query = "SELECT COUNT(*) FROM Registros WHERE Vehiculo = ?";
                PreparedStatement statement = cx.prepareStatement(query);
                statement.setInt(1, idVehiculo);
                
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    cantidadLikes = resultSet.getInt(1);
                }
                
                statement.close();
                conexion.desconectar();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return cantidadLikes;
    }

}
