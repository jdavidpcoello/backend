package hn.unah.proyecto.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import hn.unah.proyecto.entidades.Mensajes;
// import hn.unah.proyecto.dto.UsuarioChatsDTO;
import hn.unah.proyecto.entidades.UsuariosChats;
import hn.unah.proyecto.entidades.UsuariosChatsId;



@Repository
public interface UsuarioChatsRepository extends JpaRepository<UsuariosChats,UsuariosChatsId> {
    
    @Query("SELECT e FROM UsuariosChats e WHERE e.codigoChat = :codigoChat")
    public UsuariosChats findByCodigoChat(@Param("codigoChat") int codigoChat);

    List<UsuariosChats> findByIdCodigoUsuario(int codigoUsuario);

//     @Query("SELECT new hn.unah.proyecto.dto.ChatDTO(m.codigoChat, u.nombre, u.apellidos, u.fotoPerfil, u.titular, m.fechaMensaje) " +
//     "FROM Mensajes m " +
//     "JOIN m.emisor u " +
//     "WHERE m.receptor.codigo = :codigoReceptor " +
//     "ORDER BY m.fechaMensaje DESC")
// List<UsuarioChatsDTO> findChatsDTOByReceptor(@Param("codigoReceptor") int codigoReceptor);

}
    

 