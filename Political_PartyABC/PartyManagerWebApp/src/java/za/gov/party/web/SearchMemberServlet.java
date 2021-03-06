/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.party.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.gov.party.jaxrs.client.NewJerseyClient;

/**
 *
 * @author Lerato
 */
public class SearchMemberServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String id = request.getParameter("id");
        
        NewJerseyClient client = new NewJerseyClient();
        String memberJSON = client.find_JSON(String.class, id);
        String url = "";
        
        if("".equals(memberJSON)){
            url = "memberNotFound.jsp";
        }else{
            url = "member_outcome.jsp";
            request.setAttribute("member", memberJSON);
        }
        RequestDispatcher disp = request.getRequestDispatcher(url);
        disp.forward(request, response);
    }


}
