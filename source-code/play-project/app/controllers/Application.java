package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import java.util.Map;
import java.util.Arrays;

import models.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result test() {
        return ok(test.render());
    }
}
