package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/ex/foos", method = RequestMethod.GET)
    @ResponseBody
    public String getFoosBySimplePath() {
        return "Get some Foos";
    }

    @RequestMapping(value = "/ex/foos", method = RequestMethod.POST)
    @ResponseBody
    public String postFoos() {
        return "Post some Foos";
    }
    
    @RequestMapping(value = "/ex/foos", headers = "key=val", method = RequestMethod.GET)
    @ResponseBody
    public String getFoosWithHeader() {
        return "xxx";
    }

    @RequestMapping(
    value = "/ex/foos", 
    headers = { "key1=val1", "key2=val2" }, method = RequestMethod.GET) // both headers must match 
    @ResponseBody
    public String getFoosWithHeaders() {
        return "Get some Foos with Header 2";
    }

    @RequestMapping(value = "/ex/foos/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getFoosBySimplePathWithPathVariable(
    @PathVariable("id") long id) {
        return "Get a specific Foo with id=" + id;
    }

    @RequestMapping(value = "/ex/foos/{fooid}/bar/{barid}", method = RequestMethod.GET)
    @ResponseBody
    public String getFoosBySimplePathWithPathVariables(
        @PathVariable long fooid, @PathVariable long barid) {
        return "Get a specific Bar with id=" + barid + 
        " from a Foo with id=" + fooid;
    }
}