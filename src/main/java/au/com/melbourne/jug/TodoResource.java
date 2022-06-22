package au.com.melbourne.jug;

import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import io.smallrye.mutiny.Uni;
import javax.transaction.Transactional;

@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TodoResource {

    @GET
    public Uni<List<Todo>> todos() {
        return Todo.listAll();
    }
    
    @POST
    @RolesAllowed("user")
    @Transactional
    public void addTodo(Todo todo){
        todo.persistAndFlush();
    }
    
}