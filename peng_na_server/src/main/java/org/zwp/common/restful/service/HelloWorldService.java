package org.zwp.common.restful.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author zwp zwp_java@163.com
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2017/10/4 0004 上午 7:44
 */
@Path("/helloworld")
public class HelloWorldService {
    @GET
    @Produces("text/plain")
    public String getHello() {
        return "hello word...";
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getHelloByid(final @PathParam("id") String id) {
        return "hello word..."+id;
    }
}
