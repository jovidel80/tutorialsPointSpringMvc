package com.tutorialspoint.app.web;

import com.tutorialspoint.app.service.ProductManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jose on 19/03/2017.
 */
@Controller
public class InventoryController {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private ProductManager productManager;

    @RequestMapping(value = "/hello.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String now = LocalDateTime.now().toString();
        logger.info("Returning hello view with " + now);

        Map<String, Object> myModel = new HashMap<>();
        myModel.put("now", now);
        myModel.put("products", this.productManager.getProducts());

        return new ModelAndView("hello", "model", myModel);
    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }

}
