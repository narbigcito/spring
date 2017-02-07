
package mx.sisu.challengeajax;


import mx.sisu.challengueajax.entities.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gibran
 */

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

   
}
