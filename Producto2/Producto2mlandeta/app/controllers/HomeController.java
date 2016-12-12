package controllers;

import java.util.List;

import models.Restaurante;
import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
    	List<Restaurante> restaurantes1 = Restaurante.listadoBebidas();
        return ok(index.render(Restaurante.listadoBebidas()));
    }

}