package fca.suayed.resources;

import fca.suayed.dal.StoreDal;
import fca.suayed.dto.ClientDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

@Path("/clients")
public class ClientsResource {  // <-- ¡Corrige la mayúscula inicial aquí!

    @Inject
    StoreDal storeDal;

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Get all clients")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON)),
    })
    public Response getClients() {
        var responseDto = storeDal.getClients();  // <-- método debe ser getClients() (mayúscula C)
        return Response.ok(responseDto).build();
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Add a new client")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON)),
    })
    public Response registerUser(ClientDto clientDto) {  // <-- ¡Corrige el nombre del parámetro y tipo!
        storeDal.addClient(clientDto);  // <-- aquí solo insertas; no necesitas retornar nada complejo
        return Response.ok().build();
    }
}
